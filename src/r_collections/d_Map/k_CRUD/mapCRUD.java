package r_collections.d_Map.k_CRUD;

import java.util.HashMap;
import java.util.Map;

public class mapCRUD {
    static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> otherMap = new HashMap<>(Map.of(
                "key1", 1,
                "key2", 2
        ));

        // 추가/수정
        System.out.println("[map.put(\"mapper\", 1)]");
        map.put("mapper", 1);
        map.put("test", 2);
        System.out.println("map : " + map);
        System.out.println();

        // 조회
        System.out.println("[map.get(\"mapper\")]");
        System.out.println("map : " + map);
        System.out.println("map[\"mapper\"] : " + map.get("mapper"));
        System.out.println();

        // 없으면 기본값 반환
        System.out.println("[map.getOrDefault(\"kiwi\", 0)]");
        System.out.println("map : " + map);
        System.out.println("map[\"kiwi\"] : " +  map.getOrDefault("kiwi", 0));
        System.out.println();

        // 키가 포함되어 있는지
        System.out.println("[map.containsKey(\"mapper\")]");
        System.out.println("map : " + map);
        System.out.println("map contain key \"mapper\" : " +  map.containsKey("mapper"));
        System.out.println();

        // 값이 포함되어 있는지
        System.out.println("[map.containsValue(1)]");
        System.out.println("map : " + map);
        System.out.println("map contain Value 1 : " + map.containsValue(1));
        System.out.println();

        // 키 제거
        System.out.println("[map.remove(\"mapper\")]");
        System.out.println("map : " + map);
        System.out.println("map remove key \"mapper\" : " + map.remove("mapper"));
        System.out.println();

        // 개수
        System.out.println("[map.size()]");
        System.out.println("map : " + map);
        System.out.println("map size : " + map.size());
        System.out.println();

        // 비었는지
        System.out.println("[map.isEmpty()]");
        System.out.println("map : " + map);
        System.out.println("map is Empty? : " + map.isEmpty());
        System.out.println();

        // 전체 삭제
        System.out.println("[map.clear()]");
        System.out.println("map : " + map);
        map.clear();
        System.out.println("map clear : " + map);
        System.out.println();

        // 다른 맵 병합(같은 키는 덮어씀)
        System.out.println("[map.putAll(otherMap);]");
        System.out.println("map : " + map);
        map.putAll(otherMap);
        System.out.println("map putAll otherMap : " + map);
        System.out.println();
    }
}
