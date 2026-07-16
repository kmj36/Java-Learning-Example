package h_OOP.n_Interface.k_crossCuttingConcern;

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

class Document implements Storable {
    private String title = "계약서";

    @Override
    public void store() {
        System.out.println(title + " 문서를 캐비닛에 보관합니다.");
    }
}

public class crossCuttingConcern {
    public static void main(String[] args) {
        Car car = new Car();

        Storable storable = car;
        storable.store();

        if (storable instanceof Car) {
            Car castedCar = (Car) storable;
            castedCar.drive();
        }

        System.out.println("---");

        Storable[] items = { new Car(), new Document() };
        for (Storable item : items) {
            item.store();
        }

        System.out.println("---");

        // 잘못된 캐스팅 시도: ClassCastException 발생 예시
        Storable doc = new Document();
        try {
            Car wrongCast = (Car) doc; // Document는 Car가 아니므로 런타임 예외 발생
            wrongCast.drive();
        } catch (ClassCastException e) {
            System.out.println("캐스팅 실패: " + e.getMessage());
        }

        System.out.printf("object car: 0x08%x\r\n", car.hashCode());
        System.out.printf("object storage: 0x08%x\r\n", storable.hashCode());
    }
}