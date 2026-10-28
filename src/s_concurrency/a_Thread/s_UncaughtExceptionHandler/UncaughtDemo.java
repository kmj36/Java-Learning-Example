package s_concurrency.a_Thread.s_UncaughtExceptionHandler;

public class UncaughtDemo {
    static void main(String[] args) throws InterruptedException {
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println("[Default]: " + t.getName() + " -> " + e.getMessage());
        });

        Thread t1 = new Thread(() -> {
            throw new IllegalStateException("t1 실패");
        }, "worker-1");

        Thread t2 = new Thread(() -> {
            throw new RuntimeException("t2 실패");
        }, "worker-2");

        t2.setUncaughtExceptionHandler((t, e) -> {
            System.out.println("[Per-thread]: " + t.getName() + " -> " + e.getMessage());
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("main 정상 종료");
    }
}
