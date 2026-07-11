package oop.b_AttributesAndMethods.i_Encapsulation;

import java.util.Arrays;

class Car {
    private enum palette {
        RED("red"),
        BLUE("blue"),
        GREEN("green");

        private final String color;

        palette(String color) {
            this.color = color;
        }

        public String color() {
            return  color;
        }
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        boolean isExist = Arrays.stream(palette.values())
                .anyMatch(palette -> palette.color().equalsIgnoreCase(color));

        if(!isExist) {
            System.out.println("존재하지 않는 색상");
            return;
        }

        this.color = color;
    }
}

public class Encapsulation {
    static void main() {
        Car c = new Car();

        c.setColor("asdf");
        System.out.printf("Car c.color: %s", c.getColor());
    }
}
