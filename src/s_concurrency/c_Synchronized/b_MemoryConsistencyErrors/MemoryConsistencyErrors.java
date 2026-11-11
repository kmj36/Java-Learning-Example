package s_concurrency.c_Synchronized.b_MemoryConsistencyErrors;

class Worker implements Runnable {
    private boolean stopped;
    int n;

    void stop() { stopped = true; }

    @Override
    public void run() {
        System.out.printf("[%s] : 스레드 시작.%n", Thread.currentThread().getName());
        while (!stopped) {
            n++;
        }
        System.out.printf("[%s] : 스레드 종료.%n", Thread.currentThread().getName());
    }
}

public class MemoryConsistencyErrors {
    public static void main(String[] args) throws InterruptedException {
        Worker j1 = new Worker();
        Worker j2 = new Worker();

        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j2);

        t1.start(); t2.start();

        Thread.sleep(2000);
        j1.stop();
        j2.stop();

        t1.join(5000); t2.join(5000);
        t1.interrupt(); t2.interrupt();

        System.out.println("t1, t2 스레드 강제 종료 시도.");
    }
}
