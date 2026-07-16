package h_OOP.q_InitializerBlock.d_forwardReference;

class Example {
    {
        i = j = 10;

        int result = this.i * this.j;

        //int x = i;
    }

    int i;
    int j = 100;
}

public class forwardReference {
    static void main() {
        Example e = new Example();
        System.out.println(e.i);
        System.out.println(e.j);
    }
}
