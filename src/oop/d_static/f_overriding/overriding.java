package oop.d_static.f_overriding;

class Animal {
    public static void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {
    public static void sound() {
        System.out.println("멍멍");
    }
}


public class overriding {
    static void main() {
        Animal.sound();
        Dog.sound();
    }
}
