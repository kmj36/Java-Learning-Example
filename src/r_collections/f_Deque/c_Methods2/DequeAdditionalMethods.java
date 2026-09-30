package r_collections.f_Deque.c_Methods2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class DequeAdditionalMethods {
    static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(List.of(
                1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1));
        System.out.println("deque - " + deque);

        // removeFirstOccurrence(o), removeLastOccurrence(o)
        boolean isRemovedFirst = deque.removeFirstOccurrence(1);
        boolean isRemovedLast = deque.removeLastOccurrence(1);
        System.out.println("deque.removeFirstOccurrence(1): " + isRemovedFirst);
        System.out.println("deque.removeLastOccurrence(1): " + isRemovedLast);
        System.out.println("deque - " + deque);
        System.out.println();

        // remove(o)
        boolean isRemovedSeven = deque.remove(2);
        System.out.println("deque.remove(2): "+ isRemovedSeven);
        System.out.println("deque - " + deque);
        System.out.println();

        // contains(o)
        boolean isExistOne = deque.contains(1);
        System.out.println("deque.contains(1): " + isExistOne);

        // size()
        int dequeSize = deque.size();
        System.out.println("deque.size(): " + dequeSize);

        // iterator()
        Iterator<Integer> itr = deque.iterator();
        System.out.print("deque.iterator() : ");
        while(itr.hasNext())
            System.out.print(itr.next() + " ");
        System.out.println();

        // descendingIterator()
        Iterator<Integer> deItr = deque.descendingIterator();
        System.out.print("deque.descendingIterator() : ");
        while(deItr.hasNext())
            System.out.print(deItr.next() + " ");
        System.out.println();

        // reversed()
        System.out.println("deque.reversed(): " + deque.reversed());
    }
}
