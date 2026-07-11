package oop.c_AccessModifiers.g_effectiveAccessibility;

class InternalHelper {
    private static class something {
        public static void doSomething() {
            System.out.println("실행");
        }
    }
}

public class effectiveAccessibility {
    static void main() {
        //InternalHelper.something.doSomething();
    }
}
