package oop.d_static.d_staticMethod;

class Counter {
    public static int count = 0;
    public static void increment() {
        count++;
    }
}

public class staticMethod {
    static void main() {
        Counter.increment();
        Counter.increment();

        System.out.println(Counter.count);
    }
}
