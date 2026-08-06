package m_Optionals.f_conversion;

import java.util.Optional;

class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getName() { // 이미 Optional 로 감싸서 값을 반환
        return Optional.ofNullable(name);
    }
}

public class conversion {
    static void main(String[] args) {

        // Optional " password " 를 받음.
        // String.trim() 으로 공백 제거 후 다시 Optional<> 을 받음.
        // filter 비밀번호 체크 조건을 만족하여 Optional 초기화를 피함.
        // 현재 값이 존재하는지 확인하여 최종적으로 true 를 받음.

        boolean correctPassword = Optional.of(" password ")
                .map(String::trim)
                .filter((pass) -> pass.equals("password"))
                .isPresent();

        System.out.println(correctPassword);

        Optional<Person> personOptional = Optional.of(new Person("test"));

        Optional<Optional<String>> nested = personOptional.map(Person::getName);

        // flatMap 으로 자동 평탄화
        String name = personOptional.flatMap(Person::getName).orElse("");

        System.out.println(nested.orElseThrow().orElseThrow());
        System.out.println(name);
    }
}
