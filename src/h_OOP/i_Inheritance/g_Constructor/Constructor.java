package h_OOP.i_Inheritance.g_Constructor;

class Vehicle {
    private final String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }
}

public class Constructor {
    static void main() {
        Car car = new Car("asdf");
        System.out.printf("car: %s\n", car.getName());
    }
}
