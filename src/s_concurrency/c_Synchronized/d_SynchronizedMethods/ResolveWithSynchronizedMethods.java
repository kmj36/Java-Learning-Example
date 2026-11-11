package s_concurrency.c_Synchronized.d_SynchronizedMethods;

class Worker implements Runnable {
    private boolean stopped;
    int i;

    public synchronized void stop() { stopped = true; } // 쓰기에 동기화 적용
    public synchronized boolean isStopped() { return stopped; } // 읽기에 동기화 적용

    @Override
    public void run() {
        System.out.printf("[%s]: 스레드 시작.%n", Thread.currentThread().getName());
        while (!isStopped()) { // JIT 최적화 방지를 위해 메서드 호출식으로 변경 (언제든 바뀔 수 있다고 암시)
            i++;
        }
        System.out.printf("[%s]: 합산 결과: %d %n", Thread.currentThread().getName(), i);
        System.out.printf("[%s]: 스레드 종료.%n", Thread.currentThread().getName());
    }
}

public class ResolveWithSynchronizedMethods {
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
