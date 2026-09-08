package q_generics.b_parameterize;

import java.util.ArrayList;
import java.util.List;

public class parameterize {
    static void main(String[] args) {
        List<String> safeList = new ArrayList<>();
        safeList.add("Hello");
        //safeList.add(42); // Compile error
    }
}
