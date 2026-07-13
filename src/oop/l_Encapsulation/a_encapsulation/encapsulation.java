package oop.l_Encapsulation.a_encapsulation;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    static void main() {
        Person p = new Person();
        p.setName("Alex");
        System.out.println(p.getName());
    }
}
