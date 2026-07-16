package h_OOP.e_final.j_reflection;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class foo {
    private static final List<String> foo = new ArrayList<>();

    public static List<String> getFoo() {
        return foo;
    }

    static {
        foo.add("a");
        foo.add("b");
        foo.add("c");
    }
}

public class reflection {
    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);

        Field field = foo.class.getDeclaredField("foo");
        field.setAccessible(true);

        // 클래스 초기화를 먼저 강제로 트리거
        Class.forName("h_OOP.e_final.j_reflection.foo");

        Object base = unsafe.staticFieldBase(field);
        long offset = unsafe.staticFieldOffset(field);
        unsafe.putObject(base, offset, new java.util.ArrayList<>(java.util.List.of("x", "y", "z")));

        System.out.println(foo.getFoo()); // [x, y, z]
    }
}