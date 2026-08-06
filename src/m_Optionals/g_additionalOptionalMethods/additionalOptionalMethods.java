package m_Optionals.g_additionalOptionalMethods;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class additionalOptionalMethods {
    static void main(String[] args) {
        // Java 9+

        // 값 있으면 defaultValue 를 평가하지 않고, 값이 없으면 defaultValue Optional 를 지연 생성하여 반환.
        Optional<String> testValue = Optional.ofNullable(null);
        String defaultValue = "default";

        Optional<String> result = testValue.or(() -> Optional.ofNullable(defaultValue));
        System.out.println(result.orElseThrow());

        // stream() 으로 Optional을 Stream API에 편입
        Optional<String> testValue2 = Optional.ofNullable("test");

        List<String> collect = testValue2.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

        // Stream<Optional<T>> -> Stream<T>
        Stream<Optional<String>> optionalStream = Stream.of(
                Optional.of("a"),
                Optional.empty(),
                Optional.of("c")
        );
        Stream<String> s = optionalStream.flatMap(Optional::stream);

        System.out.println(s.toList());
    }
}
