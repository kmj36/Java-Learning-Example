package s_concurrency.a_Thread.e_ThreadState;

public class ThreadState {
    static final Object LOCK = new Object();

    static void main(String[] args) throws InterruptedException {
        Thread helper = new Thread(() -> sleep(2000));

        Thread t = new Thread(() -> {
            long end = System.currentTimeMillis() + 500;
            while (System.currentTimeMillis() < end) { }    //    0~500ms   RUNNABLE
            synchronized (LOCK) { }                         //  500~750ms   BLOCKED       (main이 LOCK 보유)
            sleep(500);                                     //  750~1250ms  TIMED_WAITING (sleep)
            join(helper);                                   // 1250~2000ms  WAITING       (join)
        });

        print(t); // NEW

        helper.start();
        synchronized (LOCK) {
            t.start();
            Thread.sleep(250);  print(t);   // RUNNABLE
            Thread.sleep(500);  print(t);   // BLOCKED
        }                                   // LOCK 해제
        Thread.sleep(250);  print(t);       // TIMED_WAITING
        Thread.sleep(500);  print(t);       // WAITING

        t.join();
        print(t);                           // TERMINATED
    }

    static void print(Thread t) {
        System.out.println(t.getState());
    }

    static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { throw new RuntimeException(e); }
    }

    static void join(Thread t) {
        try { t.join(); } catch (InterruptedException e) { throw new RuntimeException(e); }
    }
}