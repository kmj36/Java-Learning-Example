package h_OOP.s_PassByValue.c_swapTest;

class Dog {
    private String name;

    public static void swap(Dog d1, Dog d2) {
        // main a is Not equal parameter d1
        // main b is Not equal parameter d2
        Dog temp = d1;
        d1 = d2;
        d2 = temp;
    }

    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class swapTest {
    static void main(String[] args) {
        Dog a = new Dog("A");
        Dog b = new Dog("B");

        Dog.swap(a, b);

        System.out.println(a.getName());
        System.out.println(b.getName());
    }
}
