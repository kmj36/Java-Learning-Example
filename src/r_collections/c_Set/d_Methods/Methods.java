package r_collections.c_Set.d_Methods;

import java.util.*;

public class Methods {
    static void main(String[] args) {
        Set<String> messages = new HashSet<>();
        messages.add("World");
        messages.add("!");
        messages.add("newLine");

        // Set.add(E e)
        System.out.printf("[Set.add(E e)]%n");
        boolean addFirst = messages.add("Hello,");
        boolean addDuplicated = messages.add("Hello,");

        System.out.printf("Add \"Hello,\" - %s | messages : %s %n", addFirst, messages);
        System.out.printf("Add \"Hello,\" - %s | messages : %s %n", addDuplicated, messages);
        System.out.println();

        // Set.remove(Object o)
        System.out.printf("[Set.remove(Object o)]%n");
        boolean isRemoved = messages.remove("newLine");

        System.out.printf("Remove \"newLine\" - %s | messages : %s %n", isRemoved, messages);
        System.out.println();

        // Set.contains(Object o)
        System.out.printf("[Set.contains(Object o)]%n");
        boolean isContained = messages.contains("newLine");

        System.out.printf("is Contained? \"newLine\" - %s | messages : %s %n", isContained, messages);
        System.out.println();

        // Set.size()
        System.out.printf("[Set.size()]%n");
        System.out.printf("Set messages size - %d | messages : %s %n", messages.size(), messages);
        System.out.println();

        // Set.isEmpty()
        System.out.printf("[Set.isEmpty()]%n");
        boolean isEmpty = messages.isEmpty();

        System.out.printf("is Empty? - %s | messages : %s %n", isEmpty, messages);
        System.out.println();

        // Set.clear()
        System.out.printf("[Set.clear()]%n");
        Set<String> newSet = new HashSet<>(messages);
        System.out.printf("messages copy to newSet - newSet : %s %n", newSet);
        newSet.clear();

        System.out.printf("clear newSet | newSet : %s %n", newSet);
        System.out.println();

        // Set.iterator()
        System.out.printf("[Set.iterator()]%n");

        System.out.print("print with for-each Set.iterator() | messages : \"");
        for (Iterator<String> it = messages.iterator(); it.hasNext(); ) {
            String item = it.next();
            System.out.print(item);
        }
        System.out.printf("\"%n");
        System.out.println();

        // Set.toArray()
        System.out.printf("[Set.toArray()]%n");
        String[] strArr = messages.toArray(new String[0]);

        System.out.printf("messages.toArray() | messages : %s %n", Arrays.toString(strArr));
        System.out.println();

        // - Initialize Set Operation Data -
        System.out.printf(" - Set Operation Data - %n");
        Set<Integer> OperationSet = new HashSet<>();
        Set<Integer> set1 = Set.of(1,2,3,4,5);
        Set<Integer> set2 = Set.of(4,5,6,7,8);

        System.out.printf("OperationSet : %s %n", OperationSet);
        System.out.printf("set1 : %s %n", set1);
        System.out.printf("set2 : %s %n", set2);
        System.out.println();

        // Set.addAll(Collection c)
        System.out.printf("[Set.addAll(Collection c)]%n");
        OperationSet.addAll(set1);
        OperationSet.addAll(set2);

        System.out.printf("set1 ∪ set2 | OperationSet : %s %n", OperationSet);
        OperationSet.clear();
        System.out.println();

        // Set.removeAll(Collection c)
        System.out.printf("[Set.removeAll(Collection c)]%n");
        OperationSet.addAll(set1);
        OperationSet.removeAll(set2);

        System.out.printf("set1 - set2 | OperationSet : %s %n", OperationSet);
        OperationSet.clear();
        System.out.println();

        // Set.retainAll(Collection c)
        System.out.printf("[Set.retainAll(Collection c)]%n");
        OperationSet.addAll(set1);
        OperationSet.retainAll(set2);

        System.out.printf("set1 ∩ set2 | OperationSet : %s %n", OperationSet);
        OperationSet.clear();
        System.out.println();

        // Set.containsAll(Collection c)
        System.out.printf("[Set.containsAll(Collection c)]%n");
        OperationSet.addAll(set1);
        boolean isContainsAll = OperationSet.containsAll(set2);

        System.out.printf("set1 ⊇ set2 | isContainsAll : %s", isContainsAll);
    }
}
