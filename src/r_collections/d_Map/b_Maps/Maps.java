package r_collections.d_Map.b_Maps;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

class MapPrint {
    public static void printPair(Integer key, Integer value) {
        System.out.printf("%d=%d ", key, value);
    }
}

public class Maps {
    static void main(String[] args) {
        List<Integer> keys = new ArrayList<>(List.of(173, 42, 219, 8, 156, 91, 244, 63, 127, 200));
        List<Integer> values = new ArrayList<>(List.of(195, 230, 93, 30, 30, 101, 90, 235, 161, 112));

        System.out.printf("[keys] : %s %n", keys);
        System.out.printf("[values] : %s %n", values);

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        LinkedHashMap<Integer, Integer> linked = new LinkedHashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        Hashtable<Integer, Integer> hashTable = new Hashtable<>();
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        for(int i = 0; i < 10; i++) {
            hashMap.put(keys.get(i), values.get(i));
            linked.put(keys.get(i), values.get(i));
            treeMap.put(keys.get(i), values.get(i));
            hashTable.put(keys.get(i), values.get(i));
            concurrentHashMap.put(keys.get(i), values.get(i));
        }

        System.out.printf("[HashMap]%n");
        hashMap.forEach(MapPrint::printPair);
        System.out.println();

        System.out.printf("[LinkedHashMap]%n");
        linked.forEach(MapPrint::printPair);
        System.out.println();

        System.out.printf("[TreeMap]%n");
        treeMap.forEach(MapPrint::printPair);
        System.out.println();

        System.out.printf("[Hashtable]%n");
        hashTable.forEach(MapPrint::printPair);
        System.out.println();

        System.out.printf("[ConcurrentHashMap]%n");
        concurrentHashMap.forEach(MapPrint::printPair);
        System.out.println();
    }
}
