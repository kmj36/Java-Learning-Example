package h_OOP.b_AttributesAndMethods.b_instanceValue;

class Car {
    public String brand = null;
    public String model = null;
    public String color = null;
}

public class instanceValue {
    static void main() {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "red";
        car2.color = "blue";

        System.out.printf("car1.color: \"%s\", car2.color: \"%s\"\n", car1.color, car2.color);
    }
}
