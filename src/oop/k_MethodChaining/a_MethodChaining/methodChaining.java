package oop.k_MethodChaining.a_MethodChaining;

class A {
    private int a;
    private float b;

    public A setInt(int a) {
        this.a = a;
        return this;
    }

    public A setFloat(float b) {
        this.b = b;
        return this;
    }

    void display() {
        System.out.printf("Display=%d %f", a, b);
    }
}

public class methodChaining {
    static void main() {
        A a = new A();
        a.setInt(10).setFloat(20).display();
    }
}