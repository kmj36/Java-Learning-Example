package r_collections.c_Set.b_ImmutableSet;

import java.util.Set;

public class ImmutableSet {
    static void main(String[] args) {
        // 불변 Set
        Set<String> empty = Set.of();
        Set<String> fixed = Set.of("a", "b", "c");

        System.out.printf("[empty Set.of()]%n");
        System.out.printf("empty : %s %n", empty);

        System.out.printf("%n[fixed Set.of(\"a\", \"b\", \"c\")]%n");
        System.out.printf("fixed : %s %n", fixed);

        // UnsupportedOperationException 발생
        try {
            System.out.printf("%n[Trying empty.add(1)]%n");
            empty.add("1");
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        // NullPointerException 발생
        try {
            System.out.printf("%n[Trying Set.of(\"null\", null)]%n");
            Set<String> nullSet = Set.of("null", null);
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }

        // IllegalArgumentException 발생
        try {
            System.out.printf("%n[Trying Set.of(1, 2, 3, 1)]%n");
            Set<Integer> duplicated = Set.of(1, 2, 3, 1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }
}