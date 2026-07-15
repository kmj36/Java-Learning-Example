package oop.m_Interface.a_Interface;

interface MyInterface {
    String hello = "Hello"; // 상수
    void sayHello();        // 추상 메서드
}

public class Interface {
    static void main() {
        MyInterface i = new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println(hello);
            }
        };

        i.sayHello();
    }
}
