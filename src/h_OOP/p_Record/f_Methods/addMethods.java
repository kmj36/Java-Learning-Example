package h_OOP.p_Record.f_Methods;

record Vehicle(String brand, String licensePlate) {
    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }
}

public class addMethods {
    static void main() {
        Vehicle v = new Vehicle("Porsche", null);
        System.out.println(v.brandAsLowerCase());
        System.out.println(v.licensePlate());
    }
}
