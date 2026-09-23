package r_collections.e_Queue.f_concurrentLinkedQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class concurrentLinkedQueue {
    static void main(String[] args) throws InterruptedException {
        ConcurrentLinkedQueue<Integer> tasks = new ConcurrentLinkedQueue<>();
        for(int i = 1; i <= 1000; i++) tasks.offer(i);

        AtomicInteger count = new AtomicInteger();
        AtomicLong sum = new AtomicLong();

        Runnable worker = () -> {
            int myCount = 0;
            Integer task;
            while ((task = tasks.poll()) != null) {
                count.incrementAndGet();
                sum.addAndGet(task);
                myCount++;
            }
            System.out.println(Thread.currentThread().getName() + " 처리: " + myCount);
        };

        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(worker, "Worker-" + i);
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) t.join();

        System.out.println("총 처리 개수: " + count.get());     // 1000
        System.out.println("합계: " + sum.get());              // 500500
        System.out.println("남은 작업: " + tasks.isEmpty());    // true
    }
}