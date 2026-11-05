package s_concurrency.b_RaceCondition.m_ResovingRaceConditions;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    // private volatile int count = 0; // 6 순위: 가시성만 보장
    // private final AtomicInteger count = new AtomicInteger(); // 3 순위: 원자 클래스
    // private final int count = 300000; // 1 순위: 불변 객체
    // private final ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>(); // 4 순위: 동시성 컬렉션의 원자 메서드

    void inc() {
        count++;
        //count.addAndGet(1);
        //map.merge("count", 1, Integer::sum); // 4 순위: 읽기-계산-쓰기를 맵이 원자적으로 처리
    }
    // synchronized void inc() {count++;} 5 순위: 동기화

    public int getCount() {
        return count;
        //return map.getOrDefault("count", 0); // 4 순위
    }
}

public class Resolve {
    static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        // ReentrantLock lock = new ReentrantLock(); 5 순위: 락 사용

        Runnable task = () -> {
            // ThreadLocal<Integer> sum = new ThreadLocal<>(); // 2 순위: 스레드 한정
            // int count;

            for (int i = 0; i < 100_000; i++) {
                //lock.lock();
                c.inc();
                //lock.unlock();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start(); t2.start(); t3.start();
        t1.join(); t2.join(); t3.join();

        System.out.println("결과: " + c.getCount());
    }
}
