package j_Stacktrace.f_SuppressedExceptions;

public class SuppressedExceptions {
   static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("최종적으로 잡힌 예외: " + e.getMessage());
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("  - 억제된 예외: " + suppressed.getMessage());
            }
        }
    }

    static void method() {
        RuntimeException originalException = null;
        try {
            originalException = new RuntimeException("try에서 발생");
            throw originalException;
        } catch (RuntimeException e) {
            // 여기서 별도 처리를 하거나 그냥 넘어갈 수 있음
        } finally {
            RuntimeException fromFinally = new RuntimeException("finally에서 발생");
            fromFinally.addSuppressed(originalException); // 정보 유실 방지
            throw fromFinally;
        }
    }
}
