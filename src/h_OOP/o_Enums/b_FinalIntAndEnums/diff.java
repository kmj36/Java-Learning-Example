package h_OOP.o_Enums.b_FinalIntAndEnums;

class fSize {
    public final static int SMALL = 1;
    public final static int MEDIUM = 2;
    public final static int LARGE = 3;
    public final static int EXTRALARGE = 4;
}

enum eSize {
    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE
}

public class diff {
    static void main() {
        System.out.printf("fSize: %d %d %d %d\n", fSize.SMALL, fSize.MEDIUM, fSize.LARGE, fSize.EXTRALARGE);
        System.out.printf("eSize: %s %s %s %s\n", eSize.SMALL, eSize.MEDIUM, eSize.LARGE, eSize.EXTRALARGE);
    }
}
