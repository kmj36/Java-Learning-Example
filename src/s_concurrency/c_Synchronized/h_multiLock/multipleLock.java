package s_concurrency.c_Synchronized.h_multiLock;

class Counters {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    int a = 0;
    int b = 0;

    // 한쪽만 다루는 연산은 기존처럼 개별 락만 사용
    void incA() { synchronized (lockA) { a++; } }

    // 둘 다 다루는 연산: 항상 A → B
    void moveAtoB(int n) {
        synchronized (lockA) { synchronized (lockB) { a -= n; b += n; } }
    }
    void moveBtoA(int n) {
        synchronized (lockA) { synchronized (lockB) { b -= n; a += n; } }
    }
    int sum() {
        synchronized (lockA) { synchronized (lockB) { return a + b; } }
    }

    void print() {
        System.out.printf("[%s]: a + b = %d%n", Thread.currentThread().getName(), sum());
    }
}

public class multipleLock {
    static void main(String[] args) throws InterruptedException {
        Counters c = new Counters();

        Thread thread_inc = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) {
                c.incA();
            }
        }, "Thread-incA");
        Thread thread_moveAtoB = new Thread(() -> {
            for (int i = 0; i < 50_000; i++) {
                c.moveAtoB(i);
            }
        }, "Thread-moveAtoB");
        Thread thread_moveBtoA = new Thread(() -> {
            for (int i = 0; i < 50_000; i++) {
                c.moveBtoA(i);
            }
        }, "Thread-moveBtoA");

        Thread thread_print = new Thread(c::print, "Thread-print");

        thread_inc.start();
        thread_moveAtoB.start();
        thread_moveBtoA.start();

        thread_inc.join();
        thread_moveAtoB.join();
        thread_moveBtoA.join();

        // 무결성: 최종 값이 100,000 이어야 하며 값이 소실되어선 안됨.
        thread_print.start();
    }
}
