package oop.n_Interface.i_defaultConflict;

interface Flyer {
    default String move() {
        return "비행";
    }
}

interface Swimmer {
    default String move() {
        return "수영";
    }
}

class Duck implements Flyer, Swimmer {
    @Override
    public String move() {
        return Swimmer.super.move();
    }
}

public class defaultConflict {
    static void main() {
        Duck d = new Duck();
        System.out.println(d.move());
    }
}
