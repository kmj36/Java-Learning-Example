package r_collections.g_Stack.g_customStack;

import java.util.*;

interface LifoStack<E> extends Collection<E> {
    void push(E item);
    E pop();
    E peek();
}

class ArrayLifoStack<E> extends AbstractCollection<E> implements LifoStack<E> {
    private final Deque<E> deque = new ArrayDeque<>();

    @Override
    public void push(E item) {
        deque.addFirst(item);
    }

    @Override
    public E pop() {
        return deque.removeFirst();
    }

    @Override
    public E peek() {
        return deque.peekFirst();
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public int size() {
        return deque.size();
    }
}

public class CustomStack {
    static void main(String[] args) {
        ArrayLifoStack<Integer> stack = new ArrayLifoStack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        int max = stack.size();
        for (int i = 0; i < max ; i++) {
            System.out.println(stack.pop());
        }
    }
}
