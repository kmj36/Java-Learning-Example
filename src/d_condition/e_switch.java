package d_condition;

import java.util.Random;

public class e_switch {
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(0, 4);
        switch (result) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println(result);
        }
    }
}
