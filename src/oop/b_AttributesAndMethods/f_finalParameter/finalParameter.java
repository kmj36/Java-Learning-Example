package oop.b_AttributesAndMethods.f_finalParameter;

class write {
    public static void writeText(final String text1) {
        //text1 = "asdf";
    }
}

public class finalParameter {
    static void main() {
        write.writeText("Hello, World!");
    }
}
