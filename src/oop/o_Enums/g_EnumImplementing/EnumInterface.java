package oop.o_Enums.g_EnumImplementing;

interface MyInterface {
    String getDescription();
}

enum EnumImplementingInterface implements MyInterface {
    FIRST("First Value"), SECOND("Second Value");

    private final String description;

    private EnumImplementingInterface(String desc) {
        this.description = desc;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}

public class EnumInterface {
    static void main() {
        EnumImplementingInterface e = EnumImplementingInterface.FIRST;
        System.out.println(e.getDescription());
    }
}
