# Java-Learning-Example

Java 문법과 표준 API를 주제별로 정리한 학습용 예제 모음입니다.
각 예제는 독립적으로 실행할 수 있는 작은 프로그램이며, 주제 하나당 하나의 패키지로 구성되어 있습니다.

## 실행 환경

| 항목 | 내용 |
| --- | --- |
| JDK | **25 이상** (프로젝트 SDK: `openjdk-26`) |
| IDE | IntelliJ IDEA |

예제들은 `public static void main(String[] args)` 대신 `static void main(...)` 형태의 인스턴스 main 메서드(JEP 512)를 사용하므로 JDK 25 이상이 필요합니다.

## 실행 방법

### IntelliJ IDEA

프로젝트를 열고, 실행하려는 예제 파일의 `main` 메서드 옆 ▶ 버튼을 누릅니다.

### 명령줄

프로젝트 루트에서 실행합니다. 파일 입출력 예제는 루트 기준 상대 경로(`input.txt`, `src/p_JavaFilesandAPIs/...`)를 사용합니다.

```bash
# 전체 컴파일
javac -encoding UTF-8 -d out $(find src -name "*.java")

# 예제 실행: 모듈명/패키지.클래스
java -p out -m Java_Learning/r_collections.g_Stack.c_WhyObsoleted.WhyObsoleted
```

## 디렉터리 구조

패키지 이름 앞의 알파벳 접두사(`a_`, `b_`, ...)는 학습 순서를 나타냅니다.

```
Java-Learning-Example/
├── src/
│   ├── module-info.java
│   ├── a_variable/ ... r_collections/   # 주제별 예제
│   └── p_JavaFilesandAPIs/*.txt|jpg|zip  # 파일 API 예제용 데이터
├── input.txt, output*.txt, data.bin, photo.jpg  # I/O 예제용 데이터
└── Java-Learning.iml
```

## 학습 목차

### 기초 문법

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `a_variable` | 변수 | 선언, 다중 선언, 초기화, 미초기화, 대입 |
| `b_dataType` | 자료형 | 기본 자료형 |
| `c_operator` | 연산자 | 산술·비교·논리 연산자 |
| `d_condition` | 조건문 | if / else if / 중첩 if, switch, switch 표현식, `yield` |
| `e_loop` | 반복문 | for, while 등 |
| `f_arrays` | 배열 | 선언, 배열 리터럴, 요소 접근, 순회, 다차원 배열, 최대·최소, Comparator, 이진 탐색 |
| `g_javaDoc` | JavaDoc | 문서화 주석 작성 |

### 객체지향 (`h_OOP`)

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `a_ClassAndObjects` | 클래스와 객체 | 클래스 정의, 객체 생성, 멤버, Lamp 예제 |
| `b_AttributesAndMethods` | 속성과 메서드 | 인스턴스 변수, 메서드, 매개변수, final 매개변수, 지역 변수, 다중 반환, 은행 계좌 예제 |
| `c_AccessModifiers` | 접근 제어자 | private, getter/setter, private 생성자, default, protected, public, 실질적 접근 범위, 상속과 접근 제어 |
| `d_static` | static | 클래스 변수, static 메서드·블록, static 컨텍스트, static final, static 중첩 클래스, 싱글톤, 유틸리티 클래스 |
| `e_final` | final | 재할당 금지, 참조 변수, 초기화, static final, final 메서드·클래스, effectively final, 리플렉션, 생성자 주입 |
| `f_nestedClass` | 중첩 클래스 | static 중첩 클래스, 내부 클래스, 섀도잉, 지역 클래스, 익명 클래스, 캐시 패턴, 싱글톤 패턴 |
| `g_PackageClass` | 패키지 | 패키지 정보, Java 버전·사양 확인 |
| `h_objectLifecycle` | 객체 생명주기 | 클래스 로딩, 객체 생성(new·clone·직렬화), 객체 소멸 |
| `i_Inheritance` | 상속 | extends, 업캐스팅·다운캐스팅, 오버라이딩, super, instanceof, 섀도잉, 생성자 호출 순서 |
| `j_OverloadingAndOverriding` | 오버로딩·오버라이딩 | 두 개념 비교 |
| `k_abstration` | 추상화 | 추상 클래스, 추상 메서드, 템플릿 메서드 패턴, 인터페이스와 비교 |
| `l_MethodChaining` | 메서드 체이닝 | 체이닝, Dialog 예제, 정적 팩토리 메서드, 빌더 패턴 |
| `m_Encapsulation` | 캡슐화 | 읽기 전용, 쓰기 전용, Employee 예제 |
| `n_Interface` | 인터페이스 | 구현, 다중 인터페이스, 상수, default·static 메서드, 상속, default 충돌, 다형성, 횡단 관심사, 제네릭 인터페이스 |
| `o_Enums` | 열거형 | 기본 사용, 정수 상수와 비교, if/switch, 메서드, 필드, 추상 메서드, 인터페이스 구현, EnumSet·EnumMap |
| `p_Record` | 레코드 | 불변 데이터, record 선언, compact 생성자, 추가 생성자, 메서드, static 필드 |
| `q_InitializerBlock` | 초기화 블록 | 초기화 블록, 초기화 순서, 중복 static 블록, 전방 참조, 익명 클래스 초기화 |
| `r_StaticAndDynamicBinding` | 정적·동적 바인딩 | 정적 바인딩, 동적 바인딩, 오버로딩과 정적 바인딩 |
| `s_PassByValue` | 값에 의한 전달 | 참조 재할당, 객체 상태 변경, swap 테스트 |

