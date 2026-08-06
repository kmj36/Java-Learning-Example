package m_Optionals.h_practicalPatterns;

import java.util.List;

record Customer(int id, String name) {}

public class practicalPatterns {
    static void main(String[] args) {
        Integer id = 2;
        List<Customer> customers = List.of(
                new Customer(1, "Alice"),
                new Customer(2, "Bob"),
                new Customer(3, "Charlie")
        );

        String name = customers.stream()
                .filter(c -> c.id() == id)
                .findFirst() // Optional<String> 을 반환
                .map(Customer::name) // map 으로 Customer::name 실행하고 값을 받아 Optional<String>
                .orElse("UNKNOWN"); // 값 존재하면 name, 값 없으면 "UNKNOWN" 반환

        System.out.println(name);
    }
}