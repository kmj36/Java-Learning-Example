package k_LambdaExpressions.b_LambdaFunction;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.function.*;

class myTime {
    private Long time;

    // 인자 없음, 값 반환
    public Supplier<Long> getTime = () -> time;

    // 인자 받음, 반환 없음
    public Consumer<Long> setTime = (SetTime) -> this.time = SetTime;

    // 인자 받음, boolean 반환
    public Predicate<Long> isSameTime = (time) -> this.time.equals(time);

    // 인자 받음, 값 반환(다른 타입)
    public Function<Long, String> toTimeStampString = (time) -> new Timestamp(time).toString();
}

class BiExample {
    // 인자 2개 받음, 값 반환
    public BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

    // 인자 2개 받음, boolean 반환
    public BiPredicate<String, Integer> isLengthEqual = (str, len) -> str.length() == len;

    // 인자 2개 받음, 반환 없음
    public BiConsumer<String, Integer> printPair = (name, age) -> System.out.printf("%s 는 %d 세입니다.\n", name, age);
}

class Operator {
    // 입력, 출력 타입이 같을 때
    public UnaryOperator<String> toUpper = str -> str.toUpperCase();

    // 2 인자, 출력 타입 모두 같을 때 
    public BinaryOperator<Integer> add = (a,b) -> a + b;
}

public class LambdaFunction {
    static void main(String[] args) {
        myTime obj = new myTime();

        obj.setTime.accept(System.currentTimeMillis());
        System.out.printf("현재 시간: %d\n", obj.getTime.get());
        System.out.printf("같은 시간?: %s\n", obj.isSameTime.test(obj.getTime.get()));
        System.out.printf("타임 스탬프: %s\n", obj.toTimeStampString.apply(obj.getTime.get()));

        BiExample obj2 = new BiExample();
        System.out.printf("multiply: %d\n", obj2.multiply.apply(3,4));
        System.out.printf("isLengthEqual: %s\n", obj2.isLengthEqual.test("test", 4));
        obj2.printPair.accept("Test", -99);

        Operator obj3 = new Operator();
        System.out.println(obj3.add.apply(3,12));
        System.out.println(obj3.toUpper.apply("asdf"));

    }
}
