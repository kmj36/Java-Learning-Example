package s_concurrency.a_Thread.m_ThreadStop;

class FlagStop extends Thread {
    private static volatile boolean running = true;

    public static void setRunning(boolean running) {
        FlagStop.running = running;
    }

    public FlagStop(String Name) {
        setName(Name);
    }

    @Override
    public void run() {
        super.run();

        int count = 0;
        while(running) {
            try {
                System.out.printf("[%s] working... " + count++ + "%n", getName());
                sleep(300);
            } catch (InterruptedException _) {
                //throw new RuntimeException(e);
            }
        }
    }
}

class InterruptStop extends Thread {

    public InterruptStop(String Name) {
        setName(Name);
    }

    @Override
    public void run() {
        super.run();

        int count = 0;
        while (!isInterrupted()) {
            try {
                System.out.printf("[%s] working... " + count++ + "%n", getName());
                sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadStop {
    static void main(String[] args) throws InterruptedException {
        FlagStop t1 = new FlagStop("FlagStop");
        InterruptStop t2 = new InterruptStop("InterruptStop");

        t1.start();
        t2.start();
        Thread.sleep(1000);

        System.out.println("[Main]: 스레드 중지 요청.");
        FlagStop.setRunning(false);
        t2.interrupt();

        t1.join();
        t2.join();
        System.out.printf("[%s] 상태: %s %n", t1.getName(), t1.getState());
        System.out.printf("[%s] 상태: %s %n", t2.getName(), t2.getState());
    }
}
