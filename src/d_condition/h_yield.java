package d_condition;

public class h_yield {
    public static void main() {
        String fruit = "사과";
        int price = switch (fruit) {
            case "사과" -> {
                System.out.println("사과를 고르셨군요.");
                int basePrice = 1000;
                yield basePrice + 500; // 최종 반환값
            }
            case "바나나" -> {
                yield 2000;
            }
            default -> 0;
        };
        System.out.println(price);
    }
}