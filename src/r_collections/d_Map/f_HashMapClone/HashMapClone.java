package r_collections.d_Map.f_HashMapClone;

import java.util.HashMap;
import java.util.Map;

public class HashMapClone {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(Map.of(
                "key1", 1,
                "key2", 2,
                "key3", 3
        ));

        HashMap<String, Integer> copy = (HashMap<String, Integer>) map.clone();

        System.out.printf("[map  0x%08x] : %s %n", map.hashCode(), map);
        System.out.printf("[copy 0x%08x] : %s %n", copy.hashCode(), copy);
    }
}
