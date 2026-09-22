package r_collections.e_Queue.a_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    static void main(String[] args) {
        Queue<String> stringQueue = new ArrayDeque<>();

        stringQueue.add("a");
        stringQueue.add("b");
        stringQueue.add("c");
        stringQueue.add("d");

        String next;
        while((next = stringQueue.poll()) != null) System.out.println(next);
    }
}
