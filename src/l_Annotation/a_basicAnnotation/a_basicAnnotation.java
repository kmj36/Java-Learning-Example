package l_Annotation.a_basicAnnotation;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Override {
    void print(String str) {
        System.out.println(str);
    }
}

class Override_extend extends Override {
    @java.lang.Override // 오버라이드 어노테이션
    void print(String str) {
        System.out.print(str);
    }
}

@java.lang.Deprecated // 미사용 표시 어노테이션
class DeprecatedClass {
    void print(String str) {
        System.out.printf("%s", str);
    }
}

class SafeVarargs {
    @java.lang.SafeVarargs // Varargs 로 인한 힙 오염 경고 억제 어노테이션
    static <T> List<T> listOf(T... elements) {
        return Arrays.asList(elements);
    }
}

@java.lang.FunctionalInterface
interface FunctionIntf<T> {
    void print(T str);
}

class Constants {
    @Native public static final int BUFFER_SIZE = 1_024; // javac -h C/C++ 네이티브 헤더 파일로 자동 생성 어노테이션
}

public class a_basicAnnotation {
    static void main(String[] args) {
        Override_extend ext = new Override_extend();

        @SuppressWarnings("deprecation") // 지정한 컴파일 경고 억제 어노테이션
        DeprecatedClass d = new DeprecatedClass();

        List<String> strings = SafeVarargs.listOf("a", "b", "c");
        List<Integer> numbers = SafeVarargs.listOf(1,2,3);

        FunctionIntf<String> f = System.out::print;

        ext.print("Hello, World!\n");
        d.print("Hello\n");
        f.print("Hello, World!\n");

        System.out.println(strings);
        System.out.println(numbers);
    }
}
