package s_concurrency.b_RaceCondition.m_ResovingRaceConditions.b_EAFPExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class EAFPExample {
    static void main(String[] args) throws IOException, InterruptedException {
        Path p = Path.of("lock.tmp");
        Files.deleteIfExists(p);

        CountDownLatch start = new CountDownLatch(1);
        AtomicInteger count = new AtomicInteger();

        Runnable task = () -> {
            try {
                start.await();
                Files.createFile(p);
                count.incrementAndGet();
            } catch (InterruptedException | IOException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start(); t2.start(); t3.start();
        start.countDown();
        t1.join(); t2.join(); t3.join();

        System.out.println("생성 성공 수: " + count.get());
    }
}
