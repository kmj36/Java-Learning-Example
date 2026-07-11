package oop.b_AttributesAndMethods.c_methods;

class Car {
    public String color = null;

    public void setColor(String newColor) {
        this.color = newColor;
    }
}

public class methods {
    static void main() {
        Car car1 = new Car();
        car1.setColor("red");   // 메서드를 통해 속성 변경

        System.out.printf("car1 new color: %s", car1.color);
    }
}
