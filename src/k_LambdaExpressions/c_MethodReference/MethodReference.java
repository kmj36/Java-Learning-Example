package k_LambdaExpressions.c_MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class MethodReference {
    static void main(String[] args) {
        // 정적 메서드 참조
        final BinaryOperator<Integer> max = Integer::max;

        // 바운드 메서드 참조
        final Consumer<String> print = System.out::println;

        // 언바운드 메서드 참조
        final Function<String, Integer> Strlen = String::length;

        // 생성자 참조
        final Supplier<List<String>> listCreator = ArrayList::new;

        System.out.println(max.apply(3,4));
        print.accept("test");
        System.out.println(Strlen.apply("asdfasdfasdf"));

        List<String> list = listCreator.get();

        list.add("A");
        list.add("B");

        for(String item : list) {
            System.out.println(item);
        }
    }
}
