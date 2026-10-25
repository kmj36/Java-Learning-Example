package s_concurrency.a_Thread.i_yield;

public class ThreadYield {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== yield 없음 ===");
        run(false);

        System.out.println("=== yield 있음 ===");
        run(true);
    }

    static void run(boolean useYield) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                if (useYield) Thread.yield();   // "CPU 양보할 의향 있음" 힌트
            }
        };

        Thread a = new Thread(task, "A");
        Thread b = new Thread(task, "B");
        a.start();
        b.start();
        a.join();
        b.join();
    }
}