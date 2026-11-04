package s_concurrency.b_RaceCondition.l_NotRaceConditions.b_ConcurrentmodificationException;

import java.util.ArrayList;
import java.util.List;

public class failFast {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D"));

        for (String s : list) {          // 내부적으로 Iterator 사용
            if (s.equals("B")) {
                list.remove(s);          // Iterator 모르게 리스트 직접 수정
            }
        }
    }
}
