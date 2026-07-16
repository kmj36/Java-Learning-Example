package h_OOP.d_static.b_classVariable;

class Customer {
    static String staticField;   // static 필드
    String instanceField;        // 일반(인스턴스) 필드
}

public class classVariable {
    static void main() {
        Customer.staticField = "value";
        System.out.println(Customer.staticField);

        Customer c = new Customer();
        c.instanceField = "customer";
        System.out.println(c.instanceField);
    }
}
