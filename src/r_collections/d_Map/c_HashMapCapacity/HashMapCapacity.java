package r_collections.d_Map.c_HashMapCapacity;

import java.util.HashMap;
import java.util.Map;

public class HashMapCapacity {
    static void main(String[] args) throws Exception {
        Map<String, Integer> map = new HashMap<>(2); // map capacity = 2
        map.put("key1", 1); // capacity: 2 threshold: 1 size: 1
        map.put("key2", 2); // capacity: 4 threshold: 3 size: 2
        map.put("key3", 3); // capacity: 4 threshold: 3 size: 3
        map.put("key4", 4); // capacity: 8 threshold: 6 size: 4

        System.out.printf("size: %d, map : %s", map.size(), map);
    }
}
