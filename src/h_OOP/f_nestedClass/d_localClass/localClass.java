package h_OOP.f_nestedClass.d_localClass;

class Outer {
    public void printText() {
        class Local {
            void run() {
                System.out.println("지역 클래스 실행");
            }
        }

        Local local = new Local(); // printText() 메서드 안에서만 생성/사용이 가능.
        local.run();
    }
}

public class localClass {
    static void main() {
        Outer o = new Outer();

        o.printText();
    }
}
