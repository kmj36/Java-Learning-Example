package r_collections.d_Map.g_EnumMap;

import java.util.EnumMap;

public class enumMap {
    public enum Level {
        HIGH, MEDIUM, LOW
    };
    static void main(String[] args) {
        EnumMap<Level, Integer> levels = new EnumMap<>(Level.class);

        levels.put(Level.LOW, 1);
        levels.put(Level.MEDIUM, 2);
        levels.put(Level.HIGH, 3);

        System.out.printf("[EnumMap]%n");
        System.out.printf("levels: %s %n", levels);
    }
}
