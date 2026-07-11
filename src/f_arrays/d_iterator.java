package f_arrays;

public class d_iterator {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        System.out.print("[ ");

        for (int number : intArray) {
            System.out.print(number);
            if(number != intArray.length - 1)
                System.out.print(", ");
        }

        System.out.print(" ]");
    }
}
