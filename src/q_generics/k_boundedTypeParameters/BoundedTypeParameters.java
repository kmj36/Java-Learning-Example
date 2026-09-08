package q_generics.k_boundedTypeParameters;

class CustomMath {
    public static <T extends Number> double sum(T first, T second) {
        return first.doubleValue() + second.doubleValue();
    }
}

public class BoundedTypeParameters {
    static void main(String[] args) {
        double result = CustomMath.sum(3.0, 0.14159289793238);
        System.out.println(result);
    }
}
