package r_collections.a_Arrays.g_ArrayRemove;

public class ArrayRemove {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int insertIndex = 2;
        int deleteIndex = 2;


        // Insert : 삽입할 index 뒤 원소들을 뒤로 한칸 씩 밀고 새 값을 대입
        for (int i = arr.length - 1; i > insertIndex; i--) arr[i] = arr[i - 1];
        arr[insertIndex] = 0;

        for(int item : arr) System.out.print(item);
        System.out.println();

        // Remove : 삭제할 index 뒤 원소들을 한 칸씩 앞으로 당김.
        for (int i = deleteIndex; i < arr.length - 1; i++) arr[i] = arr[i + 1];

        for(int item : arr) System.out.print(item);
        System.out.println();
    }
}
