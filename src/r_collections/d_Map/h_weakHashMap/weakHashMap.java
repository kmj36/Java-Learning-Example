package r_collections.d_Map.h_weakHashMap;

import java.util.Map;
import java.util.WeakHashMap;

public class weakHashMap {
    static void main(String[] args) throws InterruptedException {
        Map<Object, String> map = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        map.put(key1, "value1");
        map.put(key2, "value2");

        System.out.println("GC 전 size: " + map.size()); // 2

        key1 = null;

        System.gc();
        Thread.sleep(200);

        System.out.println("GC 후 size: " + map.size()); // 1
        System.out.println("남은 내용: " + map);
    }
}
