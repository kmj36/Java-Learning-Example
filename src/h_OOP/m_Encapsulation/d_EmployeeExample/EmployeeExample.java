package h_OOP.m_Encapsulation.d_EmployeeExample;

import java.util.UUID;

class Employee {
    private final UUID Admin = UUID.fromString("90464516-80b9-4e59-9a8f-92e0704f00c6");
    private String emp_name;
    private String emp_id;
    private final UUID emp_uuid = UUID.randomUUID();
    private double net_salary;

    public Employee(String emp_name, String emp_id, double net_salary) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.net_salary = net_salary;
    }

    public String getEmpName() { return emp_name; }

    public void setEmpName(String emp_name) { this.emp_name = emp_name; }

    public void setNet_salary(double net_salary) {
        this.net_salary = net_salary;
    }

    public void Detail(UUID AdminUUID) {
        if (AdminUUID.equals(Admin)) {
            System.out.printf("Name: %s, ID: %s, UUID: %s, Salary: %s$", emp_name, emp_id, emp_uuid, net_salary);
        }
    }
}

public class EmployeeExample {
    static void main() {
        Employee e = new Employee("Alex", "ID_001", 25_000);
        e.Detail(UUID.fromString("90464516-80b9-4e59-9a8f-92e0704f00c6"));
    }
}
