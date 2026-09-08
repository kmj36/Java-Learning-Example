package q_generics.e_multipleParameters;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }
}

public class multipleParameters {
    static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<>("Evan", 24);
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
    }
}
