package s_concurrency.a_Thread.n_UnStartedNonDeamonThread;

public class NotStarted {
    static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("never runs"));
        // t.start() 호출하지 않음
        System.out.println("main ends");
    }
}
