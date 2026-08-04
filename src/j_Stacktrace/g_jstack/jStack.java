package j_Stacktrace.g_jstack;

public class jStack {

    private static final Object lock = new Object();

    static void main(String[] args) throws InterruptedException {
        System.out.println("PID 확인 후 jstack <PID> 명령어를 실행하세요.");
        System.out.println("종료하려면 Ctrl+C");

        // 1. 락을 잡고 오래 점유하는 스레드 (BLOCKED 유발용)
        Thread lockHolder = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("[lockHolder] 락 획득, 60초 대기");
                    Thread.sleep(60_000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }, "Lock-Holder-Thread");

        // 2. 위 락을 기다리는 스레드 (BLOCKED 상태)
        Thread lockWaiter = new Thread(() -> {
            System.out.println("[lockWaiter] 락 대기 시작");
            synchronized (lock) {
                System.out.println("[lockWaiter] 락 획득 완료");
            }
        }, "Lock-Waiter-Thread");

        // 3. sleep으로 TIMED_WAITING 상태를 유지하는 스레드
        Thread sleeper = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(5_000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Sleeper-Thread");

        // 4. CPU를 계속 쓰는 RUNNABLE 상태 스레드
        Thread busyLoop = new Thread(() -> {
            long sum = 0;
            while (true) {
                sum += Math.random() * 1000;
            }
        }, "Busy-Loop-Thread");

        lockHolder.start();
        Thread.sleep(500); // lockHolder가 먼저 락을 잡도록 대기
        lockWaiter.start();
        sleeper.start();
        busyLoop.start();

        // 메인 스레드도 잠깐 대기시켜 프로세스 유지
        Thread.sleep(600_000);
    }
}
