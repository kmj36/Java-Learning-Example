package n_dependencyInjection.b_ConstructorInjection;

import java.util.Objects;

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
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = Objects.requireNonNull(engine, "engine must not be null");
    }

    public Integer getMaxSpeed() {
        return engine.getMaxSpeed();
    }
}

public class constructorInjection {
    static void main(String[] args) {
        Engine max160Engine = new Engine(160);
        Engine max80Engine = new Engine(80);

        Car car1 = new Car(max160Engine);
        Car car2 = new Car(max80Engine);

        System.out.println("Car1 : " + car1.getMaxSpeed());
        System.out.println("Car2 : " + car2.getMaxSpeed());
    }
}
