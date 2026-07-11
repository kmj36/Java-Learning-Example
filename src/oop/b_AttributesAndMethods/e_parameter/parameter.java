package oop.b_AttributesAndMethods.e_parameter;

class parameterTest {
    public static void writeText(String text1, String text2) {
        System.out.print(text1);
        text1 = "new value";
        System.out.print(text1);
    }
}

public class parameter {
    static void main() {
        parameterTest.writeText("Hello,", "World!");
    }
}
