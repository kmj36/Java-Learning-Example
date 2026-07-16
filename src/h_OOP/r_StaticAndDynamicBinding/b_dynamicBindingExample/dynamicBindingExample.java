package h_OOP.r_StaticAndDynamicBinding.b_dynamicBindingExample;

class Human {
    public void walk() {
        System.out.println("Human walks");
    }
}

 class Demo extends Human {
    @Override
    public void walk() {
        System.out.println("Boy walks");
    }
 }

public class dynamicBindingExample {
    static void main(String[] args) {
        Human obj = new Demo();
        Human obj2 = new Human();

        obj.walk();
        obj2.walk();
    }
}