### 예외와 디버깅

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `i_ExceptionHandling` | 예외 처리 | checked·unchecked 예외, try-catch-finally, 다중 catch, multi-catch, throw, throws, try-with-resources, 사용자 정의 예외, 예외 체이닝 |
| `j_Stacktrace` | 스택 트레이스 | getStackTrace, printStackTrace, 예외 로깅, 다중 throw, `java.util.logging`, suppressed 예외, jstack, StackWalker API |

### 함수형 프로그래밍과 메타데이터

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `k_LambdaExpressions` | 람다 | 람다 기본, 함수형 인터페이스, 메서드 참조, 함수 합성, Comparator |
| `l_Annotation` | 애너테이션 | 기본 애너테이션, 메타 애너테이션, @Repeatable, 리플렉션으로 읽기 |
| `m_Optionals` | Optional | 생성, null 검사, 값 꺼내기, `orElse` vs `orElseGet`, `ifPresent`, 변환, 추가 메서드, 실무 패턴 |

### 설계

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `n_dependencyInjection` | 의존성 주입 | 강한 결합 문제, 생성자·setter·인터페이스 주입, DI 체이닝, Service Locator와 비교 |

### 입출력과 파일

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `o_JavaIOStream` | Java I/O | 기본 스트림, 바이트·문자 스트림, 표준 스트림, 버퍼 스트림, Data 스트림, Object 스트림, File 클래스, NIO 읽기·쓰기, 디렉터리 순회 |
| `p_JavaFilesandAPIs` | NIO.2와 API | Path, 파일 읽기·쓰기, PrintWriter, 디렉터리, ZIP·인메모리 파일 시스템, `HttpClient` 요청 |

### 제네릭

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `q_generics` | 제네릭 | ClassCastException 문제, 매개변수화, 제네릭 클래스, 다이아몬드 연산자, 다중 타입 매개변수, 제네릭 메서드, 타입 소거, 런타임 제약, static 필드, 브리지 메서드, 한정 타입 매개변수, 다중 한정, 불공변성, 와일드카드, 비한정 와일드카드, Raw 타입 |

### 컬렉션 (`r_collections`)

| 패키지 | 주제 | 내용 |
| --- | --- | --- |
| `a_Arrays` | 배열 심화 | 생성, 초기화, 인덱스 접근, 길이, 순회, 다차원 배열, 요소 제거, `Arrays` 클래스, 복사, 최대·최소, 얕은 복사·깊은 복사 |
| `b_ArrayList` | ArrayList | 생성, CRUD, Iterator, 정렬, 검색 |
| `c_Set` | Set | Set 구현체, 불변 Set, `copyOf`, 메서드, 집합 연산, Stream 연산, 순회, 정렬, 복사, 부분 집합 |
| `d_Map` | Map | 생성, Map 구현체, HashMap 용량·순회·동시성·복제, EnumMap, WeakHashMap, IdentityHashMap, Properties, CRUD, 순회, 함수형 메서드, TreeMap과 탐색 메서드, 인터페이스 기반 프로그래밍, 객체 키·값, 경쟁 조건, ConcurrentHashMap |
| `e_Queue` | Queue | Queue 기본, 메서드, ArrayDeque, LinkedList, PriorityQueue, ConcurrentLinkedQueue, ArrayBlockingQueue, LinkedBlockingQueue |
| `f_Deque` | Deque | 기본, 메서드, 추가 메서드, 큐로 사용, 스택으로 사용, 구현 클래스 |
| `g_Stack` | Stack | 기본, 검색, `Stack`을 권장하지 않는 이유, SequencedCollection, Stack과 Deque 비교, 빈 스택 처리 |

## 참고

- `h_OOP/e_final/j_reflection`은 `sun.misc.Unsafe`를 사용하므로 컴파일 시 내부 API 경고가 출력됩니다.
- 일부 파일 I/O 예제에는 Windows 경로(`E:\file.txt`)가 하드코딩되어 있어 다른 환경에서는 경로 수정이 필요합니다.
- `j_Stacktrace/g_jstack` 예제는 실행 중 출력되는 PID로 별도 터미널에서 `jstack <PID>`를 실행해야 합니다.