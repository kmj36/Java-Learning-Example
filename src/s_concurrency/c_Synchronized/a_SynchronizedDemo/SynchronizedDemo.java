package s_concurrency.c_Synchronized.a_SynchronizedDemo;

class Race {
    public static int count = 0;
    public synchronized static void inc() {
        count++;
    }
}

public class SynchronizedDemo {
    static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1_000_000; i++)
                Race.inc();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); t2.start();
        t1.join(); t2.join();

        System.out.println(Race.count);
    }
}
