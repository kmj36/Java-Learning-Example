package r_collections.h_Iterator.b_IteratorCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCollection {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,-1,6,7,8,9,10));
        Iterator<Integer> Itr = list.iterator();

        while(Itr.hasNext()) {
            Integer num = Itr.next();
            if(num == -1) {
                Itr.remove();
                continue;
            }
            System.out.println(num);
        }
    }
}
