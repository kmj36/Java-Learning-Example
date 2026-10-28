package s_concurrency.a_Thread.p_ThreadFinally;

public class DaemonAbandoned {
    static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("daemon done");
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            } finally {
                System.out.println("finally");
            }
        });

        t.setDaemon(true);
        t.start();

        Thread.sleep(500);
        System.out.println("main ends");
    }
}
