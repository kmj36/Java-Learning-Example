package s_concurrency.a_Thread.b_CreateThreadWithRunnable;

public class CreateThreadWithRunnable {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("run by " + Thread.currentThread().getName());

        Thread[] th = new Thread[5];
        for (int i = 0; i < th.length; i++)
            th[i] = new Thread(task, "worker-"+(i+1));

        for (Thread thread : th) thread.start();
        for (Thread thread : th) thread.join();
    }
}
