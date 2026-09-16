package r_collections.d_Map.d_HashMapIterator;

import java.util.Map;
import java.util.HashMap;

public class hashMapIterator {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        map.put("key3", 3);

        try {
            for (String key : map.keySet()) {
                if (key.equals("key2")) {
                    map.remove(key); // for-each 도중 직접 remove -> modCount 불일치
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
            throw new RuntimeException(e);
        }
    }
}
