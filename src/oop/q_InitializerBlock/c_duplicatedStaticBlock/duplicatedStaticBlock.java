package oop.q_InitializerBlock.c_duplicatedStaticBlock;

class Test {
    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }
}

public class duplicatedStaticBlock {
    static void main() {
        new Test();
    }
}
