package h_OOP.a_ClassAndObjects.b_objectCreate;

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

public class objectCreate {
    static void main() {
        Bicycle sportsBicycle = new Bicycle();
        Bicycle touringBicycle = new Bicycle();

        sportsBicycle.setGear(3);
        touringBicycle.setGear(4);

        System.out.printf("sportsBicycle: gear: %d, hash: 0x%08x\n", sportsBicycle.getGear(), System.identityHashCode(sportsBicycle));
        System.out.printf("touringBicycle: gear: %d, hash: 0x%08x", touringBicycle.getGear(), System.identityHashCode(touringBicycle));
    }
}
