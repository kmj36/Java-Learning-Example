package n_dependencyInjection.a_TightCouplingProblem;

import java.util.List;

class Engine {
    private boolean isOn = false;

    public void setOn(boolean on) {
        isOn = on;
    }
}

class Door {

}

class Car {
    Engine engine = new Engine();
    List<Door> doors = List.of(
            new Door(),
            new Door(),
            new Door(),
            new Door()
    );
}

public class TightCoupling {
    static void main(String[] args) {
        // 다른 구현체로 교체하려면 class Car 코드 자체를 수정해야 함.
        // 단위 테스트 시 Mock 객체로 대체 불가능
        Car newCar = new Car();
        System.out.println(newCar);
    }
}
