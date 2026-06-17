package Stream;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public String toString() {
        return "Employee [id=" + id +
               ", name=" + name +
               ", salary=" + salary + "]";
    }
}

public class HighestSalaryEmployee {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 50000),
                new Employee(102, "David", 75000),
                new Employee(103, "Smith", 65000),
                new Employee(104, "Alex", 90000),
                new Employee(105, "Tom", 85000)
        );

        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);

        System.out.println(highestSalaryEmployee);
    }
}