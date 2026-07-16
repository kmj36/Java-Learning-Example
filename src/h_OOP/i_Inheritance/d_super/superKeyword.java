package h_OOP.i_Inheritance.d_super;

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

public class superKeyword {
    static void main() {
        Car car = new Car();
        
        car.setLicensePlate("12-가1234");
        System.out.println(car.getLicensePlate());
    }
}
