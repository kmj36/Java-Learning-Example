package q_generics.c_GenericClass;

class Box<T> {
    private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

public class GenericClass {
    static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(128);
        Integer val = intBox.get();

        System.out.println(val);

        Box<Box<Integer>> intBoxBox = new Box<>();
        intBoxBox.set(intBox);
        Integer val2 = intBoxBox.get().get();

        System.out.println(val2);
    }
}
