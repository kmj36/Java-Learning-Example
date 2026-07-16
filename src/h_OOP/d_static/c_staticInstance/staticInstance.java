package h_OOP.d_static.c_staticInstance;

class Car {
    private String name;
    public static int numberOfCars;

    public Car(String name) {
        this.name = name;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }
}

public class staticInstance {
    static void main() {
        Car car1 = new Car("Jaguar");
        Car car2 = new Car("bugatti");

        System.out.println(Car.numberOfCars);
        System.out.println(car1.getName());
        System.out.println(car2.getName());
    }
}
