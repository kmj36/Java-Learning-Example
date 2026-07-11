package f_arrays;

public class e_multiDimensionalArray {
    public static void main(String[] args) {
        int[][] intArray = new int[10][20];   // 10 x 20 배열
        intArray[0][2] = 129;

        // 순회는 중첩 for문 필요
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
