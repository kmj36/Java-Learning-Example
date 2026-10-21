package r_collections.h_Iterator.i_IteratorMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethods {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("1", "a", "2", "b", "3", "c"));

        Iterator<String> Itr = list.iterator();

        while(Itr.hasNext()) {
            // Itr.remove(); -- next() 호출 전 remove() 호출 IllegalStateException 예외 발생.

            String str = Itr.next();
            if(str.equals("b")) {
                Itr.remove();
                // Itr.remove(); -- remove() 중복 호출 IllegalStateException 예외 발생.
            }
            System.out.print(str + " ");
        }

        System.out.println();
        // -------------------------------------

        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,10);
        Iterator<Integer> Itr2 = list2.iterator();

        while(Itr2.hasNext())
        {
            Integer num = Itr2.next();
            //Itr2.remove(); // 불변 컬렉션의 Iterator remove() 는 지원하지 않음 UnsupportedOperationException 예외 발생.
            System.out.print(num + " ");
        }

        System.out.println();
        // --------------------------------------

        List<String> list3 = new ArrayList<>(List.of("A", "B", "C"));
        Iterator<String> it = list3.iterator();

        it.next(); // "A"
        it.forEachRemaining(s -> System.out.println("처리: " + s)); // B, C

        it.remove(); // 명세상 결과가 정해져 있지 않아 C 삭제는 모든 JDK 에서 보장되는 동작이 아님.
        System.out.println(list3);
    }
}
