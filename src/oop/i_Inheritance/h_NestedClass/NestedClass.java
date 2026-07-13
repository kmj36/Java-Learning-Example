package oop.i_Inheritance.h_NestedClass;

class Nested {
    private class privateClass {
        final int num = 1;
    }
    class defaultClass {
        final int num = 2;
    }
    protected class protectedClass {
        final int num = 3;
    }
    public class publicClass {
        final int num = 4;
    }
}

class Inheritance extends Nested {
    void printSuper() {
        defaultClass a = new defaultClass();
        protectedClass b = new protectedClass();
        publicClass c = new publicClass();

        System.out.println(a.num);
        System.out.println(b.num);
        System.out.println(c.num);
    }
}

public class NestedClass {
    static void main() {
        Inheritance i = new Inheritance();
        i.printSuper();
    }
}
