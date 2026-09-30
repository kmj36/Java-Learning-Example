package r_collections.f_Deque.e_DequeStack;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack {
    static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Stack (LIFO)
        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(4);
        deque.push(5);

        System.out.println("[Using Stack with Deque.]");
        System.out.println("peek : " + deque.peek());
        System.out.print("push/pop : ");
        int maxStackSize = deque.size();
        for(int i = 0; i < maxStackSize; i++)
            System.out.printf("%d ", deque.pop());
        System.out.println("\r\n");
    }
}