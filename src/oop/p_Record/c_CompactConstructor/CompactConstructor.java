package oop.p_Record.c_CompactConstructor;

import java.util.Objects;

record Person(String name, String address) {
    public Person {
        Objects.requireNonNull(name);
        Objects.requireNonNull(address);
    }
}

public class CompactConstructor {
    static void main() {
        Person p = new Person(null, "Some Address");
    }
}
