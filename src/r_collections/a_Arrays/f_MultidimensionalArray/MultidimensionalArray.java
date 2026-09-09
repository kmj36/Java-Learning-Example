package r_collections.a_Arrays.f_MultidimensionalArray;

public class MultidimensionalArray {
    static void main(String[] args) {
        int[][] matrix = {
                {1,0,0,0,0},
                {0,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,0},
                {0,0,0,0,1}
        };

        int[][] mdsEnMatrix = {
                {2,3,1,1},
                {1,2,3,1},
                {1,1,2,3},
                {3,1,1,2}
        };

        int[][] mdsDeMatrix = {
                {0xE, 0xB, 0xD, 9},
                {9, 0xE, 0xB, 0xD},
                {0xD, 9, 0xE, 0xB},
                {0xB, 0xD, 9, 0xE}
        };

        for(int[] item : matrix) {
            for(int num : item) System.out.printf("%2d ", num);
            System.out.println();
        }
        System.out.println();

        for(int[] item : mdsEnMatrix) {
            for(int num : item) System.out.printf("%2d ", num);
            System.out.println();
        }
        System.out.println();

        for(int[] item : mdsDeMatrix) {
            for(int num : item) System.out.printf("%2d ", num);
            System.out.println();
        }
        System.out.println();
    }
}
