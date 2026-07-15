package oop.n_Enums.h_EnumSetAndEnumMap;

import java.util.EnumMap;
import java.util.Map;

enum LogLevel2 {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    CRITICAL,
    NONE
}

public class Enummap {
    static void main() {
        // 1) 생성 - 반드시 enum 클래스를 생성자에 명시
        EnumMap<LogLevel2, String> colorMap = new EnumMap<>(LogLevel2.class);

        // 2) 값 추가
        colorMap.put(LogLevel2.TRACE, "회색");
        colorMap.put(LogLevel2.DEBUG, "파랑");
        colorMap.put(LogLevel2.INFO, "초록");
        colorMap.put(LogLevel2.WARN, "노랑");
        colorMap.put(LogLevel2.ERROR, "빨강");
        colorMap.put(LogLevel2.CRITICAL, "진한 빨강");
        // NONE은 넣지 않음

        System.out.println("전체 맵: " + colorMap);

        // 3) 조회
        System.out.println("ERROR 색상: " + colorMap.get(LogLevel2.ERROR));
        System.out.println("NONE 포함 여부: " + colorMap.containsKey(LogLevel2.NONE));
        System.out.println("NONE 조회(없으면 null): " + colorMap.get(LogLevel2.NONE));

        // 4) 기본값과 함께 조회
        String noneColor = colorMap.getOrDefault(LogLevel2.NONE, "지정 안됨");
        System.out.println("NONE 색상(기본값): " + noneColor);

        // 5) 순회 - 선언 순서대로 자동 정렬됨
        System.out.println("--- 순회 (선언 순서 유지) ---");
        for (Map.Entry<LogLevel2, String> entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 6) 값 수정
        colorMap.put(LogLevel2.WARN, "주황"); // 같은 키로 put하면 덮어씀
        System.out.println("WARN 색상 변경 후: " + colorMap.get(LogLevel2.WARN));

        // 7) 삭제
        colorMap.remove(LogLevel2.TRACE);
        System.out.println("TRACE 제거 후: " + colorMap);

        // 8) 실전 활용 예시 - 로그 레벨별 카운터
        EnumMap<LogLevel2, Integer> countMap = new EnumMap<>(LogLevel2.class);
        LogLevel2[] incomingLogs = {
                LogLevel2.INFO, LogLevel2.ERROR, LogLevel2.INFO,
                LogLevel2.WARN, LogLevel2.ERROR, LogLevel2.ERROR
        };

        for (LogLevel2 level : incomingLogs) {
            countMap.merge(level, 1, Integer::sum); // 없으면 1, 있으면 +1
        }

        System.out.println("--- 로그 레벨별 발생 횟수 ---");
        for (Map.Entry<LogLevel2, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "회");
        }
    }
}