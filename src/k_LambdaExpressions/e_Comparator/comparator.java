package k_LambdaExpressions.e_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User {
    String firstName;
    String lastName;

    User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class comparator {
    static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Elea", "Diindiisi"));
        users.add(new User("John", "Smith"));
        users.add(new User("Anna", "Smith"));

        // 성 -> 이름 순으로 정렬하는 기준
        Comparator<User> byLastThenFirst = Comparator.comparing(User::getLastName)
                .thenComparing(User::getFirstName);

        // 실제로 정렬 (리스트 자체가 변경됨)
        users.sort(byLastThenFirst);

        for (User u : users) {
            System.out.println(u);
        }
    }
}