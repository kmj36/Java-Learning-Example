package oop.c_AccessModifiers.f_publicClass;

class Clock {
    public long time = 0;
    Clock() {
        this.time = System.currentTimeMillis();
    }
}

class ClockReader {
    Clock clock = new Clock();

    public long readClock() {
        return clock.time;
    }
}

public class publicClass {
    static void main() {
        ClockReader cr = new ClockReader();
        System.out.printf("%s", cr.readClock());
    }
}
