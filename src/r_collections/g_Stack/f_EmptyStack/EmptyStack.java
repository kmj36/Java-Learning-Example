package r_collections.g_Stack.f_EmptyStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class EmptyStack {
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        ArrayDeque<Integer> d = new ArrayDeque<>();

        System.out.println("------ pop() ------");
        try {s.pop();} catch (RuntimeException e) {
            System.out.println("Stack<> " + e.toString() + " : " + Arrays.toString(e.getStackTrace()));
        }
        try {d.pop();} catch (RuntimeException e) {
            System.out.println("ArrayDeque<> " + e.toString() + " : " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        System.out.println("------ peek() ------");
        try {s.peek();} catch (RuntimeException e) {
            System.out.println("Stack<> " + e.toString() + " : " + Arrays.toString(e.getStackTrace()));
        }

        try {Integer i = d.peek(); System.out.println("ArrayDeque.peek() : " + i);} catch (RuntimeException e) {
            System.out.println("ArrayDeque<> "  + e.toString() + " : " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        System.out.println("------ getFirst() ------");
        try {s.getFirst();} catch (RuntimeException e) {
            System.out.println("Stack<>" + e.toString() + " : " + Arrays.toString(e.getStackTrace()));
        }
        try {d.getLast();} catch (RuntimeException e) {
            System.out.println("ArrayDeque<> " + e.toString() + " : " + Arrays.toString(e.getStackTrace()));
        }
    }
}
