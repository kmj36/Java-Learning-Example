package m_Optionals.a_createOptionalInstance;

import java.util.Optional;

public class createOptionalInstance {
    static void main(String[] args) {
        Optional<String> a = Optional.of("test"); // 값이 존재함.
        Optional<String> b = Optional.ofNullable(null); // 빈 Optional
        //Optional<String> c = Optional.of(null); // NullPointerException 발생

        if(a.isPresent())
            System.out.print(a.get()); // 실행됨.

        if(b.isPresent())
            System.out.print(b.get()); // 실행되지 않음.
    }
}
