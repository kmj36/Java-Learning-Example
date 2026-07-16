package h_OOP.a_ClassAndObjects.a_classDefine;

class Bicycle {
    private int gear = 5;

    public void braking() {
        System.out.println("Working of Braking");
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return this.gear;
    }
}

public class classDefine {
    public static void main() {
        Bicycle b = new Bicycle();

        b.setGear(2);
        System.out.printf("current gear: %d\n", b.getGear());

        b.braking();
    }
}
