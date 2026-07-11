package oop.f_nestedClass.c_shadowing;

// 이너 클래스와 외부 클래스가 같은 이름의 필드를 가지면, 안쪽 것을 우선(가려짐)합니다.
class Outer {
    private String text = "I am Outer private!";

    public class Inner {
        private String text = "I am Inner private!";

        public void printText() {
            System.out.println(text);               // Inner 의 text
            System.out.println(Outer.this.text);    // Outer 의 text
        }
    }
}

public class shadowing {
    static void main() {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();

        i.printText();
    }
}
