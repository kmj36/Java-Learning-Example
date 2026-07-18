package i_ExceptionHandling.e_multiCatch;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class SQLDoWork {
    private static final Logger logger = Logger.getLogger(SQLDoWork.class.getName());

    // 상황에 따라 IOException 또는 SQLException을 던지는 메서드
    static void doWork(int type) throws IOException, SQLException {
        if (type == 1) {
            throw new IOException("파일을 읽을 수 없습니다.");
        } else if (type == 2) {
            throw new SQLException("데이터베이스 연결에 실패했습니다.");
        } else {
            System.out.println("작업이 정상적으로 처리되었습니다.");
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}

public class multiCatch {
    public static void main(String[] args) {
        int[] testCases = {1, 2, 0}; // IOException, SQLException, 정상 케이스 순서로 테스트

        for (int type : testCases) {
            try {
                SQLDoWork.doWork(type);
            } catch (IOException | SQLException ex) {
                // 공통 처리 로직
                SQLDoWork.getLogger().log(Level.WARNING, "예외 발생: " + ex.getMessage(), ex);
                System.out.println("[처리됨] " + ex.getClass().getSimpleName() + " -> " + ex.getMessage());
                // 필요하다면 상위로 다시 던질 수도 있음 (여기서는 프로그램 계속 진행을 위해 생략)
                // throw ex; // main에 throws 절이 없으므로 실제로 던지려면 시그니처 수정 필요
            }
        }

        System.out.println("모든 테스트 케이스 처리 완료");
    }
}