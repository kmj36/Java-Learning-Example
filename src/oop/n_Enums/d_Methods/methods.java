package oop.n_Enums.d_Methods;

import java.util.Arrays;

enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    CRITICAL,
    NONE
}

public class methods {
    static void main() {
        LogLevel level = LogLevel.WARN;

        System.out.println(Arrays.stream(LogLevel.values()).toList());
        System.out.println(LogLevel.INFO.toString());
        System.out.println(LogLevel.DEBUG.name());
        System.out.println(LogLevel.valueOf("TRACE"));
        System.out.println(LogLevel.WARN.ordinal());
        System.out.println(LogLevel.ERROR.compareTo(LogLevel.TRACE));

        for (LogLevel item : LogLevel.values()) {
            System.out.println(item);
        }
    }
}
