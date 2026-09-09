package r_collections.b_ArrayList.c_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>(List.of("Car1", "Car2", "Car3", "Car4", "Car5"));

        // 인덱스 기반 for문
        for(int i = 0; i < cars.size(); i++)
            System.out.printf("%s ", cars.get(i));
        System.out.println();

        // for-each
        for (String car : cars)
            System.out.printf("%s ", car);
        System.out.println();

        // Iterator (순회 중 안전한 삭제 가능)
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            String c = it.next();
            if(c.equals("Car3")) {
                it.remove();
                continue;
            }

            System.out.printf("%s ", c);
        }
    }
}
