package s_concurrency.c_Synchronized.e_SynchronizedMonitors;

class Test {
    public int numA = 0;
    public static int numB = 0;
    public int numC = 0;

    // A(), A2() 와 동일한 모니터
    synchronized void A() {
        numA++;
    }
    void A2() {
        synchronized (this) {
            numA--;
        }
    }

    // B(), B2() 와 동일한 모니터
    static synchronized void B() {
        numB++;
    }
    static void B2() {
        synchronized (Test.class) {
            numB--;
        }
    }

    // 비 동기화 예시
    void C() {
        numC++;
    }
    void C2() {
        numC--;
    }
}

public class SynchronizedMonitors {
    static void main(String[] args) throws InterruptedException {
        Test t = new Test();

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 100_000; i++)
                t.A();
        });
        Thread threadA2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++)
                t.A2();
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 100_000; i++)
                Test.B();
        });
        Thread threadB2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++)
                Test.B2();
        });

        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 100_000; i++)
                t.C();
        });
        Thread threadC2 = new Thread(() -> {
            for (int i = 0; i < 100_000; i++)
                t.C2();
        });

        threadA.start(); threadA2.start();
        threadA.join(); threadA2.join();

        threadB.start(); threadB2.start();
        threadB.join(); threadB2.join();

        threadC.start(); threadC2.start();
        threadC.join(); threadC2.join();

        System.out.printf("[numA 기대값 0] numA : %d%n", t.numA);
        System.out.printf("[numB 기대값 0] numB : %d%n", Test.numB);
        System.out.printf("[numC 기대값 0] numC : %d%n", t.numC);
    }
}
