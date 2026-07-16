package h_OOP.c_AccessModifiers.e_protectedClass;

class Clock {
    protected long time = 0;
    Clock() {
        this.time = System.currentTimeMillis();
    }
}

class SmartClock extends Clock {
    public long getTimeInSeconds() {
        return this.time / 1_000;
    }
}

public class protectedClass {
    static void main() {
        SmartClock sc = new SmartClock();
        System.out.printf("sc.getTimeInSeconds: %d", sc.getTimeInSeconds());
    }
}
