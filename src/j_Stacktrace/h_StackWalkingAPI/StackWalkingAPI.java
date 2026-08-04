package j_Stacktrace.h_StackWalkingAPI;

public class StackWalkingAPI {
    static void main(String[] args) {
        methodA();
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        methodC();
    }

    static void methodC() {
        StackWalker walker = StackWalker.getInstance();

        walker.forEach(frame -> {
            System.out.println(frame.getClassName() + "." + frame.getMethodName()
                + " (line: " + frame.getLineNumber() + ")");
        });
    }
}
