package s_concurrency.a_Thread.a_CreateThreadWithExtends;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run by " + MyThread.currentThread().getName());
    }
}

public class CreateThreadWithExtends {
    static void main(String[] args) throws InterruptedException {
        Thread th1 = new MyThread();
        Thread th2 = new MyThread();
        Thread th3 = new MyThread();
        Thread th4 = new MyThread();

        th1.start();
        th2.start();
        th3.start();
        th4.start();

        th1.join();
        th2.join();
        th3.join();
        th4.join();
    }
}
