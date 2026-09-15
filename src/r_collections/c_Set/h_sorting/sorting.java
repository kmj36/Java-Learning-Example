package r_collections.c_Set.h_sorting;

import java.util.*;

public class sorting {
    static void main(String[] args) {
        Set<Integer> hexSet = new HashSet<>(List.of(
                0x07, 0xC4, 0xF2, 0x4A, -0xC6, -0xCF, -0x14, -0x9D, -0x70, 0xAF,
                -0x09, 0x8C, -0x5F, -0xE4, 0x34, -0x72, 0x6C, -0xD8, 0xFB, -0x02
        ));

        System.out.printf("hexSet : %s %n", hexSet);
        System.out.println();

        // 방법 1: TreeSet 으로 변환
        Set<Integer> sorted = new TreeSet<>(hexSet);

        System.out.printf("[Sorting with TreeSet]%n");
        System.out.printf("sorted(TreeSet) : %s %n", sorted);
        System.out.println();

        // 방법 2: List로 변환 후 Collections.sort() 사용
        List<Integer> list = new ArrayList<>(hexSet);
        //Collections.sort(list); // 오름차순
        Collections.sort(list, (a, b) -> b - a); // 내림차순

        System.out.printf("[Sorting with Collections.sort]%n");
        System.out.printf("sorted(Collections.sort) : %s %n", list);
        System.out.println();
    }
}
