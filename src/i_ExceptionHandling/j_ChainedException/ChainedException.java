package i_ExceptionHandling.j_ChainedException;

class ChainedExceptionExample {

    // 원인 예외
    static class DatabaseException extends Exception {
        public DatabaseException(String message) {
            super(message);
        }
    }

    // 예외 래핑
    static class ServiceException extends Exception {
        public ServiceException(String message, Throwable cause) {
            // 여기서 원인 예외를 함께 전달
            super(message, cause);
        }
    }

    static void connectToDatabase() throws DatabaseException {
        throw  new DatabaseException("DB 연결 실패: 타임아웃 발생");
    }

    static void processRequest() throws ServiceException {
        try {
            connectToDatabase();
        } catch (DatabaseException e) {
            // 원래 예외(e)를 원인으로 포함해서 새로운 예외를 던짐
            throw new ServiceException("요청 처리 중 오류 발생", e);
        }
    }
}

public class ChainedException {
    static void main() {
        try {
            ChainedExceptionExample.processRequest();
        } catch (ChainedExceptionExample.ServiceException e) {
            System.out.println("예외 메시지: " + e.getMessage());
            System.out.println("원인 예외: " + e.getCause());

            // 전체 스택 트레이스 출력 (Caused by: 형태로 원인까지 함께 출력됨)
            e.printStackTrace();
        }
    }
}
