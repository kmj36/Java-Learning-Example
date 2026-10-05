package r_collections.g_Stack.h_StackImpls;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class StackImpls {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> stackArrayDeque = new ArrayDeque<>(List.of(0, 1,2,3,4,5,6,7,8,9));
        Deque<Integer> stackLinkedList = new LinkedList<>(List.of(0, 1,2,3,4,5,6,7,8,9));
        Deque<Integer> stackConcurrentLinkedDeque = new ConcurrentLinkedDeque<>(List.of(0, 1,2,3,4,5,6,7,8,9));
        Deque<Integer> stackLinkedBlockingDeque = new LinkedBlockingDeque<>(List.of(0, 1,2,3,4,5,6,7,8,9));

        for (int i = 0; i < 10; i++)
            stack.push(i);

        int c = 0;

        for (int i = 0; i <= 50; i++) {
            if(i % 10 == 0) {
                c++;
                switch (c) {
                    case 1 -> System.out.print("Stack<> : ");
                    case 2 -> System.out.print("ArrayDeque<> : ");
                    case 3 -> System.out.print("LinkedList<> : ");
                    case 4 -> System.out.print("ConcurrentLinkedDeque<> : ");
                    case 5 -> System.out.print("LinkedBlockingDeque<> : ");
                }
            }

            switch (c) {
                case 1 -> System.out.print(stack.pop());
                case 2 -> System.out.print(stackArrayDeque.pop());
                case 3 -> System.out.print(stackLinkedList.pop());
                case 4 -> System.out.print(stackConcurrentLinkedDeque.pop());
                case 5 -> System.out.print(stackLinkedBlockingDeque.pop());
            }

            if(i % 10 == 9) System.out.println();
        }
    }
}
