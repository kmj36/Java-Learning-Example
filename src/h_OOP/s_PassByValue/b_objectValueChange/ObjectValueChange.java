package h_OOP.s_PassByValue.b_objectValueChange;

class Dog {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    static void modifyReference(Dog d) {
        // 매개변수 d Ref 는 본문 aDog Ref 와 별도 인스턴스 변수이지만, 가르키는 Obj 가 같다.
        d.setName("Fifi"); // 현재 가르키는 Obj 가 같으므로 원본 Obj 에 영향을 준다.
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ObjectValueChange {
    static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog.modifyReference(aDog);
        System.out.println(aDog.getName());
    }
}
