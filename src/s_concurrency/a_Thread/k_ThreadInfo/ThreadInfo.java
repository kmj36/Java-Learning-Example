package s_concurrency.a_Thread.k_ThreadInfo;

public class ThreadInfo {
    static class PrintInfomationThread extends Thread {
        @Override
        public void run() {
            super.run();
            setName("PrintInformationThread");

            System.out.printf("Current Thread : %s%n", Thread.currentThread());
            System.out.printf("Thread ID : %d%n", threadId());
            System.out.printf("Thread Name : %s%n", getName());
            System.out.printf("Thread Priority : %d%n", getPriority());
            System.out.printf("Thread Group : %s%n", getThreadGroup());
            System.out.printf("Thread State : %s%n", getState());
        }
    }

    static void main(String[] args) throws InterruptedException {
        PrintInfomationThread thread = new PrintInfomationThread();

        System.out.printf("Current Thread : %s%n", Thread.currentThread());
        System.out.printf("Thread ID : %d%n", Thread.currentThread().threadId());
        System.out.printf("Thread Name : %s%n", Thread.currentThread().getName());
        System.out.printf("Thread Priority : %d%n", Thread.currentThread().getPriority());
        System.out.printf("Thread Group : %s%n", Thread.currentThread().getThreadGroup());
        System.out.printf("Thread State : %s%n", Thread.currentThread().getState());
        System.out.println();

        thread.start();
        thread.join();
    }
}
