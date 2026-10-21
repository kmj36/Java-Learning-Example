package r_collections.h_Iterator.g_IterableForEach;

import java.util.List;

public class IterableForEach {
    static void main(String[] args) {
        Iterable<Integer> Itb = () -> List.of(1,2,3,4,5,6,7,8,9,10).iterator();
        Itb.forEach((num) -> {
            System.out.println(num/num);
        });
    }
}
