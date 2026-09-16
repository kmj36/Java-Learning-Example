package r_collections.d_Map.l_MapIteration;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of(
                "a", 1,
                "b", 2,
                "c", 3,
                "d", 4,
                "e", 5
        ));

        // 키 순회
        System.out.println("[Map.keySet()]");
        for (String key : map.keySet()) System.out.println(key + " -> " + map.get(key));
        System.out.println();

        // 값 만 순회
        System.out.println("[Map.values()]");
        for (Integer value : map.values()) System.out.println(value);
        System.out.println();

        // Entry 로 순회
        System.out.println("[Map.Entry<K, V>]");
        for (Map.Entry<String, Integer> entry : map.entrySet()) System.out.println(entry.getKey() + " : " + entry.getValue());
        System.out.println();

        // 람다 forEach
        System.out.println("[Map.forEach(Lambda)");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
