package i_ExceptionHandling.i_CustomException;

class InvalidOrderStateException extends RuntimeException {
    public InvalidOrderStateException(String message) {
        super(message);
    }
}

class Order {
    private String state;

    public void ship() {
        if (!"PAID".equals(state)) {
            throw new InvalidOrderStateException(
                    "결제가 필요합니다. 에러: " + state
            );
        }
        state = "SHIPPED";
    }
}

public class UnCheckedException {
    static void main(String[] args) {
        Order o = new Order();
        o.ship(); // 상품 PAID 상태가 아닌데, 배송을 시도하는 상황.
    }
}
