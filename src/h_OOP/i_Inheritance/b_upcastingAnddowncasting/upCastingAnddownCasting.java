package h_OOP.i_Inheritance.b_upcastingAnddowncasting;

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
    int numberOfSeats;
}

public class upCastingAnddownCasting {
    static void main() {
        Car car = new Car();
        car.setLicensePlate("12-가1234");
        car.numberOfSeats = 4;

        Vehicle vehicle = car; // new Car() 를 class Vehicle 로 취급
        Car car2 = (Car) vehicle; // 본래 class Car 로 취급

        Vehicle origin = new Vehicle();
        origin.setLicensePlate("23-나2345");

        // new Vehicle() 를 자식 class Car 로 강제 취급하려 하면 ClassCastException 런타임 에러 발생!
        Car newCar = (Car) origin;
    }
}
