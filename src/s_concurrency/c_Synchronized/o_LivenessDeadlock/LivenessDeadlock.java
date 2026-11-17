package s_concurrency.c_Synchronized.o_LivenessDeadlock;

class DeadlockClass {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    void run() {
        new Thread(() -> {
            synchronized (lockA) {
                System.out.println("t1: A 획득, B 대기");
                pause();
                synchronized (lockB) { System.out.println("t1: B 획득"); }
            }
        }).start();

        new Thread(() -> {
            synchronized (lockB) {                  // t1과 반대 순서
                System.out.println("t2: B 획득, A 대기");
                pause();
                synchronized (lockA) { System.out.println("t2: A 획득"); }
            }
        }).start();
    }

    private static void pause() {                   // 상대가 두 번째 락을 잡을 시간
        try { Thread.sleep(100); } catch (InterruptedException _) { }
    }
}

public class LivenessDeadlock {
    static void main(String[] args) {
        new DeadlockClass().run();
    }
}
