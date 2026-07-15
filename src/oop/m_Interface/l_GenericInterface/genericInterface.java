package oop.m_Interface.l_GenericInterface;

interface Storable {
    void store();
}

interface Drivable {
    void drive();
}

class Car implements Storable, Drivable {
    private String model = "Sonata";

    @Override
    public void store() {
        System.out.println(model + " 차량을 창고에 보관합니다.");
    }

    @Override
    public void drive() {
        System.out.println(model + " 차량이 주행합니다.");
    }
}

interface MyProducer<T> {
    T produce();
}

class CarProducer<T> implements MyProducer<T> {
    @Override
    public T produce() {
        return (T) new Car();
    }
}

public class genericInterface {
    static void main() {
        MyProducer<Car> myCarProducer = new CarProducer<Car>();
        Car car = myCarProducer.produce();
        car.drive();
        car.store();
    }
}
