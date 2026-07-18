package i_ExceptionHandling.d_Catches;

public class multipleCatch {
    static void main(String[] args) {
        try {
            String word = "abc";
            int number = Integer.parseInt(word);
            int result = 100 / number;
        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닙니다");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
    }
}
