package q_generics.h_RuntimeRestriction;

import java.util.ArrayList;
import java.util.List;

public class RuntimeRestriction<T> {
    private T data;

    // 4. 정적 필드에 클래스 타입 매개변수 사용 불가
    //private static T staticData;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /*private T newInstance() {
        // 2. 타입 매개변수의 인스턴스 생성 불가
        return new T();
    }*/

    /*private T[] returnStringList() {
        // 3. 제네릭 배열 생성 불가
        return new List<String>[10];
    }*/

    // 7. 타입 소거 후 시그니처가 동일해지는 오버로딩 불가 (중복 문제)
    /*public void printList(List<String> stringList) {
        for (String str : stringList) {
            System.out.println(str);
        }
    }*/

    public void printList(List<Integer> IntegerList) {
        for (Integer num : IntegerList) {
            System.out.println(num);
        }
    }

    static void main(String[] args) {
        // 1. Primitive 타입을 타입 인자로 사용 불가
        //List<int> list = new ArrayList<>();

        Object obj = new ArrayList<Integer>();

        // 5. 매개변수화된 타입에 대한 instanceof 불가
        /*if(obj instanceof List<Integer>) {
            System.out.printf("obj is List<Integer>");
        }*/
    }

    // 6. Throwable 을 상속하는 제네릭 클래스 생성 불가
    /*class extendedGenericThrowable<T> extends Throwable {

    }*/
}
