package r_collections.d_Map.a_NewMap;

import java.security.KeyPair;
import java.util.Map;
import java.util.HashMap;

public class newMap {
    static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        ages.put("Mike", 44);
        ages.put("Smith", 25);
        ages.put("Test", 99);

        ages.forEach((key, value) -> {
            System.out.printf("%s %d%n", key, value);
        });
    }
}
