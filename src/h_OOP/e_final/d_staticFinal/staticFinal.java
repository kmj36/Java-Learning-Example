package h_OOP.e_final.d_staticFinal;

import java.util.ArrayList;
import java.util.List;

class foo {
    private static final List<String> foo = new ArrayList<>();

    public static List<String> getFoo() {
        return foo;
    }

    static {
        foo.add("a");
        foo.add("b");
        foo.add("c");
    }
}

public class staticFinal {
    static void main() {
        System.out.println(foo.getFoo());
    }
}
