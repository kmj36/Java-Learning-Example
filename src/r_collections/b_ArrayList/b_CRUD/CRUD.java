package r_collections.b_ArrayList.b_CRUD;

import java.util.ArrayList;

public class CRUD {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        System.out.printf("cars: %s%n", cars);

        cars.add(0, "Mazda");
        System.out.printf("cars: %s%n", cars);

        String first = cars.get(0);
        System.out.printf("cars first: %s%n", first);

        cars.set(0, "Opel");
        System.out.printf("cars: %s%n", cars);

        cars.remove(0);
        System.out.printf("cars: %s%n", cars);

        cars.add("Ferari");
        cars.remove("Volvo");
        System.out.printf("cars: %s%n", cars);

        cars.clear();
        System.out.printf("cars: %s%n", cars);

        int size = cars.size();
        System.out.printf("cars size: %d%n", size);
    }
}
