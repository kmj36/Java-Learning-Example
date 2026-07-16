package h_OOP.c_AccessModifiers.d_default;

class Clock {
    long time = 0;

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

public class defaultClass {
    static void main() {
        ClockReader cr = new ClockReader();
        System.out.printf("Clock Time: %d", cr.readClock());
    }
}
