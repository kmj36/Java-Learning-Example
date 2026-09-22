package r_collections.e_Queue.b_Methods;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Methods {
    static void main(String[] args) {
        // return Exception vs return Boolean 별 메서드

        // Insert 메서드
        try {
            Queue<String> queue = new ArrayBlockingQueue<>(1);

            Boolean result = queue.offer("a1");
            System.out.println("[Queue.offer(str)]: " + result);

            queue.add("a2");
        } catch (IllegalStateException e) {
            System.out.println("[Queue.add(str)]: Exception Thrown.");
            e.printStackTrace();
        }

        // Remove 메서드
        try {
            Queue<String> queue = new ArrayDeque<>();
            queue.offer("b");

            String result = queue.poll();
            System.out.println("[Queue.poll()]: " + result);

            String _ = queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("[Queue.remove()]: Exception Thrown.");
            e.printStackTrace();
        }

        // Examine 메서드
        try {
            Queue<String> queue = new ArrayDeque<>();

            String str1 = queue.peek();
            System.out.println("[Queue.peek()]: " + str1);

            String _ = queue.element();
        } catch (NoSuchElementException e) {
            System.out.println("[Queue.element()]: Exception Thrown.");
            e.printStackTrace();
        }
    }
}
