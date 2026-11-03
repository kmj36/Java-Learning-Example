package s_concurrency.b_RaceCondition.j_64BitTearing;

// 64-bit tearing (JLS §17.7): non-volatile long/double은 32비트씩 나눠 쓰일 수 있다.
// 32비트 JVM에서만 재현된다. 해결: volatile long 또는 AtomicLong.
public class Tearing {
    static long value = 0L; // volatile 아님, 원자성이 보장되지 않음.

    static void main(String[] args) { // 32 bit JVM 필요 (JDK 17이면 public static void main(String[] args)로)
        Runnable writer = () -> {
            while(true) {
                value = 0L;  // 모든 비트 0
                value = -1L; // 모든 비트 1
            }
        };
        Runnable reader = () -> {
            while(true) {
                long v = value; // JIT이 루프 밖으로 끌어올리면 감지 못 할 수 있음
                if (v != 0L && v != -1L) { // 상위/하위 32비트가 섞인 값
                    System.out.printf("TORN: 0x%016X%n", v);
                    System.exit(0);
                }
            }
        };

        Thread w = new Thread(writer);
        Thread r = new Thread(reader);

        w.start();
        r.start();
    }
}