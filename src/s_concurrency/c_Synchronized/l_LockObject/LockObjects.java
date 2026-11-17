package s_concurrency.c_Synchronized.l_LockObject;

import java.util.ArrayList;
import java.util.List;

class OrderBook {
    private final Object lock = new Object();
    private final List<String> orders = new ArrayList<>();

    void add(String raw) {
        String order = raw.trim().toUpperCase(); // 공유되지 않으므로, 락 밖에서 처리
        synchronized (lock) {
            orders.add(order);
        }
    }

    int size() {
        synchronized (lock) {
            return orders.size();
        }
    }
}

public class LockObjects {
    static void main(String[] args) throws InterruptedException {
        OrderBook orderBook = new OrderBook();
        String[] types = {"buy", "sell", "cancel", "modify", "query"};
        Thread[] threads = new Thread[types.length];

        for (int i = 0; i < types.length; i++) {
            String type = types[i];
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 50; j++) {
                    String order = type + "-" + j;
                    System.out.print(order + ", ");
                    orderBook.add(order);
                }
            }, type);
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("[기대값 250개 주문] size = " + orderBook.size()); // 항상 5000
    }
}
