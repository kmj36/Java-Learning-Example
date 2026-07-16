package h_OOP.n_Interface.e_InterfaceFinal;

interface MyInterface {
    int FALSE = 0;
    int TRUE = 1;
}

public class InterfaceFinal {
    static void main() {
        MyInterface i = new MyInterface() {
        };

        if(MyInterface.TRUE != MyInterface.FALSE)
            System.out.println("1 ≠ 0");
    }
}
