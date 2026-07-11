package oop.f_nestedClass.f_anonymousClass;

interface Myinterface {
    void doIt();
}

public class anonymousClass {
    static void main() {
        Myinterface i = new Myinterface() {
            @Override
            public void doIt() {
                System.out.println("익명 클래스 실행");
            }
        };

        i.doIt();
    }
}
