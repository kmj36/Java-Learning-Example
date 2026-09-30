package r_collections.g_Stack.b_Search;

import java.util.List;
import java.util.Stack;

public class search {
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("s : " + s);

        // .equals() 비교로 언박싱 후 값 search 가 수행됨.
        System.out.println("s.search(3): " + s.search(new Integer(3)));
        System.out.println("s.search(10): " + s.search(10));
        System.out.println();

        // bottom [1, 2, 3, 4, 1, 2, 3, 4] top
        Stack<Integer> d = new Stack<>();
        d.push(1); d.push(2); d.push(3); d.push(4);
        d.push(1); d.push(2); d.push(3); d.push(4);

        System.out.println("d : bottom " + d + " top");
        System.out.println("d.search(3): " + d.search(3));
        System.out.println("d.removeElement(4): " + d.removeElement(4));

        System.out.println("d : bottom " + d + " top");
    }
}
