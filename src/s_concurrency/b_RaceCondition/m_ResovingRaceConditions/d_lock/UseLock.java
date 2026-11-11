package s_concurrency.b_RaceCondition.m_ResovingRaceConditions.d_lock;

import java.util.concurrent.atomic.AtomicInteger;

class BankClient {
    public static AtomicInteger balance = new AtomicInteger(100);
    private static final Object lock = new Object();

    public static void withdraw(int amount) {
        synchronized (lock) {
            if(balance.get() > 0) { // check
                Thread.yield(); // 확인 시점과, 행동 시점 간의 시간 차이 발생.
                balance.addAndGet(-amount); // act
            }
        }
    }
}

public class UseLock {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            BankClient.withdraw(100);
            System.out.printf("[%s]: 계좌 잔액: %d%n", Thread.currentThread().getName(), BankClient.balance.get());
        };

        Thread A = new Thread(task);
        Thread B = new Thread(task);
        Thread C = new Thread(task);

        A.start(); B.start(); C.start();
        A.join(); B.join(); C.join();
        System.out.printf("기대값: 0, 잔액: %d%n", BankClient.balance.get());
    }
}
