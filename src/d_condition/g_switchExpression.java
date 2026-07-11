package d_condition;

import java.util.Random;

public class g_switchExpression {
    public static void main() {
        int day = new Random().nextInt(1, 5);
        String dayType = switch(day) {
            case 1 -> "월";
            case 2 -> "화";
            default -> "기타";
        };
        System.out.printf("%s\n", dayType);
    }
}
