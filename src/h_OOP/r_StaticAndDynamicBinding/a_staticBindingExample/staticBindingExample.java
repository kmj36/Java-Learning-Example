package h_OOP.r_StaticAndDynamicBinding.a_staticBindingExample;

class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}

class Boy extends Human {
    public static void walk() {
        System.out.println("Boy walks");
    }
}

public class staticBindingExample {
    public static void main(String[] args) {
        Human obj = new Boy(); // 참조 타입 Human, 실제 객체 Boy
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();
    }
}
