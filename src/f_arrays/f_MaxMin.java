package f_arrays;

import java.util.Arrays;
import java.util.Random;

public class f_MaxMin {
    public final class MaxMin {
        public static int Min(int[] ints) {
            int minVal = Integer.MAX_VALUE;
            for (int num : ints) {
                if (num < minVal) minVal = num;
            }
            return minVal;
        }

        public static int Max(int[] ints) {
            int maxVal = Integer.MIN_VALUE;
            for (int num : ints) {
                if (num > maxVal) maxVal = num;
            }
            return maxVal;
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        Random rand = new Random();

        for (int i = 0; i < ints.length; i++) {
            ints[i] = rand.nextInt(100000);
        }

        System.out.printf("ints: %s\r\n", Arrays.toString(ints));
        System.out.printf("Max: %d\r\n", MaxMin.Max(ints));
        System.out.printf("Min: %d\r\n", MaxMin.Min(ints));
    }
}
