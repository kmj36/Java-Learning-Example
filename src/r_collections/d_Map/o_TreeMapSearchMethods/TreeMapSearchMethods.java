package r_collections.d_Map.o_TreeMapSearchMethods;

import java.util.TreeMap;

public class TreeMapSearchMethods {
    static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "c");
        map.put(2, "b");
        map.put(1, "a");

        System.out.printf("map: %s%n", map);

        System.out.printf("map.lowerKey(3): %d%n", map.lowerKey(3));
        System.out.printf("map.higherKey(1): %d%n", map.higherKey(1));
        System.out.printf("map.floorEntry(3): %s%n", map.floorEntry(3));
        System.out.printf("map.ceilingEntry(1): %s%n", map.ceilingEntry(1));

        System.out.printf("map.descendingMap(): %s%n", map.descendingMap());

        System.out.printf("map.pollFirstEntry(): %s%n", map.pollFirstEntry());
        System.out.printf("map.pollLastEntry(): %s%n", map.pollLastEntry());
    }
}
