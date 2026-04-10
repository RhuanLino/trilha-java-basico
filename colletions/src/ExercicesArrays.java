import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicesArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registered?");
        int employeesQuantity = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < employeesQuantity; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        for (Employee employee : employees) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        System.out.println("Enter the percentage: ");
        double percentage = sc.nextDouble();
        System.out.println("List of employees: ");

        Employee employeeSelected = employees.stream().filter(employee -> employee.id == id).findFirst().orElse(null);

        if (employeeSelected == null) {
            System.out.println("This id " + id + " does not exist");
            sc.close();
            return;
        }

        double calcPercentage = employeeSelected.salary + (employeeSelected.salary * percentage / 100);
        employeeSelected.setSalary(calcPercentage);

        for (Employee employee : employees) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + employee.getSalary());
        }

        sc.close();
    }
}
