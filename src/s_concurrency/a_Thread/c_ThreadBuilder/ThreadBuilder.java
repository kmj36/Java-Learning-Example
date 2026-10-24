package s_concurrency.a_Thread.c_ThreadBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class ThreadBuilder {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> System.out.println("run by " + Thread.currentThread().getName());

        Thread.ofPlatform().name("Thread t1").start(task);
        Thread.ofPlatform().daemon().start(task);
        Thread.ofVirtual().start(task);
        Thread.startVirtualThread(task);

        ThreadFactory f = Thread.ofPlatform().daemon().name("worker-", 0).factory();
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++) threadList.add(f.newThread(task));
        for (Thread thread : threadList) thread.start();
    }
}
