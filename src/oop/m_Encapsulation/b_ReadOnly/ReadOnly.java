package oop.m_Encapsulation.b_ReadOnly;

class Person {
    private final String name = "Alex";
    private final int age = 20;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ReadOnly {
    static void main() {
        Person p = new Person();
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
