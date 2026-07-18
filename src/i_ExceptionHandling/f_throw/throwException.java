package i_ExceptionHandling.f_throw;

class Demo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }
}

public class throwException {
    static void main(String[] args) {
        Demo.checkAge(15);
    }
}
