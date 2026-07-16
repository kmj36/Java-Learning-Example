package h_OOP.p_Record.d_additionalConstructor;

record Vehicle(String brand, String licensePlate) {
    public Vehicle(String brand) {
        this(brand, null);
    }
}

public class additionalConstructor {
    static void main() {
        Vehicle v = new Vehicle("Porsche");
        System.out.printf("v: brand - %s, license - %s", v.brand(), v.licensePlate());
    }
}
