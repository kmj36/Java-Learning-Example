package h_OOP.c_AccessModifiers.b_GetterSetter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;

class Clock {
    private long time = 0;

    public long getTime() {
        return time;
    }

    public void setTime(long theTime) {
        this.time = theTime;
    }
}

public class GetterSetter {
    static void main() {
        Clock c = new Clock();

        c.setTime(LocalTime.now().toEpochSecond(LocalDate.now(), ZoneOffset.UTC));
        System.out.printf("%d", c.getTime());
    }
}
