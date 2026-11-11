package s_concurrency.c_Synchronized.c_Volatile;

class Worker implements Runnable {
    private volatile boolean stopped; // volatile 가시성 적용
    int i;

    void stop() { stopped = true; } // volatile 쓰기는 volatile 읽기 보다 항상 선행함.

    @Override
    public void run() {
        System.out.printf("[%s]: 스레드 시작.%n", Thread.currentThread().getName());
        while (!stopped) { // volatile 읽기는 volatile 쓰기 보다 후행 작업.
            i++;
        }
        System.out.printf("[%s]: 합산 결과: %d %n", Thread.currentThread().getName(), i);
        System.out.printf("[%s]: 스레드 종료.%n", Thread.currentThread().getName());
    }
}

public class ResolveWithVolatile {
    static void main(String[] args) throws InterruptedException {
        Worker j1 = new Worker();
        Worker j2 = new Worker();

        Thread t1 = new Thread(j1);
        Thread t2 = new Thread(j2);

        t1.start(); t2.start();
        t1.join(5000); t2.join(5000);

        System.out.printf("[Main]: Thread-0, Thread-1 강제 종료.%n");
        j1.stop(); j2.stop();
    }
}
