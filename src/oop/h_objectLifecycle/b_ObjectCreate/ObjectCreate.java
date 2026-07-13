package oop.h_objectLifecycle.b_ObjectCreate;
// 2. Object Create : 객체를 만들기 전에 먼저 일어나는 과정

import java.io.Serializable;

// 모든 객체는 Heap 메모리에 생성됨.
class Clock implements Serializable {
    public static final String VERSION;
    public static int Loglevel;

    public static void resetLoglevel() {
        Loglevel = 0;
    }

    static {
        VERSION = "1.0.0";
        Loglevel = 0;
    }

    private long time = 0; // 인스턴스 변수 : Class 안, 메서드 밖에서 선언되며 Heap 메모리에 존재.

    // 인스턴스 메서드 - static 이 아닌 메서드는 메서드 영역이라는 공용 영역에 존재한다.
    public long getTime() {
        return time;
    }

    public void setTime(long theTime) {
        // 메서드 내 변수 : 메서드 실행 중 발생하는 지역변수/매개변수는 별도 Stack 에 할당된다.
        this.time = theTime;
    }
}

// 클래스 로딩 -> 객체 생성(메모리 할당) -> 초기화 -> 사용 -> 참조 소멸 -> 가비지 컬렉션(GC)
public class ObjectCreate {
    static void main() {
        Clock myclock = new Clock();

        // 참조 타입(reference type) 변수는 Object 자체가 아니라, Object 를 가르키는 참조만 Slack 메모리에 저장.
        System.out.println(myclock);
    }
}
