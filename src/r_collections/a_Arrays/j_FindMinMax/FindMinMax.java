package r_collections.a_Arrays.j_FindMinMax;

import java.util.Arrays;

public class FindMinMax {
    static void main(String[] args) {
        int[] arr = {1,2,3,3,3,2,4,3,1,42,542,5,25,24,5,24,542,5,24,4,3,24,32,5,23,4};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int v : arr)
            if (v < min)
                min = v;

        for (int v : arr)
            if (v > max)
                max = v;

        System.out.printf("arr: %s%n", Arrays.toString(arr));
        System.out.printf("max: %d, min: %d%n", max, min);
    }
}
