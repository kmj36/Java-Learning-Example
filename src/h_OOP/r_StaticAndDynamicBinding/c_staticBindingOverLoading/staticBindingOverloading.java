package h_OOP.r_StaticAndDynamicBinding.c_staticBindingOverLoading;

class Animal {

}

class Dog extends Animal {

}

class AnimalActivity {
    public static void eat(Animal animal) {
        System.out.println("Animal is eating");
    }

    public static void eat(Dog dog) {
        System.out.println("Dog is eating");
    }
}

public class staticBindingOverloading {
    static void main(String[] args) {
        Animal dogAnimal = new Dog();
        AnimalActivity.eat(dogAnimal);
    }
}
