package oop.b_AttributesAndMethods.d_sum;

class newMath {
    public static int sum(int value1, int value2) {
        return value1 + value2;
    }
}

public class sum {
    static void main() {
        System.out.printf("3 + 4 = %d\n", newMath.sum(3,4));
    }
}
