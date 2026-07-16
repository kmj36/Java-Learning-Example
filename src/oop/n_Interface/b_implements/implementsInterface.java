package oop.n_Interface.b_implements;

interface myInterface {
    String hello = "Hello";
    void sayHello();
}

class MyInterfaceImpl implements myInterface {
    @Override
    public void sayHello() {
        System.out.println(myInterface.hello);
    }
}

public class implementsInterface {
    static void main() {
        MyInterfaceImpl m = new MyInterfaceImpl();
        m.sayHello();
    }
}
