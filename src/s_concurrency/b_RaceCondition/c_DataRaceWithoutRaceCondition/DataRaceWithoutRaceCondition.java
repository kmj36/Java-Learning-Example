package s_concurrency.b_RaceCondition.c_DataRaceWithoutRaceCondition;

public class DataRaceWithoutRaceCondition {
    static void main(String[] args) throws InterruptedException {
        for (int round = 0; round < 100_000; round++) {
            String str = new String(("key-" + round).toCharArray());
            int expected = ("key-" + round).hashCode();

            System.out.printf("str: %s, expected: 0x%08x%n", str, expected);

            int[] results = new int[4];
            Thread[] ts = new Thread[4];

            for (int i = 0; i < 4; i++) {
                final int idx = i;
                ts[i] = new Thread(() -> results[idx] = str.hashCode());
                ts[i].start();
            }
            for (Thread t : ts) t.join();

            for (int r : results) {
                System.out.printf("result: 0x%08x%n", r);
                if (r != expected)
                    throw new IllegalStateException("round " + round + ": " + r);
            }
        }
        System.out.println("모든 라운드 일치");
    }
}
