package r_collections.a_Arrays.i_ArrayCopy;

import java.util.Arrays;

public class ArrayCopy {
    static void main(String[] args) {
        int[] src = {1,2,3,4,5,6,7,8,9,0};


        // 1. 수동 배열 복사
        try {
            System.out.printf("[Manually array copy]%n");
            int[] dest;

            dest = new int[src.length];
            for(int i = 0; i < src.length; i++)
                dest[i] = src[i];

            System.out.printf("src: %s%n", Arrays.toString(src));
            System.out.printf("dest: %s%n%n", Arrays.toString(dest));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 2. Arrays.copyOf(arr, arr.length)
        try {
            System.out.printf("[Arrays.copyOf(arr, arr.length)]%n");
            int[] dest;

            dest = Arrays.copyOf(src, src.length);

            System.out.printf("src: %s%n", Arrays.toString(src));
            System.out.printf("dest: %s%n%n", Arrays.toString(dest));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 3. Arrays.copyOfRange(arr, 0, arr.length)
        try {
            System.out.printf("[Arrays.copyOfRange(arr, 0, arr.length)]%n");
            int[] dest;

            dest = Arrays.copyOfRange(src, 0, src.length);

            System.out.printf("src: %s%n", Arrays.toString(src));
            System.out.printf("dest: %s%n%n", Arrays.toString(dest));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 4. System.arraycopy
        try {
            System.out.printf("[System.arraycopy(src, 0, dest, 0, src.length)]%n");
            int[] dest = new int[src.length];

            System.arraycopy(src, 0, dest, 0, src.length);

            System.out.printf("src: %s%n", Arrays.toString(src));
            System.out.printf("dest: %s%n%n", Arrays.toString(dest));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
