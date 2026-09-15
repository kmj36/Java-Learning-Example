package r_collections.c_Set.f_OperationWithStream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OperationWithStream {
    static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(List.of(1, 2, 3, 4));
        Set<Integer> setB = new HashSet<>(List.of(2, 4, 6, 8));

        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);

        Set<Integer> intersection2 = setA.stream()
                .filter(setB::contains)
                .collect(Collectors.toSet());

        System.out.printf("setA.retainAll(setB) - %s %n", intersection);
        System.out.printf("setA.stream().filter(setB::contains) - %s %n", intersection2);
    }
}
