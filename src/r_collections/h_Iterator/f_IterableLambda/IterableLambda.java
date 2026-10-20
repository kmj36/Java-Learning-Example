package r_collections.h_Iterator.f_IterableLambda;

import java.util.Iterator;
import java.util.List;

public class IterableLambda {
    static void main(String[] args) {
        Iterable<Integer> Itb = () -> List.of(1,2,3,4,5).iterator();

        Iterator<Integer> Itr = Itb.iterator();
        while(Itr.hasNext())
            System.out.println(Itr.next());

        Iterator<Integer> Itr2 = Itb.iterator();
        while(Itr2.hasNext())
            System.out.println(Itr2.next());
    }
}
