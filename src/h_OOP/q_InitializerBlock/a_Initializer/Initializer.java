package h_OOP.q_InitializerBlock.a_Initializer;

class Test {
    static int staticVariable;
    int nonStaticVariable;

    static {
        System.out.println("Static initialization.");
        staticVariable = 5;
    }

    {
        System.out.println("Instance initialization.");
        nonStaticVariable = 7;
    }

    public Test() {
        System.out.println("Constructor.");
    }
}

public class Initializer {
    static void main() {
        new Test();
        new Test();
    }
}
