package h_OOP.p_Record.a_immutabilityData;

import java.util.Objects;

class Person {
    private final String name;
    private final String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if(!(obj instanceof Person))
            return false;

        Person other = (Person) obj;
        return Objects.equals(name, other.name) &&
                Objects.equals(address, ((Person) obj).address);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}

public class immutabilityData {
    static void main() {
        Person p = new Person("Alex", "1042 S CHAPEL NEWARK DE 19702-1304 USA");
        System.out.println(p);
    }
}
