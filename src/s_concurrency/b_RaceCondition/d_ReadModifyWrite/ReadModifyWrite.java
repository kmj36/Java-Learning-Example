package s_concurrency.b_RaceCondition.d_ReadModifyWrite;

class ReadModifyWriteRaceCondition {
     private int count;

     public void increment() {
         count++; // 실제로는 읽기 -> 더하기 -> 쓰기 3단계 동작.
     }

    public int getCount() {
        return count;
    }
}

public class ReadModifyWrite {
    static void main(String[] args) throws InterruptedException {
        ReadModifyWriteRaceCondition c = new ReadModifyWriteRaceCondition();

        Runnable task = () -> {
            for(int i = 0; i < 100_000; i++)
                c.increment();
        };

        Thread A = new Thread(task);
        Thread B = new Thread(task);

        A.start();
        B.start();

        A.join();
        B.join();

        System.out.printf("[Read-Modify-Write] 기대값: 200000, 실제값: %d", c.getCount());
    }
}
