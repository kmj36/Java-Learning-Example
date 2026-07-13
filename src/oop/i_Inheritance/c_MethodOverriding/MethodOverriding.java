package oop.i_Inheritance.c_MethodOverriding;

class Vehicle {
    protected String licensePlate;

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}

class Car extends Vehicle {
    @Override
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate.toLowerCase();
    }
}

public class MethodOverriding {
    static void main() {
        Car car = new Car();
        car.setLicensePlate("ABC-1234");
        System.out.printf("car: LicenseNumber: %s", car.getLicensePlate());
    }
}
