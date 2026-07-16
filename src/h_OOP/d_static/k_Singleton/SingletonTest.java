package h_OOP.d_static.k_Singleton;

class Singleton {
    private Singleton() {}

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    void printHello() {
        System.out.print("Hello");
    }
}

public class SingletonTest {
    static void main() {
        Singleton s = Singleton.getInstance();

        s.printHello();
    }
}
