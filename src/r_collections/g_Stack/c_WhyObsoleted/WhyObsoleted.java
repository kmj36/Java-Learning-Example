package r_collections.g_Stack.c_WhyObsoleted;

import java.util.Stack;

public class WhyObsoleted {
    static void main(String[] args) {
        Stack<String> s = new Stack<>();
        s.push("A");
        s.push("C");

        // Stack<E> Insert index
        s.add(1, "B");
        System.out.println("s.add(1, \"B\"): " + s);

        // Stack<E> Access index
        System.out.println("s.get(0): " + s.get(0));

        // Stack<E> Remove index
        s.remove(0);
        System.out.println("s.remove(0): " + s);
    }
}
