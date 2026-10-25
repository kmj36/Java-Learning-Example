package s_concurrency.a_Thread.j_interrupt;

public class ThreadInterrupt {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException _) {
                System.out.printf("[%s] interrupt. %n", Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(task);

        t.start();
        t.join(1000);

        t.interrupt();
        if(t.isInterrupted())
            System.out.printf("[Main] %s Thread is interrupted. %n", t.getName());
    }
}
