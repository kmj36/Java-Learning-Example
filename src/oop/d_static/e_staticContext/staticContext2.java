package oop.d_static.e_staticContext;

class Example {
    int instanceVar;
    static int staticVar;

    void instanceMethod() {
        instanceVar = 1;
        staticVar = 1;
    }

    static void staticMethod() {
        staticVar = 1;
        //instanceVar = 1;

        Example e = new Example();
        e.instanceVar = 1;
    }
}

public class staticContext2 {
    static void main() {

    }
}
