package h_OOP.c_AccessModifiers.h_extendsAccessModifiers;

class Animal {
    protected void sound() {
        System.out.println("동물 소리");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    //@Override
    /*private void sound() {
        System.out.println("야옹");
    }*/
}

public class extendsAccessModifiers {
    static void main() {

    }
}
