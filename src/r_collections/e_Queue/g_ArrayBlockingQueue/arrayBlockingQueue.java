package r_collections.e_Queue.g_ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class arrayBlockingQueue {
    static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> serverSessionQueue = new ArrayBlockingQueue<>(3);
        int totalSessions = 10;

        Thread acceptor = new Thread(() -> {
            try {
                for (int i = 1; i <= totalSessions; i++) {
                    String session = "session-" + i;
                    System.out.println("[Acceptor] 넣기 시도: " + session + " (대기열(큐): " + serverSessionQueue.size() + "/3)");
                    serverSessionQueue.put(session);
                    System.out.println("[Acceptor] 넣기 완료: " + session);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Acceptor");

        Thread handler = new Thread(() -> {
            try {
                for (int i = 1; i <= totalSessions; i++) {
                    String session = serverSessionQueue.take();
                    System.out.println("        [Handler] 처리 중: " + session);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "Handler");

        acceptor.start();
        handler.start();
        acceptor.join();
        handler.join();

        System.out.println("모든 세션 처리 완료, 남은 세션: " + serverSessionQueue.size());
    }
}