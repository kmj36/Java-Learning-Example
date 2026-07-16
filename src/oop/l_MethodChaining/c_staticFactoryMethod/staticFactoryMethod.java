package oop.l_MethodChaining.c_staticFactoryMethod;

class Model {
    private Object fieldA;
    private Object fieldB;

    public static Model create() {
        return new Model();
    }

    public Model withFieldA(Object value) {
        this.fieldA = value;
        return this;
    }

    public Model withFieldB(Object value) {
        this.fieldB = value;
        return this;
    }

    public void show() {
        System.out.println("fieldA: " + fieldA + ", fieldB: " + fieldB);
    }
 }

public class staticFactoryMethod {
    static void main() {
        Model m = Model.create().withFieldA("AAAA").withFieldB(1234);
        m.show();
    }
}
