package oop.m_Interface.c_instance;

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

public class Instance {
    static void main() {
        myInterface m = new MyInterfaceImpl();
        m.sayHello();
    }
}
