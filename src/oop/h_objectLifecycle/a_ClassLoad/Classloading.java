package oop.h_objectLifecycle.a_ClassLoad;
// 1. ClassLoading : 객체를 만들기 전에 먼저 일어나는 과정

// java.lang.Class 객체 생성
class Clock {

    public static final String VERSION;   // 정적(static) 변수를 위한 메모리 할당. (일회성)
    public static int Loglevel;

    public static void resetLoglevel() { // 정적(static) 메서드를 위한 메모리 할당 (일회성)
        Loglevel = 0;
    }

    static {    // static 초기화 블록 실행 (일회성)
        VERSION = "1.0.0";
        Loglevel = 0;
    }

    // 이 시점에는 인스턴스 멤버를 위한 메모리는 아직 할당되지 않음. (객체 생성 필요)
    private long time = 0;

    public long getTime() {
        return time;
    }

    public void setTime(long theTime) {
        this.time = theTime;
    }
}

// 클래스 로딩 -> 객체 생성(메모리 할당) -> 초기화 -> 사용 -> 참조 소멸 -> 가비지 컬렉션(GC)
public class Classloading {
    static void main() {

    }
}
