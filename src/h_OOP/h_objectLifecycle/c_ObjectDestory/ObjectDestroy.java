package h_OOP.h_objectLifecycle.c_ObjectDestory;

import java.lang.ref.Cleaner;

class Clock {
    public static final String VERSION;
    public static int Loglevel;

    private final State state;
    private final Cleaner.Cleanable cleanable;
    private static final Cleaner cleaner = Cleaner.create();

    public Clock() {
        this.state = new State(this.time);
        this.cleanable = cleaner.register(this, state);
    }

    public static void resetLoglevel() {
        Loglevel = 0;
    }

    static {
        VERSION = "1.0.0";
        Loglevel = 0;
    }

    private long time = 0; // 인스턴스 변수 : Class 안, 메서드 밖에서 선언되며 Heap 메모리에 존재.

    // 인스턴스 메서드 - static 이 아닌 메서드는 메서드 영역이라는 공용 영역에 존재한다.
    public long getTime() {
        return time;
    }

    public void setTime(long theTime) {
        // 메서드 내 변수 : 메서드 실행 중 발생하는 지역변수/매개변수는 별도 Stack 에 할당된다.
        this.time = theTime;
    }

    private static class State implements Runnable {
        long time;

        State(long time) {
            this.time = time;
        }

        @Override
        public void run() {
            System.out.println("Cleaner 실행: time 리셋 (이전 값=" + time + ")");
            time = 0;
        }
    }

    public void close() {
        cleanable.clean();
    }
}

public class ObjectDestroy {
    static void main() {
        Clock clock1 = new Clock();
        Clock clock2 = new Clock();

        clock1.setTime(System.currentTimeMillis());
        clock2.setTime(0);

        clock1 = clock2; // clock1 의 객체 참조가 clock2 를 가리키면서 본래 clock1 의 참조가 소멸, GC 대상.

        System.out.printf("clock1 time: %d, clock2 time: %d\n", clock1.getTime(), clock2.getTime());

        System.gc(); // 강제 가비지 컬렉션 호출

        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {}
    }
}
