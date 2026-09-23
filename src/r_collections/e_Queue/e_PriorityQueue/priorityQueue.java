package r_collections.e_Queue.e_PriorityQueue;

import java.util.PriorityQueue;

public class priorityQueue {
    static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>();

        pQueue.add("a");
        pQueue.add("abcdef");
        pQueue.add("ab");
        pQueue.add("abcde");
        pQueue.add("abcd");
        pQueue.add("abc");

        String next;

        while((next = pQueue.poll()) != null)
            System.out.println(next);
    }
}
