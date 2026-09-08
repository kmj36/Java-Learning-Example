package q_generics.o_unboundedWildcard;

import java.util.ArrayList;
import java.util.List;

class Unbounded {
    public static void printList(List<?> list) {
        for (Object elem : list)
            System.out.printf(elem + " ");
    }
}

public class UnboundedWildcard {
    static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Hello,");
        strList.add("World!");

        Unbounded.printList(strList);
    }
}
