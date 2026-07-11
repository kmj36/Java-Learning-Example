package d_condition;

import java.util.Date;
import java.util.Random;

public class f_switch2 {
    public static void main() {
        Date date = new Date();
        Random rand = new Random(date.getTime());

        switch (rand.nextInt(1, 8)) {
            case 1: System.out.println("월"); break;
            case 2: System.out.println("화"); break;
            case 3: System.out.println("수"); break;
            case 4: System.out.println("목"); break;
            case 5: System.out.println("금"); break;
            case 6: case 7: System.out.println("주말"); break;
        }
    }
}