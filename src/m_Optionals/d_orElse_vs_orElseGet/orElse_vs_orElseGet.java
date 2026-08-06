package m_Optionals.d_orElse_vs_orElseGet;

import java.util.Optional;

public class orElse_vs_orElseGet {
    String getMyDefault() {
        System.out.println("getMyDefault() Called.");
        return "default";
    }

    void CheckOrElseFunction(String text) {

        System.out.println("orElseGet()");
        String name = Optional.ofNullable(text).orElseGet(this::getMyDefault); // getMyDefault() 를 호출하지 않음.

        System.out.println("orElse()");
        String name2 = Optional.ofNullable(text).orElse(getMyDefault()); // getMyDefault() 호출됨 (낭비)

        System.out.println();
        System.out.println("[Result]");
        System.out.println(name);
        System.out.println(name2);
    }

    static void main(String[] args) {
        String text = "name";
        orElse_vs_orElseGet o = new orElse_vs_orElseGet();

        o.CheckOrElseFunction(text);
    }
}
