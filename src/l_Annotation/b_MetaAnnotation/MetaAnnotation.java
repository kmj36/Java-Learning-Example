package l_Annotation.b_MetaAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 커스텀 어노테이션 만들기
@Retention(RetentionPolicy.RUNTIME) // 런타임까지 유지되어 리플렉션으로 조회 가능
@Target(ElementType.METHOD) // 메서드 요소에 지정 가능
@interface MethodInfo { // 메서드 정보를 등록하는 어노테이션
    String author() default "Pankaj";
    String date();
    int revision() default 1;
    String comments();
}

class Overridden_Origin {
    public String toString(String str) {
        return str;
    }
}

class Override extends Overridden_Origin {
    @java.lang.Override
    @MethodInfo(author = "Kim min je", date = "2026-08-02", revision = 1, comments = "Main Method")
    public String toString(String str) {
        return "Overridden toString";
    }
}

public class MetaAnnotation {
    static void main(String[] args) {
        Override o = new Override();
        System.out.print(o.toString("Hello World!"));
    }
}
