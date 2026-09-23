package r_collections.e_Queue.h_LinkedBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

public class linkedBlockingQueue {
    private static final String POISON_PILL = "__STOP__";

    static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<String> logQueue = new LinkedBlockingQueue<>();

        Runnable producer = () -> {
            String name = Thread.currentThread().getName();
            try {
                for (int i = 1; i <= 5; i++) {
                    logQueue.put(name + " 로그-" + i);
                    System.out.println("[" + name + "] 생성: 로그-" + i + " (큐: " + logQueue.size() + ")");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable consumer = () -> {
            String name = Thread.currentThread().getName();
            try {
                while (true) {
                    String log = logQueue.take();
                    if (log.equals(POISON_PILL)) {
                        System.out.println("        [" + name + "] 종료 신호 받음");
                        return;
                    }
                    System.out.println("        [" + name + "] 기록: " + log);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread server1 = new Thread(producer, "Server-1");
        Thread server2 = new Thread(producer, "Server-2");
        Thread writer1 = new Thread(consumer, "Writer-1");
        Thread writer2 = new Thread(consumer, "Writer-2");

        server1.start();
        server2.start();
        writer1.start();
        writer2.start();

        server1.join();
        server2.join();

        logQueue.put(POISON_PILL);
        logQueue.put(POISON_PILL);

        writer1.join();
        writer2.join();

        System.out.println("모든 로그 기록 완료, 남은 로그: " + logQueue.size());
    }
}
