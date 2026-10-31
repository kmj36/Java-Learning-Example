package s_concurrency.b_RaceCondition.b_RaceConditionWithoutDataRace;

import java.util.concurrent.atomic.AtomicInteger;

public class RaceConditionWithoutDataRace {
    static final AtomicInteger balance = new AtomicInteger(100); // 원자성

    static void withdraw(int amount) {
        if (balance.get() >= amount) { // check (synchronization action)
            balance.addAndGet(-amount); // act (synchronization action)
        }
    }

    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> withdraw(100);

        for (int i = 0; i < 100000; i++) {
            balance.set(100);

            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);
            // 순서 A:  t1.get(100) → t1.add(-100) → t2.get(0)   → (T2 조건 실패)    → 결과 0
            // 순서 B:  t1.get(100) → t2.get(100) → t1.add(-100) → T2.add(-100)     → 결과 -100

            t1.start(); t2.start();
            t1.join(); t2.join();

            if (balance.get() < 0) {
                System.out.println("재현 성공: 시도 " + i + ", 잔액 = " + balance.get());
                return;
            }
        }
        System.out.println("재현 실패");
    }
}
