package oop.m_Interface.g_staticMethod;

interface MyInterface {
    static void print(String text) {
        System.out.println(text);
    }
}

public class staticMethod {
    static void main() {
        MyInterface.print("Hello, static Method!");
    }
}
