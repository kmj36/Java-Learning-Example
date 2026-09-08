package q_generics.j_BridgeMethodClassCastException;

class Node<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class MyNode extends Node<String> {
    @Override
    public void setData(String data) {
        super.setData(data);
    }

    @Override
    public String getData() {
        return super.getData();
    }
}

// 로직 상 동작이 동일함. (raw type + 명시적 오버로딩)
class RuntimeNode extends Node {
    public void setData(Object data) {
        this.setData((String) data);
    }

    public void setData(String data) {
        super.setData(data);
    }

    @Override
    public Object getData() {
        return super.getData();
    }
}

public class BridgeMethodClassCastException {
    static void main(String[] args) {
        Node<String> node = new MyNode();
        node.setData("test");

        RuntimeNode node2 = new RuntimeNode();
        node2.setData((Object)"test");

        System.out.println(node.getData());
        System.out.println((String) node2.getData());
    }
}
