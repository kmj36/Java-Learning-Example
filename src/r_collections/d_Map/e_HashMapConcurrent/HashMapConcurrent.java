package r_collections.d_Map.e_HashMapConcurrent;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcurrent {
    static void main(String[] args) {
        Map<Integer, Integer> unsafeMap = new HashMap<>();
        Runnable writer = () -> {
            for (int i = 0; i < 10_000; i++) {
                unsafeMap.put(i, i);
            }
        };
        Thread t1 = new Thread(writer);
        Thread t2 = new Thread(writer);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("unsafeMap size (Maybe 10000): " + unsafeMap.size());
    }
}