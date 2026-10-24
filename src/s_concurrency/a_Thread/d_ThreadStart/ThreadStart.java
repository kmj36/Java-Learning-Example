package s_concurrency.a_Thread.d_ThreadStart;

public class ThreadStart {
    static void main(String[] args) {
        Runnable task = () -> System.out.println("run by " + Thread.currentThread().getName());

        Thread t1 = new Thread(task);
        t1.start(); // 새 스레드를 스케줄링. 즉시 반환하고, 새 스레드가 t1.run()을 실행

        Thread t2 = Thread.ofPlatform().name("Thread-1").unstarted(task);
        t2.run(); // 현재 스레드에서 등록된 task 의 run() 을 실행. 새 스레드 생성하지 않음.

        Thread t3 = Thread.ofVirtual().name("Thread-2").unstarted(task);
        t3.run(); // 가상 스레드가 스케줄링되지 않고, run() 할 수 있는 task 가 없어 아무것도 하지 않음.

        t1.start(); // 실행, 종료 상태와 상관 없이 IllegalThreadStateException 발생.
    }
}
