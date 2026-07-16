package h_OOP.c_AccessModifiers.c_privateConstructor;

class Clock {
    private long time = 0;

    private Clock(long time) {
        this.time = time;
    }

    public Clock(long time, long timeOffset) {
        this(time);
        this.time += timeOffset;
    }

    public static Clock newClock() {
        return new Clock(System.currentTimeMillis());
    }

    public long getTime() {
        return time;
    }
}

public class privateConstructor {
    static void main() {
        Clock c = Clock.newClock();
        System.out.printf("Unix Epoch Time: 0x%08x\n", c.getTime());
    }
}
