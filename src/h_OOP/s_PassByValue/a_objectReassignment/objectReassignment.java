package h_OOP.s_PassByValue.a_objectReassignment;

class Dog {
    public String name;

    static Dog changeReference(Dog d) {
        // 매개변수 d Ref 는 본문 aDog Ref 와 별도 인스턴스 변수다.
        d = new Dog("Fifi");
        return d;
    }

    Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class objectReassignment {
    static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog Fifi = Dog.changeReference(aDog);

        System.out.println(aDog.getName());
        System.out.println(Fifi.getName());
    }
}
