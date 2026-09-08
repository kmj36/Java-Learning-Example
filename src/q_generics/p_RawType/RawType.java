package q_generics.p_RawType;

class Box<T> {
    private T data;
    Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class RawType {
    static void main(String[] args) {
        Box rawBox = new Box(1);

        System.out.println((Integer)rawBox.getData());
    }
}
