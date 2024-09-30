import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Q2StreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter employee name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees.add(new Employee(name));
        }

        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getName().startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Employees whose names start with 'A':");
        for (Employee emp : filteredEmployees) {
            System.out.println(emp.getName());
        }

        scanner.close();
    }
}