package h_OOP.g_PackageClass.Specification;

class Test {
    public static final String VERSION = "1.0.0";

    void printInfo() {
        Package pkg = this.getClass().getPackage();
        System.out.println(pkg.getName());
        System.out.println(pkg.getImplementationVersion());
    }
}

public class getPackage {
    static void main() {
        Test t = new Test();
        t.printInfo();
    }
}
