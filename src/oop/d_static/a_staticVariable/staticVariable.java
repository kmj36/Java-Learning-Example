package oop.d_static.a_staticVariable;

class Counter implements AutoCloseable {
    public static int count = 0;

    public Counter() {
        count++;
    }

    @Override
    public void close() {
        count--;
    }
}

public class staticVariable {
    static void main() {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        c1.close();
        c2.close();
        c3.close();

        System.out.println(Counter.count);  // 0
    }
}
