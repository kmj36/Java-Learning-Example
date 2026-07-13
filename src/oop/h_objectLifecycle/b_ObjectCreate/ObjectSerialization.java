package oop.h_objectLifecycle.b_ObjectCreate;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

class ClockSerialization extends Clock implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return String.format("ClockSerialization{time=%d}", getTime());
    }
}

public class ObjectSerialization {
    static void main() {
        ClockSerialization cs = new ClockSerialization();

        cs.setTime(System.currentTimeMillis());
        System.out.println("직렬화 전: " + cs);

        byte[] bytes = new byte[0];

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos =  new ObjectOutputStream(baos);
            oos.writeObject(cs);
            bytes = baos.toByteArray();
            
        } catch (IOException e) {
            System.out.printf("직렬화 예외: %s\n", e.getMessage());
        }

        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(bais);
            ClockSerialization restored = (ClockSerialization) ois.readObject();
            System.out.println("역직렬화 후: " + restored.getTime());

        } catch (IOException | ClassNotFoundException e) {
            System.out.printf("역직렬화 예외: %s\n", e.getMessage());
        }
    }
}
