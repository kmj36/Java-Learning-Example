package s_concurrency.b_RaceCondition.m_ResovingRaceConditions.c_InitializationOnDemandHolder;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

class HolderSingleton {
    private HolderSingleton() {
        System.out.println("HolderSingleton 생성: " + Thread.currentThread().getName());
    }

    private static class Holder {
        static final HolderSingleton instance = new HolderSingleton(); // Thread Safe, 초기화 락 지원.
    }

    public static HolderSingleton getInstance() {
        return Holder.instance;
    }
}

public class InitializationOnDemandHolder {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch start = new CountDownLatch(1);
        Set<Integer> ids = ConcurrentHashMap.newKeySet();

        Runnable task = () -> {
            try {
                start.await();
                HolderSingleton instance = HolderSingleton.getInstance();

                System.out.printf("[%s] Singleton 호출: %s%n", Thread.currentThread().getName(), instance);
                ids.add(System.identityHashCode(instance));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start(); t2.start(); t3.start();
        start.countDown();
        t1.join(); t2.join(); t3.join();

        System.out.println("싱글톤 인스턴스 수: " + ids.size());
    }
}
