package q_generics.i_genericClassinStaticFields;

class Test<T> {
    static int count = 0;
    Test() { count++; }
}

public class genericClassStaticFields {
    static void main(String[] args) {
        Test<Integer> testInteger = new Test<>();
        Test<String> testString = new Test<>();
        Test<Character> testCharacter = new Test<>();

        System.out.println(Test.count);
    }
}
