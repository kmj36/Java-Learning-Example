package i_ExceptionHandling.h_tryWithResources;

class Try_withDemo {
    // 커스텀 AutoCloseable 자원 (파일 대신 동작을 눈으로 확인하기 위함)
    static class Resource implements AutoCloseable {
        private final String name;
        private final boolean throwOnClose;

        Resource(String name, boolean throwOnClose) {
            this.name = name;
            this.throwOnClose = throwOnClose;
            System.out.println(name + " 열림");
        }

        void use() {
            System.out.println(name + " 사용 중");
        }

        @Override
        public void close() {
            System.out.println(name + " 닫힘");
            if (throwOnClose) {
                throw new RuntimeException(name + " close() 중 예외 발생");
            }
        }
    }
}

public class tryWithResource {
    public static void main(String[] args) {
        try (Try_withDemo.Resource r1 = new Try_withDemo.Resource("Resource-1", false);
             Try_withDemo.Resource r2 = new Try_withDemo.Resource("Resource-2", true)) {

            r1.use();
            r2.use();
            throw new RuntimeException("try 블록 내부 예외 발생");

        } catch (RuntimeException e) {
            System.out.println("catch: " + e.getMessage());

            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println("  suppressed: " + suppressed.getMessage());
            }
        }
    }
}