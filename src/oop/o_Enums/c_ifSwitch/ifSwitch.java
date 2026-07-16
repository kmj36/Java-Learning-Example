package oop.o_Enums.c_ifSwitch;

enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    CRITICAL,
    NONE
}

public class ifSwitch {
    static void main() {
        LogLevel level = LogLevel.CRITICAL;

        // switch 표현식(Arrow 문법) - 각 case에서 실제 동작 수행
        switch (level) {
            case TRACE -> System.out.println("[TRACE] 상세 디버깅 정보 출력");
            case DEBUG -> System.out.println("[DEBUG] 개발자용 디버그 정보 출력");
            case INFO -> System.out.println("[INFO] 일반 정보성 메시지 출력");
            case WARN -> System.out.println("[WARN] 경고: 잠재적 문제 발생 가능");
            case ERROR -> System.out.println("[ERROR] 오류 발생, 기능 일부 실패");
            case CRITICAL -> System.out.println("[CRITICAL] 심각: 시스템 중단 위험");
            case NONE -> System.out.println("로그를 출력하지 않음");
        }

        // switch 표현식으로 값을 바로 반환받는 예시 (심각도 숫자 매핑)
        int severity = switch (level) {
            case TRACE -> 0;
            case DEBUG -> 1;
            case INFO -> 2;
            case WARN -> 3;
            case ERROR -> 4;
            case CRITICAL -> 5;
            case NONE -> -1;
        };

        System.out.println(severity);
    }
}
