package r_collections.c_Set.i_CopyMethods;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Data implements Serializable {
    public Integer number;

    Data(Integer number) {
        this.number = number;
    }

    Data(Data obj) {
        this.number = obj.number;
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }
}

public class CopyMethods {
    static void main(String[] args) {
        List<Data> list = List.of(
                new Data(1),
                new Data(2),
                new Data(3)
        );
        HashSet<Data> set = new HashSet<>(list);

        // - Shallow Copy -
        // 1. new HashSet<>(original)
        Set<Data> constructor = new HashSet<>(set);

        // 2. copy.addAll(original)
        Set<Data> AddAll = new HashSet<>();
        AddAll.addAll(set);

        // 3. original.clone()
        Set<Data> cloneable = (HashSet<Data>) set.clone();

        // 4. Set.copyOf(original)
        Set<Data> immutable = Set.copyOf(set);

        // 5. original.stream().collect(Collectors.toSet());
        Set<Data> streamSet = set.stream().collect(Collectors.toSet());

        // - Deep Copy -
        // 1. set.stream().map((obj) -> new Data(obj)).collect(Collectors.toSet())
        Set<Data> mapSet = set.stream().map(Data::new).collect(Collectors.toSet());

        // 2. to ByteStream
        Set<Data> byteStreamCopy;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(set);
            oos.flush();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            byteStreamCopy = (Set<Data>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("%n%n set: %s %n", set);
        System.out.printf("Changing 1 to 255 in Data List.%n");
        list.getFirst().number = 255;

        System.out.printf("%n- Set Shallow Copy -%n");
        System.out.printf("[new HashSet<>(original)]%n");
        System.out.printf("constructor : %s %n", constructor);
        System.out.println();

        System.out.printf("[copy.addAll(original)]%n");
        System.out.printf("AddAll : %s %n", AddAll);
        System.out.println();

        System.out.printf("[original.clone()]%n");
        System.out.printf("cloneable : %s %n", cloneable);
        System.out.println();

        System.out.printf("[Set.copyOf(original)]%n");
        System.out.printf("immutable : %s %n", immutable);
        System.out.println();

        System.out.printf("[original.stream().collect(Collectors.toSet())]%n");
        System.out.printf("streamSet : %s %n", streamSet);
        System.out.println();

        System.out.printf("%n- Set Deep Copy -%n");
        System.out.printf("[set.stream().map(Data::new).collect(Collectors.toSet())]%n");
        System.out.printf("mapSet : %s %n", mapSet);
        System.out.println();

        System.out.printf("[to byteStream]%n");
        System.out.printf("byteStreamCopy : %s %n", byteStreamCopy);
        System.out.println();
    }
}
