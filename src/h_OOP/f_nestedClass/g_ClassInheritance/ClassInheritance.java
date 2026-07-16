package h_OOP.f_nestedClass.g_ClassInheritance;

class SuperClass {
    public void doIt() {
        System.out.println("SuperClass doIt()");
    }
}

public class ClassInheritance {
    static void main() {
        SuperClass instance = new SuperClass() {
            @Override
            public void doIt() {
                System.out.println("Anonymous class doIt()");
            }
        };

        instance.doIt();
    }
}
