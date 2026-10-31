package s_concurrency.b_RaceCondition.a_RaceConditionBasic;

public class RaceConditionDemo {
    private static int count = 0;

    private static void increment() {
        count++;
    }

    static void main(String[] args) throws InterruptedException {
        for (int trial = 1; trial <= 5; trial++) {
            count = 0;

            Runnable task = () -> {
                for (int i = 0; i < 100_000; i++) RaceConditionDemo.increment();
            };

            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.printf("시도 %d: count = %d (기대값: 200,000)%n", trial, RaceConditionDemo.count);
        }
    }
}
