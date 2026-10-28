package s_concurrency.a_Thread.o_NonDaemonThread;

public class NonDaemonKeepsAlive {
    static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("non-daemon finished after main ended");
        });
        t.start();
        System.out.println("main ends");
    }
}
