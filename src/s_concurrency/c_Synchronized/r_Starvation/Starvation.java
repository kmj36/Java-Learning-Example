package s_concurrency.c_Synchronized.r_Starvation;

import java.time.Duration;
import java.time.Instant;

class StarvationTask {
    private final Object lock = new Object();

    public void run() throws InterruptedException {
        Thread greedy = new Thread(() -> {
            String ThreadName = Thread.currentThread().getName();

            while (true) synchronized (lock) {
                System.out.printf("[%s]: lock 획득.%n", ThreadName);
                busy(2000);
                System.out.printf("[%s]: lock 해제.%n", ThreadName);
            }
        }, "Greedy");

        Thread victim = new Thread(() -> {
            String ThreadName = Thread.currentThread().getName();

            while (true) {
                Instant start = Instant.now();
                System.out.printf("[%s]: lock 대기 시작.%n", ThreadName);
                synchronized (lock) {
                    Instant end = Instant.now();
                    System.out.printf("[%s]: lock 획득 대기시간: %d.%n", ThreadName, Duration.between(start, end).getSeconds());
                }
            }

        }, "Victim");

        greedy.start();

        Thread.sleep(300);

        victim.start();
    }

    private void busy(long ms) {
        long end = System.nanoTime() + ms * 1_000_000;
        while (System.nanoTime() < end) { }
    }
}

public class Starvation {
    public static void main(String[] args) throws InterruptedException {
        StarvationTask task = new StarvationTask();
        task.run();
    }
}
