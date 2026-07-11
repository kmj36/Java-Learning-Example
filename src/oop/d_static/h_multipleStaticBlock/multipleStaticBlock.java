package oop.d_static.h_multipleStaticBlock;

import java.util.LinkedList;
import java.util.List;

class StaticBlockDemo {
    public static List<String> ranks = new LinkedList<>();

    static {
        ranks.add("Private");
        ranks.add("Corporal");
    }

    static  {
        ranks.add("Sergeant");
        ranks.add("Lieutenant");
    }

    static {
        ranks.add("Captain");
        ranks.add("Major");
        ranks.add("Colonel");
        ranks.add("General");
    }
}

public class multipleStaticBlock {
    static void main() {
        System.out.println(StaticBlockDemo.ranks.toString());
    }
}
