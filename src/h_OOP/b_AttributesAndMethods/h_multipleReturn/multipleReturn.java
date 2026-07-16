package h_OOP.b_AttributesAndMethods.h_multipleReturn;

class strstr {
    public String concat(String s1, String s2, boolean reverse) {
        if (reverse) {
            return s2 + s1;
        }
        return s1 + s2;
    }
}

public class multipleReturn {
    static void main() {
        strstr s = new strstr();
        System.out.printf("concat: %s, %s\n", s.concat("A", "B", false), s.concat("A", "B", true));
    }
}
