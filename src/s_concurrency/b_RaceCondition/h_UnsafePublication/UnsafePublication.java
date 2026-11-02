package s_concurrency.b_RaceCondition.h_UnsafePublication;

class Holder {
    private int holderValue;

    public Holder(int holderValue) {
        this.holderValue = holderValue; // 1) 필드 초기화
    }

    public void assertSanity() {
        if (holderValue != holderValue) // 2) 값이 다르게 보이는 현상
            throw new AssertionError("This statement is false.");
    }
}

class Publisher {
    public Holder holder; // 동기화나, volatile 없음

    public void publish() {
        holder = new Holder(42); // 3) 객체 생성 및 참조 대입
    }
}

public class UnsafePublication {
    static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100_000; i++) {
            Publisher publisher = new Publisher();

            Thread writer = new Thread(publisher::publish);
            Thread reader = new Thread(() -> {
                Holder h = publisher.holder;
                if (h != null) {
                    h.assertSanity();
                }
            });

            reader.start();
            writer.start();

            reader.join();
            writer.join();
        }
    }
}
