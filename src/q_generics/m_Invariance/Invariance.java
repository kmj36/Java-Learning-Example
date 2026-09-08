package q_generics.m_Invariance;

import java.util.ArrayList;
import java.util.List;

public class Invariance {
    static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        //List<Object> objList = strList; // compile error
    }
}
