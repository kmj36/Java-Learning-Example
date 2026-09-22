package r_collections.d_Map.q_ObjectMap;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class objectMap {
    static void main(String[] args) {
        // 타입 세이프가 약함.
        Map<String, Object> raw = new HashMap<>();

        raw.put("count", 223);
        raw.put("createAt", Instant.now());

        raw.forEach((k, v) -> {
            if (v instanceof Integer i) {
                System.out.printf("%d%n", i);
            } else if (v instanceof Instant t) {
                System.out.printf("%s%n", t);
            }
        });
    }
}
