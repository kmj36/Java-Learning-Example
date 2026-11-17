package s_concurrency.c_Synchronized.k_nullLockException;

class Test {
    int num = 0;
    private final Object lock = null;

    void nullLock() {
        synchronized (lock) {
            num++;
        }
    }
}

public class nullLock {
    static void main(String[] args) {
        Test t = new Test();
        t.nullLock();
    }
}
