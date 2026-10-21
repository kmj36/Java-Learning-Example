package r_collections.h_Iterator.h_Spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class spliterator {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        Spliterator<String> rear = list.spliterator();
        Spliterator<String> front = rear.trySplit();
        Spliterator<String> middle = front.trySplit();

        rear.forEachRemaining(System.out::println);
        System.out.println();
        front.forEachRemaining(System.out::println);
        System.out.println();
        middle.forEachRemaining(System.out::println);
    }
}
