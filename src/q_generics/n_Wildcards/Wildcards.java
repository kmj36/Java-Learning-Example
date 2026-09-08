package q_generics.n_Wildcards;

import java.util.ArrayList;
import java.util.List;

class CollectionPipelines {
    // Producer(읽기 전용): 값을 읽기만 함
    public static double sumOfList(List<? extends Number> src) {
        double total = 0.0;
        for (Number num : src)
            total += num.doubleValue(); // 값을 읽음.
        return total;
    }

    // Consumer(쓰기 전용): 값을 쓰기만 함
    public static void addNumbers(List<? super Integer> dest) {
        for (int i = 1; i <= 5; i++)
            dest.add(i); // 값을 씀.
    }
}

public class Wildcards {
    static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        System.out.println(CollectionPipelines.sumOfList(List.of(1,2,3,4)));

        CollectionPipelines.addNumbers(list);
        System.out.println(list);
    }
}
