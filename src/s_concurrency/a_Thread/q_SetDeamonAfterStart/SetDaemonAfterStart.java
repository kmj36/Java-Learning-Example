package s_concurrency.a_Thread.q_SetDeamonAfterStart;

public class SetDaemonAfterStart {
    static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t.start();
        t.setDaemon(true); // IllegalThreadStateException
    }
}
