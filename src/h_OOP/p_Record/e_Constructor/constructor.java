package h_OOP.p_Record.e_Constructor;

record Person(String name, String address) {
    public Person(String name, String address) {
        this.name = name; // 필드 초기화
        this.address = address; // 필드 초기화
    }
}

public class constructor {
    static void main() {
        Person p = new Person("Alex", "none");
        System.out.println(p);
    }
}
