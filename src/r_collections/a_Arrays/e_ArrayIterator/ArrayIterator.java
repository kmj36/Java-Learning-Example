package r_collections.a_Arrays.e_ArrayIterator;

public class ArrayIterator {
    static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,3,3,3,3,3,3};

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);

        System.out.println();

        for (int v : arr)
            System.out.print(v);
    }
}
