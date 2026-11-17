package s_concurrency.c_Synchronized.n_ObjectLockwaitNotify;

import java.util.ArrayDeque;
import java.util.Queue;

class BoundedBuffer<T> {
    private final Queue<T> queue = new ArrayDeque<>();
    private final Object lock = new Object();
    private final int capacity;

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public void put(T item) throws InterruptedException {
        synchronized (lock) {
            while (queue.size() == capacity)     // 가득 차면 대기
                lock.wait();                     // 락을 반납하고 잠듦
            queue.add(item);
            lock.notifyAll();                    // 대기 중인 소비자를 깨움
        }
    }

    public T take() throws InterruptedException {
        synchronized (lock) {
            while (queue.isEmpty())              // 비어 있으면 대기
                lock.wait();
            T item = queue.poll();
            lock.notifyAll();                    // 대기 중인 생산자를 깨움
            return item;
        }
    }
}

public class ObjectLockWaitAndNotify {
    static void main(String[] args) {
        BoundedBuffer<Integer> buffer = new BoundedBuffer<>(10);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    buffer.put(i);
                    System.out.println("생산: " + i);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    Integer v = buffer.take();
                    System.out.println("        소비: " + v);
                    Thread.sleep(300);           // 소비를 느리게 해서 생산자가 대기하게 만듦
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
