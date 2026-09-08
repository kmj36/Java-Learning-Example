package q_generics.a_classcastexception;

import java.util.ArrayList;
import java.util.List;

public class classcastexception {
    static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(42);
        for (Object obj : list) {
            String str = (String) obj; // ClassCastException
            System.out.println(str);
        }
    }
}
