package s_concurrency.b_RaceCondition.f_PutIfAbsent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class PutIfAbsent {
    static AtomicInteger computeCount = new AtomicInteger();

    static String compute(String k) {
        computeCount.incrementAndGet();
        Thread.yield(); // 관측 시점과 행동 시점 간의 시간 차이 발생.
        return k + "-값";
    }

    static void main(String[] args) throws InterruptedException {
        //Map<String, String> map = new ConcurrentHashMap<>();
        //Runnable task = () -> map.computeIfAbsent("user", PutIfAbsent::compute);

        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
        Runnable task = () -> {
            if (!map.containsKey("user")) // Check
                map.put("user", compute("user")); // Act
        };

        Thread A = new Thread(task);
        Thread B = new Thread(task);

        A.start(); B.start();
        A.join(); B.join();

        System.out.printf("기대값: 1, compute 호출: %d회%n", computeCount.get());
        System.out.println(map);
    }
}
