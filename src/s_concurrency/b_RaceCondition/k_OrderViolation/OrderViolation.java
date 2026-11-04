package s_concurrency.b_RaceCondition.k_OrderViolation;

public class OrderViolation {
    record Config(String url) {}

    static Config config; // initThread 세팅 예정

    static void main(String[] args) throws InterruptedException {
        Thread initThread = new Thread(() -> {
            sleep(100);
            config = new Config("jdbc:mysql://localhost/db");
        });

        Thread worker = new Thread(() -> {
           System.out.println(config.url()); // NPE 가능
        });

        initThread.start();
        worker.start();
    }

    static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
