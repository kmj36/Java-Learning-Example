package h_OOP.o_Enums.e_EnumFields;

enum Level {
    HIGH(3), MEDIUM(2), LOW(1);

    private final int levelCode;

    private Level(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }
}

public class EnumFields {
    static void main() {
        Level level = Level.HIGH;
        System.out.println(level.getLevelCode());
    }
}
