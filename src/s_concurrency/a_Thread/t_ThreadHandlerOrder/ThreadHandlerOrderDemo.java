package s_concurrency.a_Thread.t_ThreadHandlerOrder;

public class ThreadHandlerOrderDemo
{
    static class LoggingGroup extends ThreadGroup {
        LoggingGroup(String name) { super(name); }

        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("  2) [group:" + getName() + "] " + t.getName() + " → " + e.getMessage());
            super.uncaughtException(t, e);
        }
    }

    static void main(String[] args) throws InterruptedException {
        Thread.setDefaultUncaughtExceptionHandler((t, e) ->
                System.out.println("  3) [default] " + t.getName() + " → " + e.getMessage()));

        LoggingGroup group = new LoggingGroup("my-group");

        // A: 스레드 핸들러 있음
        Thread a = new Thread(group, () -> { throw new RuntimeException("A 실패"); }, "thread-A");
        a.setUncaughtExceptionHandler((t, e) ->
                System.out.println("  1) [thread] " + t.getName() + " → " + e.getMessage()));

        // B: 스레드 핸들러 없음 + 커스텀 그룹
        Thread b = new Thread(group, () -> { throw new RuntimeException("B 실패"); }, "thread-B");

        // C: 스레드 핸들러 없음 + 기본(main) 그룹
        Thread c = new Thread(() -> { throw new RuntimeException("C 실패"); }, "thread-C");

        run(a);
        run(b);
        run(c);
    }

    static void run(Thread t) throws InterruptedException {
        Thread.UncaughtExceptionHandler h = t.getUncaughtExceptionHandler();
        String who = (h instanceof ThreadGroup g) ? "ThreadGroup:" + g.getName() : "직접 설정한 핸들러";
        System.out.println(t.getName() + " 실행 (getUncaughtExceptionHandler = " + who + ")");
        t.start();
        t.join();
    }
}
