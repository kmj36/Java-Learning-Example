package h_OOP.e_final.c_init;

import java.util.ArrayList;
import java.util.List;

class Test {
    private final List<String> foo;

    public Test() {
        foo = new ArrayList<>();
        foo.add("foo");
    }

    public void setFoo(List<String> foo) {
        //this.foo = foo;
    }

    public List<String> getFoo() {
        return foo;
    }
}

public class init {
    static void main() {
        Test t = new Test();
        System.out.println(t.getFoo());
    }
}
