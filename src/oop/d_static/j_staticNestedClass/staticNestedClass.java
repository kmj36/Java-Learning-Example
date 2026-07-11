package oop.d_static.j_staticNestedClass;

class Outer {
    public static class Inner {
        public Inner() {
            System.out.println("Outer.Inner");
        }
    }
}

public class staticNestedClass {
    static void main() {
        Outer.Inner inner = new Outer.Inner();
    }
}
