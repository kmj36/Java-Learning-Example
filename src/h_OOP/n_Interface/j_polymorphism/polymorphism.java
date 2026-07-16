package h_OOP.n_Interface.j_polymorphism;

import java.util.ArrayList;
import java.util.List;

interface Shape {
    String name();
    void add(Object newObj);
}

class Circle implements Shape {
    private final List<Object> items = new ArrayList<>();

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public void add(Object newObj) {
        items.add(newObj);
        System.out.println(name() + "에 객체 추가됨: " + newObj);
    }
}

class Square implements Shape {
    private final List<Object> items = new ArrayList<>();

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public void add(Object newObj) {
        items.add(newObj);
        System.out.println(name() + "에 객체 추가됨: " + newObj);
    }
}

public class polymorphism {
    static void main() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shape shape : shapes) {
            System.out.println(shape.name()); // 실제 타입에 맞는 메서드가 실행됨.
        }

        // add() 도 다형적으로 동작하는 것을 보여주는 예시
        for (Shape shape : shapes) {
            shape.add("샘플객체");
        }
    }
}
