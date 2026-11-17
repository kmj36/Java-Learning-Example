package s_concurrency.c_Synchronized.f_lambdaSynchronized;

class LambdaRun {
    static int num = 0;

    void run() throws InterruptedException {
        Runnable r1 = () -> {
            synchronized (this) { // LambdaRun 인스턴스의 모니터
                for (int i = 0; i < 100_000; i++) {
                    num++;
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() { // 새로 생성된 익명 Runnable 인스턴스의 모니터
                synchronized (this) {
                    for (int i = 0; i < 100_000; i++) {
                        num--;
                    }
                }
            }
        };

        Thread threadR1 = new Thread(r1);
        Thread threadR2 = new Thread(r2);

        threadR1.start(); threadR2.start();
        threadR1.join(); threadR2.join();

        System.out.printf("[num 기대값 0] num: %d%n", num);
    }
}

public class LambdaSynchronized {
    static void main(String[] args) throws InterruptedException {
        LambdaRun instance1 = new LambdaRun();
        instance1.run();
    }
}
