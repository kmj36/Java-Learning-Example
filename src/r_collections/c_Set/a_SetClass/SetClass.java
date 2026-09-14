package r_collections.c_Set.a_SetClass;

import java.util.EnumSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new LinkedHashSet<>();
        Set<String> setC = new TreeSet<>();
        EnumSet<Day> setD;

        // setA HashSet
        System.out.printf("[setA HashSet]%n");
        setA.add("3");
        setA.add("1");
        setA.add("2");
        setA.add(null);

        System.out.printf("setA: %s %n", setA);
        System.out.printf("Insert duplicate value 1%n");
        setA.add("1");

        System.out.printf("setA: %s %n", setA);

        // setB LinkedHashSet
        System.out.printf("%n[setB LinkedHashSet]%n");
        setB.add(null);
        setB.add("2");
        setB.add("3");
        setB.add("1");

        System.out.printf("setB: %s %n", setB);
        System.out.printf("Insert duplicate value 1%n");
        setB.add("1");

        System.out.printf("setB: %s %n", setB);

        // setC TreeSet
        System.out.printf("%n[setC TreeSet]%n");
        setC.add("3");
        setC.add("1");
        setC.add("2");
        //setC.add(null); // TreeSet 에서 null 삽입이 허용되지 않음.

        System.out.printf("setC: %s %n", setC);
        System.out.printf("Insert duplicate value 1%n");
        setC.add("1");

        System.out.printf("setC: %s %n", setC);

        // setD EnumSet
        System.out.printf("%n[setD EnumSet]%n");
        setD = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY);
        setD.add(Day.SATURDAY);
        setD.add(Day.SUNDAY);

        System.out.printf("setD: %s %n", setD);
        System.out.printf("Insert duplicate value Day.MONDAY%n");
        setD.add(Day.MONDAY);

        System.out.printf("setD: %s %n", setD);
    }
}
