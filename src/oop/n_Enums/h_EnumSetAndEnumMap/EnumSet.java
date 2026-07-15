package oop.n_Enums.h_EnumSetAndEnumMap;

enum LogLevel {
    TRACE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    CRITICAL,
    NONE
}

public class EnumSet {
    static void main() {
        java.util.EnumSet<LogLevel> enumSet = java.util.EnumSet.of(LogLevel.CRITICAL, LogLevel.WARN);
        System.out.println("초기 집합: " + enumSet);

        enumSet.add(LogLevel.ERROR);
        System.out.println("ERROR 추가 후: " + enumSet);
        System.out.println("ERROR 포함 여부: " + enumSet.contains(LogLevel.ERROR));
        System.out.println("DEBUG 포함 여부: " + enumSet.contains(LogLevel.DEBUG));

        System.out.println("--- 순회 (선언 순서 유지) ---");
        for (LogLevel level : enumSet) {
            System.out.println(level);
        }

        enumSet.remove(LogLevel.WARN);
        System.out.println("WARN 제거 후: " + enumSet);

        java.util.EnumSet<LogLevel> rangeSet = java.util.EnumSet.range(LogLevel.INFO, LogLevel.CRITICAL);
        System.out.println("range(INFO~CRITICAL): " + rangeSet);

        java.util.EnumSet<LogLevel> allSet = java.util.EnumSet.allOf(LogLevel.class);
        System.out.println("전체: " + allSet);

        java.util.EnumSet<LogLevel> complement = java.util.EnumSet.complementOf(enumSet);
        System.out.println("enumSet의 여집합: " + complement);

        java.util.EnumSet<LogLevel> noneSet = java.util.EnumSet.noneOf(LogLevel.class);
        noneSet.add(LogLevel.TRACE);
        noneSet.add(LogLevel.DEBUG);
        System.out.println("noneOf로 시작 후 추가: " + noneSet);

        java.util.EnumSet<LogLevel> unionSet = java.util.EnumSet.copyOf(rangeSet);
        unionSet.addAll(noneSet); // 합집합
        System.out.println("합집합: " + unionSet);

        java.util.EnumSet<LogLevel> intersection = java.util.EnumSet.copyOf(allSet);
        intersection.retainAll(rangeSet); // 교집합
        System.out.println("교집합(allSet ∩ rangeSet): " + intersection);
    }
}
