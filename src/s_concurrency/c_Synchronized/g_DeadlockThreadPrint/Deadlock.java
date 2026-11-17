package s_concurrency.c_Synchronized.g_DeadlockThreadPrint;

class ProblemClass {
    private static final Object LOCKA = new Object();
    private static final Object LOCKB = new Object();

    void run() {
        new Thread(() -> {
            System.out.printf("[%s]: LOCKA 확보 시도.%n", Thread.currentThread().getName());
            synchronized (LOCKA) {
                System.out.printf("[%s]: LOCKA 확보됨.%n", Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                    System.out.printf("[%s]: LOCKB 확보 시도.%n", Thread.currentThread().getName());
                    synchronized (LOCKB) {
                        System.out.printf("[%s]: LOCKB 확보됨.%n", Thread.currentThread().getName());
                        System.out.printf("[%s]: 작업 완료.%n", Thread.currentThread().getName());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "t1").start();
        new Thread(() -> {
            System.out.printf("[%s]: LOCKB 확보 시도.%n", Thread.currentThread().getName());
            synchronized (LOCKB) {
                System.out.printf("[%s]: LOCKB 확보됨.%n", Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                    System.out.printf("[%s]: LOCKA 확보 시도.%n", Thread.currentThread().getName());
                    synchronized (LOCKA) {
                        System.out.printf("[%s]: LOCKA 확보됨.%n", Thread.currentThread().getName());
                        System.out.printf("[%s]: 작업 완료.%n", Thread.currentThread().getName());
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "t2").start();
    }
}

public class Deadlock {
    static void main(String[] args) {
        ProblemClass c = new ProblemClass();
        c.run();
    }
}
