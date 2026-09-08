package q_generics.g_TypeErasure;

class Node<T> {
    private T data;
    public T getData() {
        return data;
    }

    Node(T value) {
        this.data = value;
    }
}

public class TypeErasure {
    static void main(String[] args) {
        Node<Integer> n1 = new Node<>(1);
        Node<String> s1 = new Node<>("A");

        if(n1.getClass() == s1.getClass())
            System.out.println("'Node<Integer>', 'Node<String>' is Same 'Node<>' Raw class.");
    }
}