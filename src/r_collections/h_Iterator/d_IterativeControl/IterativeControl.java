package r_collections.h_Iterator.d_IterativeControl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterativeControl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        // 외부 반복자 (External)
        System.out.println("[External Iterator]");
        Iterator<Integer> Itr = list.iterator();

        while(Itr.hasNext()) {
            Integer num = Itr.next();
            System.out.print(num);
        }

        System.out.print("\n\n");

        // 내부 반복자 (Internal)
        System.out.println("[Internal Iterator]");
        list.forEach(System.out::print);
    }
}
