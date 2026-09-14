package r_collections.c_Set.c_copyOf;

import java.util.List;
import java.util.Set;

public class copyOf {
    static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,1,2,3,3,22,3,4,4,5,2,54,5,6,36,34,56,345,6,534,6,345,775,858,9,760);

        System.out.printf("[List.of(Integer)]%n");
        System.out.printf("list: %s %n", list);

        Set<Integer> copySet = Set.copyOf(list);
        System.out.printf("%n[Set.copyOf(list).stream().sorted().toList()]%n");
        System.out.printf("copySet: %s %n", copySet.stream().sorted().toList());
    }
}
