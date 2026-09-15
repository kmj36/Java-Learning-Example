package r_collections.c_Set.j_SubSet;

import java.util.*;
import java.util.stream.Collectors;

public class SubSet {
    static void main(String[] args) {
        Set<Integer> superset = new HashSet<>(List.of(
                0x07, 0xC4, 0xF2, 0x4A, -0xC6, -0xCF, -0x14, -0x9D, -0x70, 0xAF,
                -0x09, 0x8C, -0x5F, -0xE4, 0x34, -0x72, 0x6C, -0xD8, 0xFB, -0x02
        ));
        System.out.printf("superset : %s %n", superset);
        System.out.println();

        // Stream 사용
        Set<Integer> subset = superset.stream().limit(5).collect(Collectors.toSet());
        System.out.printf("[superset.stream().limit(5).collect(Collectors.toSet())]%n");
        System.out.printf("subset : %s %n", subset);
        System.out.printf("isSubset? : %s %n", superset.containsAll(subset));
        System.out.println();

        // TreeSet(NavigableSet) 사용 - 범위 기반
        NavigableSet<Integer> sorted = new TreeSet<>(superset);
        Set<Integer> range = sorted.subSet(-80, 80);
        System.out.printf("[new TreeSet<>(superset).subSet(80, -80)]%n");
        System.out.printf("range : %s %n", range);
        System.out.printf("isSubset? : %s %n", superset.containsAll(range));
    }
}
