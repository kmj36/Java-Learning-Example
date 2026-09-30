package r_collections.g_Stack.d_SequencedCollection;

import java.util.List;
import java.util.Stack;

public class SequencedCollection {
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.addAll(List.of(1,2,3,4,1,2,3,4));

        System.out.println("s.getLast(): " + s.getLast());
        System.out.println("s.getFirst(): " + s.getFirst());

        s.addLast(4);
        System.out.println("s.addLast(4): " + s);

        System.out.println("s.reversed(): " + s.reversed());
    }
}
