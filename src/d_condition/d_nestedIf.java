package d_condition;

public class d_nestedIf {
    public static void main() {
        int age = 20;
        boolean isCitizen = true;
        if (age >= 18) {
            if (isCitizen) {
                System.out.println("Vote");
            }
        }
    }
}
