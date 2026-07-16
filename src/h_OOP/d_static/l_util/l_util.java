package h_OOP.d_static.l_util;

class MathUtil {
    public static int square(int x) {
        return (int)Math.pow(x, 2);
    }

    public static int qube(int x) {
        return (int)Math.pow(x, 3);
    }
}

public class l_util {
    static void main() {
        System.out.println(MathUtil.qube(5));
        System.out.println(MathUtil.square(5));
    }
}
