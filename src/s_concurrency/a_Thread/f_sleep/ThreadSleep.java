package s_concurrency.a_Thread.f_sleep;

import java.time.Duration;

public class ThreadSleep {
    static void main() throws InterruptedException {
        Thread th = new Thread(() -> {
            System.out.println("run by " + Thread.currentThread().getName());
            try {
                System.out.println("Thread-0 Sleep");
                Thread.sleep(Duration.ofSeconds(5));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });



        System.out.println("Main Sleep");
        Thread.sleep(5000);

        th.start();
        th.join();

        System.out.println("Main End.");
    }
}