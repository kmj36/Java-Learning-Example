package oop.q_InitializerBlock.e_AnonymousClass;

class Base {
    int a;
    int b;

    void print() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class AnonymousClass {
    static void main() {
        Base b = new Base() {
            {
                a = 5;
                b = 10;
            }

            @Override
            void print() {
                super.print();
                System.out.println("b: " + b);
            }
        };
        b.print();
    }
}
