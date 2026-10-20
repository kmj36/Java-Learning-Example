package r_collections.h_Iterator.c_NestedForEach;

import java.util.ArrayList;
import java.util.List;

public class nestedForEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList(List.of(1,2));

        for (Integer outer : list) {
            for (Integer inner : list) {
                System.out.println("outer : " + outer + ", inner : " + inner);
            }
        }
    }
}
