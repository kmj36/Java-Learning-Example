package r_collections.g_Stack.a_Basic;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackBasic {
    static void main(String[] args) {
        try {
            Stack<String> stk = new Stack<>();

            stk.push("!");
            stk.push("World");
            stk.push(", ");
            stk.push("Hello");

            System.out.println(stk);
            System.out.println("Stack.peek(): " + stk.peek());
            System.out.println("Stack.search(\"!\"): " + stk.search("!"));

            int stackSize = stk.size();
            System.out.print("Stack.pop(): ");
            for (int i = 0; i < stackSize; i++) System.out.print(stk.pop());
            System.out.println();

            System.out.println("Stack.empty(): " + stk.empty());
            stk.peek();

        } catch (EmptyStackException e) {
            throw new RuntimeException(e);
        }
    }
}
