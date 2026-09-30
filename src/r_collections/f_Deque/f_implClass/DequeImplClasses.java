package r_collections.f_Deque.f_implClass;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class DequeImplClasses {
    static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkedDeque = new LinkedList<>();
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        LinkedBlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<>(30);

        // ArrayDeque
        try {
            for (int i = 0; i < 0x10; i++) arrayDeque.offer(i);
            System.out.print("arrayDeque : " + arrayDeque);
        } catch (RuntimeException e) {
            System.out.println("[Exception]: " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        // LinkedList
        try {
            for (int i = 0; i < 0x10; i++) linkedDeque.offer(i);
            linkedDeque.offer(null);
            System.out.print("linkedDeque : " + linkedDeque);
        } catch (RuntimeException e) {
            System.out.println("[Exception]: " + Arrays.toString(e.getStackTrace()));
        }
        System.out.println();

        // ConcurrentLinkedDeque
        try {
            System.out.println("[ConcurrentLinkedDeque poll() 1000 times]");
            AtomicInteger count = new AtomicInteger();

            for(int i = 1; i <= 1000; i++) concurrentLinkedDeque.offer(i);

            Runnable task = () -> {
                int taskCount = 0;
                Integer get;

                while((get = concurrentLinkedDeque.poll()) != null) {
                    count.incrementAndGet();
                    taskCount++;
                }

                System.out.println(Thread.currentThread().getName() + " processed: " + taskCount);
            };

            List<Thread> threads = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                Thread t = new Thread(task, "Worker-" + i);
                threads.add(t);
                t.start();
            }
            for (Thread t : threads) t.join();

            System.out.print("count : " + count);
        } catch (RuntimeException e) {
            System.out.println("[Exception]: " + Arrays.toString(e.getStackTrace()));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println();

        // LinkedBlockingDeque
        try {
            System.out.println("[LinkedBlockingDeque]");

            Runnable task = () -> {
                for(int i = 0; i < 20; i++) {
                    linkedBlockingDeque.addLast(i);
                }
                linkedBlockingDeque.addLast(-1);
            };

            Thread producer = new Thread(task, "Producer");
            producer.start();

            int takeCount = 0;
            while(linkedBlockingDeque.takeFirst() != -1) takeCount++;

            producer.join();

            System.out.print("takeCount : " + takeCount);
        } catch (RuntimeException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
