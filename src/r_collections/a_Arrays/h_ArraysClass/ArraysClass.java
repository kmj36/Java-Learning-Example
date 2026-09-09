package r_collections.a_Arrays.h_ArraysClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ArraysClass {
    static void main(String[] args) {
        Integer[] arr = {96,33,34,5,6,71,39,72,41,76,78,15,17,53,54,55,94,62,63,31};

        // Arrays.toString(arr)
        System.out.printf("[Arrays.toString(arr)]%n");
        System.out.printf("arr: %s%n",Arrays.toString(arr));
        System.out.println();

        // Arrays.sort(arr)
        System.out.printf("[Arrays.sort(arr)]%n");
        Arrays.sort(arr);
        System.out.printf("arr: %s%n",Arrays.toString(arr));
        System.out.println();

        // Arrays.sort(arr, comparator)
        System.out.printf("[Arrays.sort(arr, comparator)]%n");
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.printf("arr: %s%n",Arrays.toString(arr));
        System.out.println();

        // Arrays.fill(arr, value)
        System.out.printf("[Arrays.fill(arr, value)]%n");
        Integer[] arr2 = new Integer[arr.length];
        Arrays.fill(arr2, 0xFF);
        System.out.printf("arr2: %s%n",Arrays.toString(arr2));
        System.out.println();

        // Arrays.binarySearch(sortedArr, key)
        System.out.printf("[Arrays.binarySearch(sortedArr, key)]%n");
        int key = 31;
        System.out.printf("Find: %d%n", key);
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, 31);
        System.out.printf("Index is %d.%n", idx);
        System.out.printf("Array Access Result: %d%n", arr[idx]);
        System.out.println();

        // Arrays.equals(a, b)
        System.out.printf("[Arrays.equals(a, b)]%n");
        System.out.printf("Compare arr / arr2 : %s%n", Arrays.equals(arr, arr2));
        System.out.println();

        // Arrays.copyOf(arr, newLength)
        System.out.printf("[Arrays.copyOf(arr, newLength)]%n");
        Integer[] copyOfArr = Arrays.copyOf(arr, arr.length+3);
        System.out.printf("copyOfArr: %s%n",Arrays.toString(copyOfArr));
        System.out.println();

        // Arrays.copyOfRange(arr, from, to)
        System.out.printf("[Arrays.copyOfRange(arr, from, to)]%n");
        Integer[] copyOfRange5_10_Arr = Arrays.copyOfRange(arr, 5, 10);
        System.out.printf("copyOfRange5_10_Arr: %s%n",Arrays.toString(copyOfRange5_10_Arr));
        System.out.println();

        // Arrays.asList(arr)
        System.out.printf("[Arrays.asList(arr)]%n");
        List<Integer> intList = Arrays.asList(arr);
        System.out.printf("intList: %s%n", intList);
        System.out.println();

        // Arrays.stream(arr)
        System.out.printf("[Arrays.stream(arr)]%n");
        Stream<Integer> stream = Arrays.stream(arr);
        Optional<Integer> result = stream.sorted().filter((c) -> c.equals(31)).findFirst();
        result.ifPresent(System.out::print);
        System.out.println();
    }
}
