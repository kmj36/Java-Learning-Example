package r_collections.d_Map.r_SuperTypeInterfaceMap;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

interface TypedValue { String describe(); }

class IntValue implements TypedValue {
    private final int value;
    IntValue(int value) { this.value = value; }
    public String describe() { return "정수: " + value; }
}

class InstantValue implements TypedValue {
    private final Instant value;
    InstantValue(Instant value) { this.value = value; }
    public String describe() { return "시간: " + value; }
}

public class SuperTypeObjectMap {
    static void main(String[] args) {
        Map<String, TypedValue> map = new HashMap<>();

        map.put("count", new IntValue(232));
        map.put("createAt", new InstantValue(Instant.now()));

        System.out.printf("%s%n", map.get("count").describe());
        System.out.printf("%s%n", map.get("createAt").describe());
    }
}
