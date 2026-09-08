package q_generics.f_genericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class genericClass {
    public static <T> List<T> fromArrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T item : array) list.add(item);
        return list;
    }

    public static <T> long length(T[] numbers) {
        return Arrays.stream(numbers).count();
    }
}

public class genericMethod {
    static void main(String[] args) {
        Character[] cha = new Character[5];
        cha[0] = '1';
        cha[1] = '2';
        cha[2] = '3';
        cha[3] = '4';
        cha[4] = '5';

        System.out.println(genericClass.fromArrayToList(cha));
        System.out.println(genericClass.<Character>fromArrayToList(cha));

        System.out.println(genericClass.length(cha));
    }
}
