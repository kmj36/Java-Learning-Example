package s_concurrency.a_Thread.g_ThreadSynchronizedSleep;

import java.util.concurrent.atomic.AtomicReference;

public class ThreadSynchronizedSleep {
    static final Object LOCK = new Object();

    static void main(String[] args) throws InterruptedException {
        AtomicReference<Integer> num = new AtomicReference<>(0);

        Runnable task = () -> {
            synchronized (LOCK) {
                try {
                    num.getAndSet(num.get() + 1);
                    System.out.println(num);

                    System.out.println("Thread-0 synchronized sleep");
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread th = new Thread(task);

        th.start();
        synchronized (LOCK) {
            num.getAndSet(num.get() - 1);
            System.out.println(num);

            System.out.println("Main synchronized sleep");
            Thread.sleep(3000);
        }
    }
}
