package r_collections.f_Deque.a_Basic;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueue {
    static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Queue (FIFO)
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);

        System.out.println("[Using Queue with Deque.]");
        System.out.print("offer/poll : ");
        int maxQueueSize = deque.size();
        for(int i = 0; i < maxQueueSize; i++)
            System.out.printf("%d ", deque.poll());
        System.out.println("\r\n");

        // Queue with Deque methods (insert at tail, remove/view at head)
        System.out.println("[Using Queue with Deque methods.]");
        deque.addLast(1);
        deque.offerLast(2);
        deque.addLast(3);
        deque.offerLast(4);
        System.out.println("addLast(1), offerLast(2), addLast(3), offerLast(4) : " + deque);

        System.out.println("getFirst()    : " + deque.getFirst());
        System.out.println("peekFirst()   : " + deque.peekFirst());

        System.out.println("removeFirst() : " + deque.removeFirst());
        System.out.println("pollFirst()   : " + deque.pollFirst());
        System.out.println("deque : " + deque);
    }
}