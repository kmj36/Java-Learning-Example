package n_dependencyInjection.d_InterfaceInjection;

import java.util.Optional;

interface EngineSetter {
    void setEngine(Engine engine);
}

class EngineInjector {
    private final Engine engine;

    public EngineInjector(Engine engine) {
        this.engine = engine;
    }

    public void inject(EngineSetter target) {
        target.setEngine(engine);
    }
}

class Engine {
    private final int maxSpeed;

    public Engine(int setMaxSpeed) {
        this.maxSpeed = setMaxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

class Car implements EngineSetter {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Integer getMaxSpeed() {
        return Optional.ofNullable(engine)
                .orElseThrow(() -> new RuntimeException("Engine is null."))
                .getMaxSpeed();
    }
}

public class InterfaceInjection {
    static void main(String[] args) {

        Engine max160Engine = new Engine(160);
        Engine max380Engine = new Engine(380);

        Car car = new Car();

        EngineInjector injector = new EngineInjector(max160Engine);
        injector.inject(car);
        System.out.println("Car : " + car.getMaxSpeed());

        EngineInjector sportCarInjector = new EngineInjector(max380Engine);
        sportCarInjector.inject(car);
        System.out.println("Car : " + car.getMaxSpeed());
    }
}