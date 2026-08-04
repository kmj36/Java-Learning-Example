package k_LambdaExpressions.d_MethodCombining;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodChaining {
    static void main(String[] args) {
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> !s.isEmpty();
        Predicate<String> shorterThan5 = s -> s.length() < 5;

        // and(): 모두 true여야 true
        Predicate<String> valid = nonNull.and(nonEmpty).and(shorterThan5);

        System.out.println(valid.test("abc"));   // true
        System.out.println(valid.test(""));      // false (nonEmpty 실패)
        System.out.println(valid.test(null));    // false (nonNull 실패)
        System.out.println(valid.test("abcdef")); // false (5자 이상)
        System.out.println();

        // or(): 하나만 true여도 true
        Predicate<String> isNullOrEmpty = nonNull.negate().or(nonEmpty.negate());
        System.out.println(isNullOrEmpty.test(""));    // true
        System.out.println(isNullOrEmpty.test("abc")); // false
        System.out.println();

        // negate(): 결과 반전
        Predicate<String> isEmpty = nonEmpty.negate();
        System.out.println(isEmpty.test(""));    // true
        System.out.println(isEmpty.test("abc")); // false
        System.out.println();

        // isEqual: 특정 값과 같은지 검사하는 Predicate 생성
        Predicate<String> isDuke = Predicate.isEqual("Duke");
        System.out.println(isDuke.test("Duke"));  // true
        System.out.println(isDuke.test("Java"));  // false
        System.out.println();

        // not: 주어진 Predicate를 반전
        Predicate<Collection<String>> isEmpty2 = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isEmpty2);

        System.out.println(isNotEmpty.test(List.of("a", "b"))); // true
        System.out.println(isNotEmpty.test(List.of()));         // false
        System.out.println();

        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add3 = n -> n + 3;

        // andThen: multiplyBy2 먼저 실행 → 결과를 add3에 전달
        Function<Integer, Integer> f1 = multiplyBy2.andThen(add3);
        System.out.println(f1.apply(5)); // (5*2)+3 = 13

        // compose: add3 먼저 실행 → 결과를 multiplyBy2에 전달
        Function<Integer, Integer> f2 = multiplyBy2.compose(add3);
        System.out.println(f2.apply(5)); // (5+3)*2 = 16
        System.out.println();

        Function<String, String> id = Function.identity();
        System.out.println(id.apply("변화없음")); // 변화없음

        // 실전 활용: 문자열 → 문자열 길이로 매핑하는 Map 만들기
        List<String> words = List.of("사과", "바나나", "포도");
        Map<String, Integer> lengthMap = words.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

        System.out.println(lengthMap);
        // {사과=2, 바나나=3, 포도=2}
    }
}
