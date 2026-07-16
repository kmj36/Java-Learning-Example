package h_OOP.f_nestedClass.e_localClassVariableAccess;

class CustomThread {
    public void process() {
        final String message = "Hello";
        // String message = "Hello";

        class Local {
            void show() {
                System.out.println(message); // final / 유사 final 변수만 접근 가능
            }
        }

        Local l = new Local();
        // message = "World"; // 유사 final 이 아니여서 컴파일 에러 발생.
        l.show();
    }
}


public class localClassVariableAccess {
    static void main() {
        CustomThread ct = new CustomThread();
        ct.process();
    }
}
