package s_concurrency.b_RaceCondition.g_Visibility;

public class HappensBefore {
    static boolean running = true; // 공용 변수

    static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.printf("[%s]: 스레드 시작.%n", Thread.currentThread().getName());
            long i = 0;
            while(running) // 읽기 시점
                i++;
            System.out.printf("[%s]: 스레드 종료 - %d.%n", Thread.currentThread().getName(), i);
        });

        t.setDaemon(true);
        t.start();

        System.out.println("[Main]: 스레드 1초 일시중지.");
        Thread.sleep(1000);

        System.out.println("[Main]: running = false.");
        running = false; // 쓰기 시점

        t.join(3000);
        System.out.println("[Main]: 스레드 대기시간 초과 강제중지.");
    }
}
