package s_concurrency.b_RaceCondition.l_NotRaceConditions.c_LockLeak;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockLeak {
    private static final Lock lock = new ReentrantLock();
    private static int count = 0;

    static void increment(boolean fail) {
        lock.lock();
        count++;
        if (fail) throw new RuntimeException("작업 실패");
        lock.unlock(); // 예외가 나면 여기까지 오지 못함
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            try { increment(true); }
            catch (RuntimeException e) { System.out.println("t1 예외: " + e.getMessage()); }
        });
        Thread t2 = new Thread(() -> increment(false));

        t1.start(); t1.join();   // t1은 락을 쥔 채 종료
        t2.start(); t2.join();   // t2는 lock()에서 영원히 대기
        System.out.println("끝: " + count); // 출력되지 않음
    }
}