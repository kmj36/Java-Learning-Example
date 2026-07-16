package h_OOP.a_ClassAndObjects.d_LampExample;

class Lamp {
    boolean isOn;

    void turnOn() {
        isOn = true;
        System.out.printf("Light on? %s\n", isOn);
    }

    void turnOff() {
        isOn = false;
        System.out.printf("Light on? %s\n", isOn);
    }
}

public class LampExample {
    static void main() {
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();
        halogen.turnOff();
    }
}
