package r_collections.d_Map.p_ProgramToInterface;

import java.util.HashMap;
import java.util.Map;

class Example {
    // 인터페이스 권장
    public Map<String, String> map = new HashMap<>();

    // 메서드 인자/반환 타입도 Map 으로
    public static void printMap(Map<?, ?> map) {
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

public class ProgramToInterface {
    static void main(String[] args) {
        Example e = new Example();

        e.map.put("a", "1234");
        e.map.put("ab", "4321");
        e.map.put("v", "4484");

        Example.printMap(e.map)
        ;
    }
}
