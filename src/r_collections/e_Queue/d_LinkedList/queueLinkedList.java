package r_collections.e_Queue.d_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class queueLinkedList {
    static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");
        queue.add(null);

        System.out.println("[Queue] : " + queue);
        System.out.println("[LinkedList.get(2)] : " + queue.get(2));

        String next;

        do {
            next = queue.poll();
            System.out.println(next);
        } while(next != null);
    }
}
