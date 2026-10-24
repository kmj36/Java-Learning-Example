package s_concurrency.a_Thread.h_ThreadJoin;

public class ThreadJoin {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+" Interrupted.");
            }
        };

        Thread th1 = new Thread(task, "Thread-0");
        Thread th2 = new Thread(task, "Thread-1");
        Thread th3 = new Thread(task, "Thread-2");
        Thread th4 = new Thread(task, "Thread-3");
        Thread th5 = new Thread(task, "Thread-4");

        th1.start();
        th1.join(1000);

        th2.start();
        th2.join(1000);

        th3.start();
        th3.join(1000);

        th4.start();
        th4.join(1000);

        th5.start();
        th5.join(1000);

        th1.interrupt();
        th2.interrupt();
        th3.interrupt();
        th4.interrupt();
        th5.interrupt();
    }
}
