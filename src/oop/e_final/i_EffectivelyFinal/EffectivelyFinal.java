package oop.e_final.i_EffectivelyFinal;

public class EffectivelyFinal {
    public void process() {
        int value = 10;

        Runnable r = () -> {
            //value = 20;
            System.out.println(value);
        };

        r.run();
        r.run();
        r.run();
    }

    static void main() {
        EffectivelyFinal ef = new EffectivelyFinal();
        ef.process();
    }
}
