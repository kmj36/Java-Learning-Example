package oop.d_static.e_staticContext;

class MyClass {
    int instanceVariable = 0;
    static int staticVariable = 0;

    public static void staticMethod() {
        //System.out.println(instanceVariable);
        System.out.println(staticVariable);
    }
}

public class staticContext {
    static void main() {
        MyClass.staticMethod();
    }
}
