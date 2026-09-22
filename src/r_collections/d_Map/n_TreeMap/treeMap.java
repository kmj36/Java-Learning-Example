package r_collections.d_Map.n_TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class treeMap {
    static void main(String[] args) {
        TreeMap<Integer, String> tree = new TreeMap<>();

        tree.put(2, "b");
        tree.put(1, "a");
        tree.put(3, "c");
        tree.put(5, "e");
        tree.put(4, "d");

        System.out.printf("tree: %s%n", tree);

        // 첫번째 키, 마지막 키
        System.out.printf("[TreeMap.firstKey()]%n");
        System.out.printf("tree.firstKey(): %d%n", tree.firstKey());
        System.out.printf("[TreeMap.lastKey()]%n");
        System.out.printf("tree.lastKey(): %d%n%n", tree.lastKey());

        // 특정 키 부터 미만, 이상 항목 Map 피킹
        System.out.printf("[TreeMap.headMap()]%n");
        System.out.printf("tree.headMap(3): %s%n", tree.headMap(3));
        System.out.printf("[TreeMap.tailMap()]%n");
        System.out.printf("tree.tailMap(3): %s%n%n", tree.tailMap(3));

        // 특정 키 미만, 이상 항목 중 Max key, Min key
        System.out.printf("[TreeMap.floorKey()]%n");
        System.out.printf("tree.floorKey(3): %d%n", tree.floorKey(3));
        System.out.printf("[TreeMap.ceilingKey()]%n");
        System.out.printf("tree.ceilingKey(3): %d%n", tree.ceilingKey(3));

        TreeMap<Integer, String> reverseTree = new TreeMap<>(Comparator.reverseOrder());

        reverseTree.put(2, "b");
        reverseTree.put(1, "a");
        reverseTree.put(3, "c");
        reverseTree.put(5, "e");
        reverseTree.put(4, "d");

        System.out.printf("reverseTree: %s%n", reverseTree);
    }
}
