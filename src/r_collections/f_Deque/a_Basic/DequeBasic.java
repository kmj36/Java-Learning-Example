package r_collections.f_Deque.a_Basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBasic {
    static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Deque
        System.out.println("[addFirst(3,2,1)]");
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);

        System.out.println("[addLast(4,5)]");
        deque.addLast(4);
        deque.addLast(5);

        System.out.println("deque : " + deque);
        System.out.println("deque reversed : " + deque.reversed());
    }
}