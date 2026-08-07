package o_JavaIOStream.g_ObjectStreams;

import java.io.*;

class Person implements Serializable {
    private final String name;
    private final Integer age;
    private final Boolean isStudent;



    Person(String name, Integer age, Boolean isStudent) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
    }

    public String getInfo() {
        return String.format("name: %s\nage: %s\nisStudent: %s", name, age, isStudent);
    }
}

public class ObjectStreams {
    static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("테스트", 99, false);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person restored = (Person) in.readObject();
            System.out.print(restored.getInfo());
        }
    }
}
