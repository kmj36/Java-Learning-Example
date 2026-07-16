package h_OOP.h_objectLifecycle.b_ObjectCreate;

class ClockExtend extends Clock implements Cloneable {
    public ClockExtend clone() throws CloneNotSupportedException {
        return (ClockExtend) super.clone();
    }
}

public class ObjectCreateClone {
    static void main() {
        ClockExtend c = new ClockExtend();

        try {
            ClockExtend newClock = c.clone();

            newClock.setTime(System.currentTimeMillis());
            System.out.println(newClock.getTime());

        } catch (CloneNotSupportedException e) {
            System.out.println("Error: "+e.getLocalizedMessage());
        }
    }
}
