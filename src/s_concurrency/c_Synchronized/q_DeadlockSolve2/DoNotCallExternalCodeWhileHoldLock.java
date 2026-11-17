package s_concurrency.c_Synchronized.q_DeadlockSolve2;

import java.util.ArrayList;
import java.util.List;

class SnapshotDemo  {
    record Snapshot(List<String> items) {}

    interface Listener { void onChange(Snapshot s); }

    private final Object lock = new Object();
    private final List<String> items = new ArrayList<>();

    void add(String item) {
        synchronized (lock) { items.add(item); }
    }

    private Snapshot takeSnapshot() {
        return new Snapshot(List.copyOf(items));
    }

    void update(Listener listener) {
        Snapshot snapshot;
        synchronized (lock) {
            snapshot = takeSnapshot();      // 공유 상태 접근만 락 안에서
        }
        listener.onChange(snapshot);        // 외부 호출은 락 밖에서
    }
}

public class DoNotCallExternalCodeWhileHoldLock {
    static void main(String[] args) throws InterruptedException {
        SnapshotDemo demo = new SnapshotDemo();
        // 쓰기 스레드: 계속 항목 추가
        Thread writer = new Thread(() -> {
            for (int i = 0; i < 100_000; i++) demo.add("item" + i);
        });

        // 알림 스레드 2개: 쓰기와 동시에 update 호출
        Runnable notifier = () -> {
            for (int i = 0; i < 3; i++) {
                demo.update(s -> System.out.println(
                        Thread.currentThread().getName() + " size=" + s.items().size()));
                try { Thread.sleep(1); } catch (InterruptedException e) { return; }
            }
        };
        Thread n1 = new Thread(notifier, "notifier-1");
        Thread n2 = new Thread(notifier, "notifier-2");

        writer.start(); n1.start(); n2.start();
        writer.join();  n1.join();  n2.join();

        demo.update(s -> System.out.println("final size=" + s.items().size()));
    }
}
