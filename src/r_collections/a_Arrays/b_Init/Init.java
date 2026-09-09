package r_collections.a_Arrays.b_Init;

public class Init {
    static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int[] nums2 = new int[]{0,1,2,3,4,5,6,7,8,9};
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        for(int num : nums) System.out.print(num);
        System.out.println();

        for(int num : nums2) System.out.print(num);
        System.out.println();

        for(char cha : alphabets) System.out.print(cha);
        System.out.println();
    }
}
