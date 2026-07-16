package h_OOP.n_Interface.d_MultipleInterfaces;

interface Fly {
    void fly();
}

interface Transform {
    void transform();
}

class Car implements Fly, Transform {
    @Override
    public void fly() { System.out.println("I can Fly!!"); }

    @Override
    public void transform() { System.out.println("I can Transform!!"); }
}

public class MultipleInterfaces {
    static void main() {
        Car car = new Car();

        car.fly();
        car.transform();
    }
}
