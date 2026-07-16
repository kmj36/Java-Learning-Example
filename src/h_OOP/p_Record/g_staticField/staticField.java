package h_OOP.p_Record.g_staticField;

record Person(String name, String address) {
    public static String UNKNOWN_ADDRESS = "Unknown";

    public static Person unnamed(String address) {
        return new Person("Unnamed", address);
    }
}

public class staticField {
    static void main() {
        Person p = new Person("Alex", Person.UNKNOWN_ADDRESS);
        Person person2 = Person.unnamed("100 Linda Ln.");

        System.out.println(p);
        System.out.println(person2);
    }
}
