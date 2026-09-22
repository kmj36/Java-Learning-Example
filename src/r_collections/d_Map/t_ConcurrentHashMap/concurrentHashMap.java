package r_collections.d_Map.t_ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class concurrentHashMap {
    static void main(String[] args) throws InterruptedException {
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

        CountDownLatch startLatch = new CountDownLatch(1);
        AtomicInteger putCount = new AtomicInteger(0);

        Runnable task = () -> {
            try {
                startLatch.await();
                String result = map.putIfAbsent("key1", "Value from " + Thread.currentThread().getName());
                if(result == null)
                    putCount.incrementAndGet();

                System.out.printf("%s: %s %n", Thread.currentThread().getName(), result);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();

        startLatch.countDown();

        thread1.join();
        thread2.join();

        System.out.println("=== 최종 결과 ===");
        System.out.println("map: " + map);
        System.out.println("putCount: " + putCount.get());
    }
}
