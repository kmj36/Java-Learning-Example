package r_collections.h_Iterator.a_IterableForeach;

import java.util.Iterator;

class CustomIterator implements Iterator<Integer> {
    private final int[] array;
    private Integer index = 0;

    CustomIterator(int[] data) {
        this.array = data;
    }

    @Override
    public boolean hasNext() {
        return index != null && index < array.length;
    }

    @Override
    public Integer next() {
        return array[index++];
    }
}

class CustomIterable implements Iterable<Integer> {
    private final int[] data;

    public CustomIterable(int[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator(data);
    }
}

public class IterableForEach {
    static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        CustomIterable c = new CustomIterable(numbers);

        for (Integer num : c) {
            System.out.println(num);
        }

        Iterator<Integer> it = c.iterator();
        while(it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }
    }
}
