package r_collections.f_Deque.b_Methods;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeMethods {
    static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Head Process Throw Exception
        try {
            System.out.println("[Deque addFirst()/getFirst()/removeFirst()]");
            deque.addFirst(1);
            deque.addFirst(2);
            deque.addFirst(3);

            System.out.println("Deque.getFirst(): " + deque.getFirst());

            System.out.println("Deque.removeFirst(): " + deque.removeFirst());
            System.out.println("Deque.removeFirst(): " + deque.removeFirst());
            System.out.println("Deque.removeFirst(): " + deque.removeFirst());
            System.out.println("Deque.removeFirst(): " + deque.removeFirst());
        } catch (RuntimeException e) {
            System.out.println("[Exception] : " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        // Head Process return Value
        try {
            System.out.println("[Deque offerFirst()/peekFirst()/pollFirst()]");
            deque.offerFirst(1);
            deque.offerFirst(2);
            deque.offerFirst(3);

            System.out.println("Deque.peekFirst(): " + deque.peekFirst());

            System.out.println("Deque.pollFirst(): " + deque.pollFirst());
            System.out.println("Deque.pollFirst(): " + deque.pollFirst());
            System.out.println("Deque.pollFirst(): " + deque.pollFirst());
            System.out.println("Deque.pollFirst(): " + deque.pollFirst());
        } catch (RuntimeException e) {
            System.out.println("[Exception] : " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        // Tail Process Throw Exception
        try {
            System.out.println("[Deque addLast()/getLast()/removeLast()]");
            deque.addLast(1);
            deque.addLast(2);
            deque.addLast(3);

            System.out.println("Deque.getLast(): " + deque.getLast());

            System.out.println("Deque.removeLast(): " + deque.removeLast());
            System.out.println("Deque.removeLast(): " + deque.removeLast());
            System.out.println("Deque.removeLast(): " + deque.removeLast());
            System.out.println("Deque.removeLast(): " + deque.removeLast());
        } catch (RuntimeException e) {
            System.out.println("[Exception] : " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        // Tail Process return Value
        try {
            System.out.println("[Deque offerLast()/peekLast()/pollLast()]");
            deque.offerLast(1);
            deque.offerLast(2);
            deque.offerLast(3);

            System.out.println("Deque.peekLast(): " + deque.peekLast());

            System.out.println("Deque.pollLast(): " + deque.pollLast());
            System.out.println("Deque.pollLast(): " + deque.pollLast());
            System.out.println("Deque.pollLast(): " + deque.pollLast());
            System.out.println("Deque.pollLast(): " + deque.pollLast());
        } catch (RuntimeException e) {
            System.out.println("[Exception] : " + Arrays.toString(e.getStackTrace()));
        }
    }
}
