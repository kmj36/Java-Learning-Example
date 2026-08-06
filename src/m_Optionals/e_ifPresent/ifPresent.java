package m_Optionals.e_ifPresent;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class ifPresent {
    static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("Tomas");

        AtomicInteger successCounter = new AtomicInteger(0);
        AtomicInteger onEmptyOptionalCounter = new AtomicInteger(0);

        opt.ifPresent(name -> System.out.println(name.length())); // 값이 존재하는 경우 Consumer 실행.

        opt.ifPresentOrElse(
            v -> successCounter.incrementAndGet(),
                onEmptyOptionalCounter::incrementAndGet
        ); // 값이 존재하는 경우 Consumer, 없는 경우 두번째 인자 Runnable

        System.out.println(successCounter);
        System.out.println(onEmptyOptionalCounter);
    }
}