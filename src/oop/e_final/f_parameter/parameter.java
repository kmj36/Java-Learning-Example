package oop.e_final.f_parameter;

class Test {
    public void method(final int x) {
        //x -= 1;
    }
}

public class parameter {
    static void main() {
        Test t = new Test();
        t.method(1);
    }
}
