package h_OOP.q_InitializerBlock.b_InitializationSequence;

class parent {
    static {
        System.out.println("parent static block");
    }
    {
        System.out.println("parent instance block");
    }
    parent() {
        System.out.println("parent constructor");
    }
}

class StaticTest extends parent {
    static {
        System.out.println("child static block");
    }

    {
        System.out.println("child instance block");
    }

    StaticTest() {
        System.out.println("child constructor");
    }
}

public class initializationSequence {
    static void main() {
        new StaticTest();
    }
}
