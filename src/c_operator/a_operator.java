package c_operator;

public class a_operator {
    public static void main(String[] args) {
        int a = 10, b = 7;

        System.out.printf("%d + %d = %d%n", a, b, a+b);
        System.out.printf("%d - %d = %d%n", a, b, a-b);
        System.out.printf("%d * %d = %d%n", a, b, a*b);
        System.out.printf("%d / %d = %d%n", a, b, a/b);
        System.out.printf("%d %% %d = %d%n", a, b, a%b);
        System.out.println();

        System.out.printf("+a = %d%n", +a);
        System.out.printf("-a = %d%n", -a);
        System.out.printf("++a = %d (a는 %d로 증가)%n", ++a, a);
        System.out.printf("--a = %d (a는 %d로 감소)%n", --a, a);
        System.out.printf("b++ = %d (실행 후 b는 %d)%n", b++, b);
        System.out.printf("b-- = %d (실행 후 b는 %d)%n", b--, b);
        System.out.println();

        System.out.printf("true = %b%n", true);
        System.out.printf("false = %b%n", false);
        System.out.println();

        System.out.printf("a(%d) == b(%d) : %b%n", a, b, a==b);
        System.out.printf("a(%d) != b(%d) : %b%n", a, b, a!=b);
        System.out.printf("a(%d) >  b(%d) : %b%n", a, b, a>b);
        System.out.printf("a(%d) <  b(%d) : %b%n", a, b, a<b);
        System.out.printf("a(%d) >= b(%d) : %b%n", a, b, a>=b);
        System.out.printf("a(%d) <= b(%d) : %b%n", a, b, a<=b);
        System.out.printf("Integer.valueOf(a=%d).equals(b=%d) : %b%n", a, b, Integer.valueOf(a).equals(b));
        System.out.println();

        System.out.printf("a=0       -> a = %d%n", a=0);
        System.out.printf("a+=100    -> a = %d%n", a+=100);
        System.out.printf("a-=50     -> a = %d%n", a-=50);
        System.out.printf("a*=2      -> a = %d%n", a*=2);
        System.out.printf("a/=2      -> a = %d%n", a/=2);
        System.out.printf("a%%=10     -> a = %d%n", a%=10);
        System.out.println();

        a = 0xff;
        System.out.printf("a=0xff        -> a = 0x%02x (%d)%n", a, a);
        System.out.printf("a&=0x0f       -> a = 0x%02x (%d)%n", a&=0xf, a);
        System.out.printf("a|=0xf0       -> a = 0x%02x (%d)%n", a|=0xf0, a);
        System.out.printf("a^=0x0f       -> a = 0x%02x (%d)%n", a^=0xf, a);
        System.out.printf("a<<=4         -> a = 0x%02x (%d)%n", a<<=4, a);
        System.out.printf("a>>=4         -> a = 0x%02x (%d)%n", a>>=4, a);
        System.out.printf("~a+1 (a=%d)   -> %d%n", a, ~a+1);
        System.out.printf("a>>>=1        -> a = %d%n", a>>>=1);
        System.out.println();

        a = 3;
        b = 2;
        int c = 1;
        System.out.printf("a=%d, b=%d, c=%d%n", a, b, c);
        System.out.printf("(a==b+c) || (b==a+c) : (%d==%d) || (%d==%d) = %b%n",
                a, b+c, b, a+c, (a == b + c) || (b == a + c));
        System.out.printf("(b==a+c) && (a==b+c) : (%d==%d) && (%d==%d) = %b%n",
                b, a+c, a, b+c, (b == a + c) && (a == b + c));
        System.out.println();

        // 삼항 연산자
        int max = (a > b) ? a : b;
        System.out.printf("(a(%d) > b(%d)) ? a : b  ->  max = %d%n", a, b, max);
        System.out.println();

        // instanceof
        Object obj = "Hello";
        System.out.printf("obj(\"%s\") instanceof String : %b%n", obj, obj instanceof String);
        System.out.printf("obj(\"%s\") instanceof Integer : %b%n", obj, obj instanceof Integer);
        if (obj instanceof String s) {
            System.out.printf("패턴매칭 s=\"%s\", s.length()=%d%n", s, s.length());
        }
        System.out.println();

        // 문자열 연결 연산자
        String s1 = "a=" + a;
        String s2 = a + b + "=합";
        String s3 = "합=" + a + b;
        System.out.printf("\"a=\" + a(%d)          -> \"%s\"%n", a, s1);
        System.out.printf("a(%d) + b(%d) + \"=합\"   -> \"%s\"  (숫자 먼저 계산됨)%n", a, b, s2);
        System.out.printf("\"합=\" + a(%d) + b(%d)   -> \"%s\"  (문자열이 먼저라 뒤는 다 문자열)%n", a, b, s3);
        System.out.println();

        // 비트 NOT
        int x = 5;
        System.out.printf("~x (x=%d) = %d%n", x, ~x);
        System.out.println();

        // 부호 있는/없는 시프트 차이
        int neg = -8;
        System.out.printf("neg(%d) >> 1  = %d   (부호 유지, 산술 시프트)%n", neg, neg >> 1);
        System.out.printf("neg(%d) >>> 1 = %d (부호 무시, 논리 시프트)%n", neg, neg >>> 1);
        System.out.println();

        // 단축평가 (short-circuit) vs 비단축평가
        System.out.println("[|| 단축평가 - checkB 호출 안 됨]");
        System.out.printf("checkA() || checkB() = %b%n", checkA() || checkB());
        System.out.println();

        System.out.println("[| 비단축평가 - checkB도 호출됨]");
        System.out.printf("checkA() | checkB() = %b%n", checkA() | checkB());
    }

    static boolean checkA() {
        System.out.println("  checkA 호출");
        return true;
    }
    static boolean checkB() {
        System.out.println("  checkB 호출");
        return true;
    }
}