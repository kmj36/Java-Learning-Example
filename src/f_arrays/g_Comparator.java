package f_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class g_Comparator {

    // static으로 변경 (main에서 바로 생성하기 위해)
    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Employee[] employeeArray = {
                new Employee("James"), new Employee("Olivia"), new Employee("Michael"),
                new Employee("Sophia"), new Employee("Daniel"), new Employee("Emma"),
                new Employee("William"), new Employee("Ava"), new Employee("Benjamin"),
                new Employee("Charlotte")
        };

        Arrays.sort(employeeArray, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.name.compareTo(e2.name);  // 이름 기준 정렬
            }
        });

        for (Employee e : employeeArray) {
            System.out.println(e.name);
        }
    }
}