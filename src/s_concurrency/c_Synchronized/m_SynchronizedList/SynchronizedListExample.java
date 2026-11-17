package s_concurrency.c_Synchronized.m_SynchronizedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test {
    final List<Object> list = Collections.synchronizedList(new ArrayList<>());

    public <E> boolean putIfAbsent(E x) {
        synchronized (list) {
            boolean absent = !list.contains(x);
            if (absent) list.add(x);
            return absent;
        }
    }

    public List<Object> getList() {
        synchronized (list) {
            return list;
        }
    }
}

public class SynchronizedListExample {
    static void main(String[] args) throws InterruptedException {
        Test c = new Test();

        Runnable task = () -> {
            List<Object> inputList = new ArrayList<>(List.of(1, "B", 3.14, 'c', '\n', 0xFF, new ArrayList<>()));
            for (Object o : inputList) {
                c.putIfAbsent(o);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);

        t1.start(); t2.start(); t3.start(); t4.start();
        t1.join(); t2.join(); t3.join(); t4.join();

        System.out.println(c.getList());
    }
}
