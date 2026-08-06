package n_dependencyInjection.f_DiffServiceLocator;

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

class ServiceLocator {
    private static Engine engine = new Engine(200);

    public static Engine getEngine() {
        return engine;
    }

    // 테스트/설정 변경 시 전역 상태를 직접 바꿔야 함.
    public static void setEngine(Engine e) {
        engine = e;
    }
}

class CarWithStatic {
    public CarWithStatic() {

    }

    public int getMaxSpeed() {
        // 클래스가 의존성을 요청(pull).
        Engine engine = ServiceLocator.getEngine();
        return engine.getMaxSpeed();
    }
}

public class diffServiceLocator {
    static void main(String[] args) {
        CarWithStatic carStatic = new CarWithStatic();
        System.out.println(carStatic.getMaxSpeed());

        Engine newEngine = new Engine(300);
        Car car = new Car(newEngine);
        System.out.println(car.getMaxSpeed());
        System.out.println();

        ServiceLocator.setEngine(new Engine(99999)); // 전역 상태 오염

        System.out.println(carStatic.getMaxSpeed());
        System.out.println(car.getMaxSpeed());
    }
}
