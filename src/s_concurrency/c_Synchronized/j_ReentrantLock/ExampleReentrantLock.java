package s_concurrency.c_Synchronized.j_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class Example {
    ReentrantLock lock = new ReentrantLock();
    int num = 0;

    void IncrementWithManualLock() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            num++;
        } finally {
            lock.unlock();
        }
    }

    synchronized void DecrementWithAutoLock() {
        num--;
    }
}

public class ExampleReentrantLock {
    static void main(String[] args) throws InterruptedException {
        Example c = new Example();

        Runnable up = () -> {
            String threadName = Thread.currentThread().getName();

            System.out.printf("[%s]: num 값 증가.%n", threadName);
            for (int i = 0; i < 100_000; i++) {
                try {
                    c.IncrementWithManualLock();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.printf("[%s]: num 작업 완료.%n", threadName);
        };
        Thread up1 = new Thread(up, "Thread-up1");
        Thread up2 = new Thread(up, "Thread-up2");
        Thread up3 = new Thread(up, "Thread-up3");

        up1.start(); up2.start(); up3.start();
        up1.join(); up2.join(); up3.join();
        System.out.println();

        Runnable down = () -> {
            String threadName = Thread.currentThread().getName();

            System.out.printf("[%s]: num 값 감소.%n", threadName);
            for (int i = 0; i < 100_000; i++) c.DecrementWithAutoLock();
            System.out.printf("[%s]: num 작업 완료.%n", threadName);
        };
        Thread down1 = new Thread(down, "Thread-down1");
        Thread down2 = new Thread(down, "Thread-down2");
        Thread down3 = new Thread(down, "Thread-down3");

        down1.start(); down2.start(); down3.start();
        down1.join(); down2.join(); down3.join();

        System.out.printf("기대값: 0, 결과값: %d%n", c.num);
    }
}
