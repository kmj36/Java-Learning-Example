package oop.a_ClassAndObjects.c_member;

class Bicycle {
    int gear  = 5;
    void braking() {
        System.out.println("Breaking!");
    }
}

public class member {
    static void main() {
        Bicycle sportsBicycle = new Bicycle();

        System.out.printf("current gear: %d\n", sportsBicycle.gear);
        sportsBicycle.braking();
    }
}
