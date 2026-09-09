package r_collections.a_Arrays.a_newArray;

public class NewArray {
    static void main(String[] args) {
        int[] arr = new int[10];
        String[] strArr = new String[26];

        for(int i = 0; i < arr.length; i++)
            arr[i] = i;

        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
        System.out.println();

        int a = 'a';
        for(int i = 0; i < strArr.length; i++)
            strArr[i] = String.valueOf((char)a++);

        for(String elem : strArr)
            System.out.print(elem);
        System.out.println();
    }
}
