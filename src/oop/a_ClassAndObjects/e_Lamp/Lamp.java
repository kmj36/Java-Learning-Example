package oop.a_ClassAndObjects.e_Lamp;

public class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.printf("Light on? %s\n", isOn);
    }

    static void main() {
        Lamp led = new Lamp();
        led.turnOn();
    }
}
