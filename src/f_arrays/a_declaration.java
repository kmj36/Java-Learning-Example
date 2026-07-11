package f_arrays;

import java.util.Arrays;

public class a_declaration {
    public static void main(String[] args) {
        int[] intArray1;
        int intArray2[];

        intArray1 = new int[10];
        intArray2 = new int[10];

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));
    }
}
