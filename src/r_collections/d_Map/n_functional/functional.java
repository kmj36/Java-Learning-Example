package r_collections.d_Map.n_functional;

import java.util.*;

public class functional {
    static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(Map.of(
                0, "cat",
                1, "dog",
                2, "parrot",
                3, "turtle",
                4, "hamster",
                5, "fish",
                6, "snake",
                7, "rabbit"
        ));

        // Map.compute [Key 여부와 관계 없이 무조건 함수 실행. 결과가 null 이면 제거]
        // 기존 키
        map.compute(5, (k, ov) -> ov = "goldenfish"); // "fish" -> "goldenfish"
        // 신규 키
        map.compute(8, (k, ov) -> (ov == null ? "none" : (ov += " (deprecated)")));
        // 결과 null (entry 소멸)
        map.compute(6, (k, ov) -> null);
        System.out.println("map.compute : " + map);

        // Map.computeIfAbsent [키가 없을 때만 계산해서 value 를 넣음.]
        List<String> list = new ArrayList<>(List.of("hedgehog", "ferret", "guinea pig", "canary", "gecko"));
        int i = 9;
        for(String animal : list) {
            map.computeIfAbsent(i, key -> animal);
            i++;
        }
        System.out.println("map.computeIfAbsent : " + map);

        // Map.computeIfPresent [키가 존재할 때만 value 를 계산.]
        map.computeIfPresent(8, (_, v) -> v.equals("none") ? null : v);
        System.out.println("map.computeIfPresent : " + map);

        // Map.merge [키가 없으면 Value 로 세팅, 있으면 계산 결과로 갱신.]
        for (int j = 0; j < map.size(); j++)
            map.merge(j, "racoon.", (k, _) -> k+=".");

        System.out.println("map.merge : " + map);
    }
}
