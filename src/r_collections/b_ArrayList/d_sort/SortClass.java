package r_collections.b_ArrayList.d_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortClass {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Car322", "Car446", "Car1", "Car2422", "Car5"));

        // 자연 순서 (문자열이면 사전순)
        Collections.sort(list);
        System.out.printf("[Collections.sort(list)]%n");
        System.out.printf("list: %s%n%n", list);

        // Comparator 지정
        Collections.sort(list, Comparator.reverseOrder());
        System.out.printf("[Collections.sort(list, Comparator.reverseOrder())]%n");
        System.out.printf("list: %s%n%n", list);

        // List 자체 sort Method
        list.sort(Comparator.comparing(String::length));
        System.out.printf("[list.sort(Comparator.comparing(String::length))]%n");
        System.out.printf("list: %s%n%n", list);
    }
}
