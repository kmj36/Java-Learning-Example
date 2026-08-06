package m_Optionals.c_GetOptionalValue;

import java.util.Optional;

class User {

}

class NotFoundException extends RuntimeException {
    private final Object errorInfo;

    public NotFoundException(String message) {
        super(message);
        this.errorInfo = null;
    }

    public Object getErrorInfo() {
        return errorInfo;
    }
}

public class getOptionalValue {
    static void main(String[] args) throws NotFoundException {
        String nullName = null;

        String name = Optional.ofNullable(nullName).orElse("john"); // null 이면 other 를 반환 (값이 있어도 orElse() 를 미리 평가함.)
        String name2 = Optional.ofNullable(nullName).orElseGet(() -> "john"); // null 이면 Supplier 호출 값 반환

        Optional<User> userOptional = Optional.ofNullable(new User());
        Optional<User> nullUserOptional = Optional.ofNullable(null);

        User user = userOptional.orElseThrow(() -> new NotFoundException("User not found")); // null 이면 지정한 예외를 발생.
        User newUser = nullUserOptional.orElseGet(() -> new User()); // null 이면 지정한 Supplier 호출한 값 반환.


        System.out.println(name);
        System.out.println(name2);
        System.out.println(user);
        System.out.println(newUser);
    }
}
