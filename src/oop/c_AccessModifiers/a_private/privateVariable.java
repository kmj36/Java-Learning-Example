package oop.c_AccessModifiers.a_private;

class Clock {
    private long time = 0;

    public long getTime() {
        return time;
    }
}

public class privateVariable {
    static void main() {
        Clock c = new Clock();
        //c.time;
        System.out.printf("c.time: %d", c.getTime());
    }
}
