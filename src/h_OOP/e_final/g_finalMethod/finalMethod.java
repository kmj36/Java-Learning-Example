package h_OOP.e_final.g_finalMethod;

class Dog {
    public final void sound() {
        System.out.println("...");
    }
}

class BlackDog extends Dog {
   /* public void sound() {
        System.out.println("멍멍");
    }*/
}

public class finalMethod {
    static void main() {
        BlackDog bd = new BlackDog();
        bd.sound();
    }
}