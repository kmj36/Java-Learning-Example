package r_collections.b_ArrayList.a_NewArrayList;

import java.util.ArrayList;

public class newArrayList {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        ArrayList<String> cars2 = new ArrayList<>(20);
        ArrayList<String> cars3 = new ArrayList<>(cars2);

        for(int i = 0; i < 10; i++) cars.add(String.valueOf(i));
        for(int i = 0; i < 20; i++) cars2.add(String.valueOf(i));
        for(int i = 0; i < 10; i++) cars3.add(String.valueOf(-i));

        for(String car : cars)
            System.out.printf("%s ", car);

        System.out.println();

        for(String car : cars2)
            System.out.printf("%s ", car);

        System.out.println();

        for(String car : cars3)
            System.out.printf("%s ", car);

    }
}
