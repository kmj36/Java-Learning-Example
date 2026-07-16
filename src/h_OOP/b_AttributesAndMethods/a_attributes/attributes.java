package h_OOP.b_AttributesAndMethods.a_attributes;

class Car {
    public String brand = null;
    public String model = null;
    public String color = null;
}

public class attributes {
    static void main() {
        Car c = new Car();
        System.out.printf("new Car: brand: %s, model: %s, color: %s\n", c.brand, c.model, c.color);
    }
}
