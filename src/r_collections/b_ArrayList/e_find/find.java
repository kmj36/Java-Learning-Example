package r_collections.b_ArrayList.e_find;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class find {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,5,0));
        Integer num = 5;

        System.out.printf("list: %s%n%n",list);

        // list.contains(num);
        boolean containCheck = list.contains(num);
        System.out.printf("[list.contains(num)]%n");
        System.out.printf("list contains 5 : %s%n%n", containCheck);

        // list.indexOf(num);
        int idx = list.indexOf(num);
        System.out.printf("[list.indexOf(num)]%n");
        System.out.printf("list indexOf 5 : %d%n%n", idx);

        // list.lastIndexOf(num);
        int lastIdx = list.lastIndexOf(num);
        System.out.printf("[list.lastIndexOf(num)]%n");
        System.out.printf("list lastIndexOf 5 : %d%n%n", lastIdx);


        // binarySearch
        list.sort(Comparator.naturalOrder());
        int bsearchIdx = Collections.binarySearch(list, 7);
        System.out.printf("[list.sort(Comparator.naturalOrder())]%n");
        System.out.printf("list: %s%n", list);
        System.out.printf("list binarySearch 7 : %d%n%n", bsearchIdx);
    }
}
