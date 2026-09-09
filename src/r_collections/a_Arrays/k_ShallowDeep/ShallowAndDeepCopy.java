package r_collections.a_Arrays.k_ShallowDeep;

import java.util.Arrays;

public class ShallowAndDeepCopy {
    static void main(String[] args) {
        // 깊은 복사
        try {
            int[] org = {1,2,3};
            int[] copy = org.clone();

            System.out.printf("[int[] org.clone()]%n");

            System.out.printf("org: %s%n", Arrays.toString(org));
            System.out.printf("copy: %s%n%n", Arrays.toString(copy));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

       // 2차원 배열 clone 시 {Ref, Ref} 를 복사하여 얕은 복사가 발생함.
        try {
            int[][] org = {{1,2,3},{4,5,6}};
            int[][] copy = org.clone();

            System.out.printf("[int[][] org.clone()]%n");

            System.out.printf("org: %n");
            for(int[] r : org) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

            System.out.printf("copy: %n");
            for(int[] r : copy) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

            System.out.printf("%n[copy[0][1] = 0]%n");
            copy[0][1] = 0;

            System.out.printf("org: %n");
            for(int[] r : org) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

            System.out.printf("copy: %n");
            for(int[] r : copy) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 2차원 이상 배열 clone 시 깊은 복사가 필요하면 각 하위 배열을 직접 복사해야 함.
        try {
            int[][] org = {{1,2,3},{4,5,6}};
            int[][] copy = new int[org.length][];

            for(int i = 0; i < org.length; i++)
                copy[i] = org[i].clone();

            System.out.printf("%n[int[][] org[i].clone()]%n");

            System.out.printf("org: %n");
            for(int[] r : org) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

            System.out.printf("copy: %n");
            for(int[] r : copy) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

            System.out.printf("%n[copy[0][1] = 0]%n");
            copy[0][1] = 0;

            System.out.printf("org: %n");
            for(int[] r : org) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

            System.out.printf("copy: %n");
            for(int[] r : copy) {
                for(int elem : r) System.out.printf("%d ", elem);
                System.out.println();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
