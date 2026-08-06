package n_dependencyInjection.c_SetterInjection;

import java.util.Optional;

class Engine {
    private final int maxSpeed;

    public Engine(int setMaxSpeed) {
        this.maxSpeed = setMaxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

class Car {
    private Engine engine;

    void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Integer getMaxSpeed() {
        return Optional.ofNullable(engine)
                .orElseThrow(() -> new RuntimeException("Engine is null."))
                .getMaxSpeed();
    }
}

public class SetterInjection {
    static void main(String[] args) {
        Engine max160Engine = new Engine(160);
        Engine max80Engine = new Engine(80);

        Car car = new Car();

        car.setEngine(max160Engine);
        System.out.println("Car : " + car.getMaxSpeed());

        car.setEngine(max80Engine);
        System.out.println("Car : " + car.getMaxSpeed());

        car.setEngine(null);
        try {
            System.out.println("Car : " + car.getMaxSpeed());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
