package oop.o_Enums.i_SwitchThis;

enum test {
    SMALL,
    MEDIUM,
    HIGH;

    public String getSize() {
        switch (this) {
            case SMALL -> {
                return "small";
            }
            case MEDIUM -> {
                return "medium";
            }
            case HIGH -> {
                return "high";
            }
        }
        return "";
    }
}

public class SwitchThis {
    static void main() {
        test t = test.MEDIUM;
        System.out.println(t.getSize());
    }
}
