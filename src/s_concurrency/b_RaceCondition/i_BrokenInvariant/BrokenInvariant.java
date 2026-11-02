package s_concurrency.b_RaceCondition.i_BrokenInvariant;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

class NumberRange {
    private final AtomicInteger lower = new AtomicInteger(0);
    private final AtomicInteger upper = new AtomicInteger(10);

    public void setLower(int i) {
        if (i > upper.get()) // check
            throw new IllegalArgumentException("lower > upper");
        lower.set(i); // act
    }

    public void setUpper(int i) {
        if (i < lower.get()) // check
            throw new IllegalArgumentException("upper < lower");
        upper.set(i); // act
    }

    public int[] violation() {
        int l = lower.get();
        int u = upper.get();
        return l > u ? new int[]{l, u} : null;
    }

    public boolean isValid() {
        return violation() == null;
    }
}

public class BrokenInvariant {
    static void main(String[] args) throws InterruptedException {
       NumberRange r = new NumberRange();
       AtomicBoolean stop = new AtomicBoolean(false);
       AtomicInteger violations = new AtomicInteger();

       Thread a = new Thread(() -> {
           while(!stop.get()) {
               try {
                   r.setLower(5);
                   r.setLower(0);
               } catch (IllegalArgumentException _) {};
           }
       });
       Thread b = new Thread(() -> {
           while(!stop.get()) {
               try {
                   r.setUpper(4);
                   r.setUpper(10);
               } catch (IllegalArgumentException _) {};
           }
       });
       Thread checker = new Thread(() -> {
           final int MAX_LOG = 5;
           while (!stop.get()) {
               int[] v = r.violation();
               if (v != null) {
                   int n = violations.incrementAndGet();
                   if (n <= MAX_LOG)
                       System.out.printf("[Broken Invariant #%d] lower=%d > upper=%d%n", n, v[0], v[1]);
               }
           }
       });

        checker.start();
        a.start(); b.start();

        Thread.sleep(3_000);
        stop.set(true);

        a.join(); b.join(); checker.join();
        System.out.println("관측된 위반 횟수: " + violations.get());
        System.out.println("최종 상태 유효? " + r.isValid());
    }
}
