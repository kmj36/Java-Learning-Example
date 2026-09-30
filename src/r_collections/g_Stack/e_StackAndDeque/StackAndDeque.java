package r_collections.g_Stack.e_StackAndDeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Stack;

public class StackAndDeque {
    static void main(String[] args) {
        Stack<Integer> legacyStack = new Stack<>();
        ArrayDeque<Integer> dequeStack = new ArrayDeque<>();

        legacyStack.addAll(List.of(1,2,3,4,5,6));
        dequeStack.addAll(List.of(1,2,3,4,5,6));

        System.out.println("legacyStack - " + legacyStack);
        System.out.println("dequeStack - " + dequeStack);
        System.out.println();
        
        // push(1)
        System.out.println("[Pushing '7' item.]");
        legacyStack.push(7);
        dequeStack.addFirst(7);
        System.out.println("legacyStack.push(7) - " + legacyStack);
        System.out.println("dequeStack.addFirst(7) - " + dequeStack);
        System.out.println();

        // pop()
        System.out.println("[Popping '7' item.]");
        System.out.println("legacyStack.pop() - " + legacyStack.pop());
        System.out.println("dequeStack.removeFirst() - " + dequeStack.removeFirst());
        System.out.println();

        // peek()
        System.out.println("[Peeking item.]");
        System.out.println("legacyStack.peek() - " + legacyStack.peek());
        System.out.println("dequeStack.getFirst() - " + dequeStack.getFirst());
        System.out.println();

        // empty()
        System.out.println("[Check Empty.]");
        System.out.println("legacyStack.empty() - " + legacyStack.empty());
        System.out.println("dequeStack.isEmpty() - " + dequeStack.isEmpty());
        System.out.println();

        // search()
        System.out.println("legacyStack.search(3) - " + legacyStack.search(3));
    }
}
