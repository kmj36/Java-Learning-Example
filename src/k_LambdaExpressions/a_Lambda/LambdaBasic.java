package k_LambdaExpressions.a_Lambda;

import java.util.ArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class LambdaBasic {
    static void main(String[] args) {
        // 표현식 본문
        Predicate<String> isLong = str -> str.length() >= 10;
        System.out.printf("문자열이 10자 이상인가? %s\n", isLong.test("asdfasdfasdasdff"));

        // 블록 본문
        BinaryOperator<Integer> add = (a, b) -> {
            int sum = a+b;
            return  sum;
        };

        int result = add.apply(4,5);
        System.out.printf("결과: %d", result);
    }
}
