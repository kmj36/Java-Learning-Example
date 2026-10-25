package s_concurrency.a_Thread.l_ThreadPriority;

public class ThreadPriority {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 100; i++)
                System.out.println(Thread.currentThread().getName() + ": " + i);
        };
        Thread t1 = new Thread(task, "t1");
        Thread t2 = new Thread(task, "t2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
