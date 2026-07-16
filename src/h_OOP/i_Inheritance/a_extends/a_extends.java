package h_OOP.i_Inheritance.a_extends;

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

public class a_extends {
    static void main() {
        Car c = new Car();
        c.setLicensePlate("12-가1234");
        c.numberOfSeats = 4;

        System.out.printf("Car c: License - \"%s\", Seats: %d", c.getLicensePlate(), c.numberOfSeats);
    }
}
