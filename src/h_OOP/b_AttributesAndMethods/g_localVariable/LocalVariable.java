package h_OOP.b_AttributesAndMethods.g_localVariable;

class write {
    int add = 0;

    write(int init) {
        this.add = init;
    }

    public void writeText() {
        int localVariable = 1;
        System.out.println(localVariable+add);
    }
}

public class LocalVariable {
    static void main() {
        int localVariable = 3;
        write w1 = new write(0);
        write w2 = new write(4);

        w1.writeText();
        w2.writeText();
        System.out.println(localVariable);
    }
}
