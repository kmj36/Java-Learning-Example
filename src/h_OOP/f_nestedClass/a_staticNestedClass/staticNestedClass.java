package h_OOP.f_nestedClass.a_staticNestedClass;

class Outer {
    public static class Nested {
        void Hello() {
            System.out.println("Hello");
        }
    }
}

public class staticNestedClass {
    static void main() {
        Outer.Nested nested = new Outer.Nested();
        nested.Hello();
    }
}
