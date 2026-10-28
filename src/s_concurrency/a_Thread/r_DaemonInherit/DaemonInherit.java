package s_concurrency.a_Thread.r_DaemonInherit;

public class DaemonInherit {
    static void main(String[] args) throws InterruptedException {
        Thread fromMain = new Thread(() -> {});
        System.out.println("main 에서 생성: " + fromMain.isDaemon());

        Thread parent = new Thread(() -> {
            Thread child = new Thread(() -> {});
            System.out.println("daemon 안에서 생성: " + child.isDaemon());
        });
        parent.setDaemon(true);
        parent.start();
        parent.join();
    }
}
