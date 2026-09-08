package q_generics.l_MultipleBounds;

class CustomMath {
    public static <T extends Number & Comparable<T>> int compareValues(T a, T b) {
        return a.compareTo(b);
    }
}

public class MultipleBounds {
    static void main(String[] args) {
        int compare = CustomMath.compareValues(3.0, 3.5);
        System.out.println(compare);
    }
}
