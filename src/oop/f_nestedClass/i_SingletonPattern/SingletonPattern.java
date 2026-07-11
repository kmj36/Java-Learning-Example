package oop.f_nestedClass.i_SingletonPattern;

class Singleton {
    private Singleton() {}

    // SingletonHolder 가 static 중첩 클래스이기 때문에
    // getInstance 가 실제로 처음 호출될 때까지 로드되지 않습니다. (lazy initialization)
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    void Hello() {
        System.out.println("Hello, World!");
    }
}

public class SingletonPattern {
    static void main() {
        Singleton s = Singleton.getInstance();
        s.Hello();
    }
}
