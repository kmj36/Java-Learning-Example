package oop.f_nestedClass.b_InnerClass;

class Outer {
    private String text = "I am private!";

    public class Inner {
        public void printText() {
            System.out.println(text);
        }
    }
}

public class InnerClass {
    static void main() {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.printText();
    }
}
