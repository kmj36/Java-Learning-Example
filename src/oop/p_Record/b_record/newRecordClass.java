package oop.p_Record.b_record;

record Person(String name, String address) {}

public class newRecordClass {
    static void main() {
        Person p = new Person("Alex", "1042 S CHAPEL NEWARK DE 19702-1304 USA");
        Person p2 = new Person("Michel", "None");
        System.out.println(p.name());
        System.out.println(p.address());
        System.out.println(p.equals(p2));
        System.out.printf("p: 0x%08x, p2: 0x%08x\n", p.hashCode(), p2.hashCode());
        System.out.println(p);
    }
}
