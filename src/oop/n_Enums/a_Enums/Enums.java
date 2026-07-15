package oop.n_Enums.a_Enums;

enum Level {
    HIGH, MEDIUM, LOW
}

public class Enums {
    static void main() {
        Level level = Level.HIGH;
        if(level == Level.HIGH)
            System.out.println(Level.HIGH);
    }
}
