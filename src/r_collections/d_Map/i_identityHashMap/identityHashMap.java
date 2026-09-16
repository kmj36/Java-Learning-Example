package r_collections.d_Map.i_identityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class identityHashMap {
    static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        String key3 = new String("key");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put(key1, 1);
        hashMap.put(key2, 2);
        hashMap.put(key3, 3);


        Map<String, Integer> identityMap = new IdentityHashMap<>();
        identityMap.put(key1, 1);
        identityMap.put(key2, 2);
        identityMap.put(key3, 3);

        System.out.println("HashMap size: " + hashMap.size()); // 1
        System.out.println("HashMap: " + hashMap);             // {key=3}

        System.out.println("IdentityHashMap size: " + identityMap.size()); // 3
        System.out.println("IdentityHashMap: " + identityMap);  // {key=1, key=2, key=3}
    }
}
