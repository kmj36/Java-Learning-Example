package q_generics.d_diamondOperator;

import java.util.ArrayList;
import java.util.List;

public class diamondOperator {
    static void main(String[] args) {
        // < Java 7
        List<String> names = new ArrayList<String>();
        // Java 7 +
        List<String> names2 = new ArrayList<>();

        names.add("test");
        names2.add("test2");

        System.out.println(names);
        System.out.println(names2);
    }
}
