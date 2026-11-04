package s_concurrency.b_RaceCondition.l_NotRaceConditions.a_Deadlock;

public class DeadLockDemo {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("t1: lockA 획득, lockB 대기");
                sleep(100);                 // t2가 lockB를 잡을 시간을 줌
                synchronized (lockB) {
                    System.out.println("t1: lockB 획득");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB) {          // t1과 반대 순서로 락 획득
                System.out.println("t2: lockB 획득, lockA 대기");
                sleep(100);
                synchronized (lockA) {
                    System.out.println("t2: lockA 획득");
                }
            }
        });

        t1.start();
        t2.start();
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}