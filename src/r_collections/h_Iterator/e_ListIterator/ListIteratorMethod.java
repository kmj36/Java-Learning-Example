package r_collections.h_Iterator.e_ListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethod {
    static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3));
        Iterator<Integer> Itr = list.iterator();

        Itr.hasNext();
        Itr.hasNext();
        Itr.hasNext();
        if(Itr.hasNext())
            System.out.println(Itr.next());
        System.out.println();

        ListIterator<Integer> ListItr = list.listIterator();

        while(ListItr.hasNext())
            System.out.println(ListItr.next());

        while(ListItr.hasPrevious())
            System.out.println(ListItr.previous());
    }
}
