package oop.i_Inheritance.e_instanceof;

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
    public void setLicensePlate(String license) {
        super.setLicensePlate(license);
    }
}

public class instanceOf {
    static void main() {
        Vehicle vehicle = new Car();
        boolean isCar = vehicle instanceof Car;
        if (isCar) {
            System.out.println("vehicle is class:Car");
        }
    }
}
