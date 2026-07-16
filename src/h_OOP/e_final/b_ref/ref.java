package h_OOP.e_final.b_ref;

import java.util.ArrayList;
import java.util.List;

public class ref {
    static void main() {
        final List<String> foo = new ArrayList<>();

        foo.add("hello");
        foo.add("world!");
        //foo = new ArrayList<>();
        System.out.println(foo.getFirst());
        System.out.println(foo.getLast());
    }
}
