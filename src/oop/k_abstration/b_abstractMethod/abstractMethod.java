package oop.k_abstration.b_abstractMethod;

abstract class MyAbstractClass {
    public abstract void abstractMethod();
}

class MySubClass extends MyAbstractClass {
    public void abstractMethod() {
        System.out.println("구현 내용");
    }
}

public class abstractMethod {
    static void main() {
        MySubClass sub = new MySubClass();
        sub.abstractMethod();
    }
}
