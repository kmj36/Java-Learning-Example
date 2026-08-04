package m_Optionals.b_OptionalNullCheck;

import java.util.Optional;

public class optionalNullCheck {
    static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());
    }
}
