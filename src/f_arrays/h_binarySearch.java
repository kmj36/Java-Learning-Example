package f_arrays;

import java.util.Arrays;

public class h_binarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8, 10};

        // 1. 값을 찾은 경우
        int result1 = Arrays.binarySearch(arr, 6);
        System.out.println("6 검색 결과: " + result1);  // 3 (인덱스 3에 존재)

        // 2. 값을 못 찾은 경우 (중간)
        int result2 = Arrays.binarySearch(arr, 7);
        // 7이 들어갈 위치(인덱스) = 4
        // 반환값 = -(4) - 1 = -5
        System.out.println("7 검색 결과: " + result2);  // -5

        // 3. 모든 값보다 작은 경우
        int result3 = Arrays.binarySearch(arr, -1);
        // -1이 들어갈 위치 = 0
        // 반환값 = -(0) - 1 = -1
        System.out.println("-1 검색 결과: " + result3); // -1

        // 4. 모든 값보다 큰 경우 ★ 여기가 헷갈리는 지점
        int result4 = Arrays.binarySearch(arr, 100);
        // 100이 들어갈 위치 = length(6) → 배열 맨 뒤
        // 반환값 = -(6) - 1 = -7
        System.out.println("100 검색 결과: " + result4); // -7 (length-1이 아님!)

        // 삽입 위치를 실제로 알고 싶을 때 역산하는 방법
        int insertPoint = -(result4) - 1;
        System.out.println("100이 삽입될 위치: " + insertPoint); // 6
    }
}
