package h_OOP.d_static.g_staticBlock;

class Saturn {
    public static final int MOON_COUNT;

    static {
        MOON_COUNT = 62;
    }
}

public class staticBlock {
    static void main() {
        System.out.println(Saturn.MOON_COUNT);
    }
}
