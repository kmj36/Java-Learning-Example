package r_collections.c_Set.g_iterator;

import java.util.*;

public class iterationSet {
    static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(null, 1, 2, 3, 4, 5, 6, 7));


        // 1) for-each
        System.out.printf("[Set for-each]%n");
        for (Integer n : set) System.out.printf("%s ", n);
        System.out.printf("%n%n");

        // 2) Iterator (순회 중 요소 제거 가능)
        System.out.printf("[Set Iterator - remove null]%n");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if (Objects.isNull(n)) {
                it.remove();
                continue;
            }
            System.out.printf("%d ", n);
        }
    }
}
