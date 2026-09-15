package r_collections.c_Set.e_Operations;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operations {
    static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(List.of(2, 4, 6, 8));

        // 합집합: {1, 2, 3, 4, 6, 8}
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        // 교집합: {2, 4}
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        // 차집합 (A - B): {1, 3}
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);

        // 부분집합 (A ⊇ B): false
        Set<Integer> superSet = new HashSet<>(setA);
        boolean isSubSet = superSet.containsAll(setB);

        System.out.printf("setA : %s %n", setA);
        System.out.printf("setB : %s %n", setB);
        System.out.println();

        System.out.printf("[Set.addAll(Set)]%n");
        System.out.printf("setA ∪ setB | %s %n", union);
        System.out.println();

        System.out.printf("[Set.retainAll(Set)]%n");
        System.out.printf("setA ∩ setB | %s %n", intersection);
        System.out.println();

        System.out.printf("[Set.removeAll(Set)]%n");
        System.out.printf("setA - setB | %s %n", difference);
        System.out.println();

        System.out.printf("[Set.contiansAll(Set)]%n");
        System.out.printf("setA ⊇ setB | %s %n", isSubSet);
    }
}
