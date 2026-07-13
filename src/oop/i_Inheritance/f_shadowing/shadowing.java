package oop.i_Inheritance.f_shadowing;

class Vehicle {
    String licensePlate;
    public String getLicensePlate() { return licensePlate; }
}

class Car extends Vehicle {
    protected String licensePlate; // 부모 class를 '가림' (shadow)
    public void updateLicensePlate(String license) {
        this.licensePlate = license;
    }
}

public class shadowing {
    static void main() {
        Car car = new Car();
        car.updateLicensePlate("12-가1234");
        System.out.println(car.licensePlate);
    }
}