package employee;

public class Employee {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : ₹" + salary);
    }
}

import employee.Employee;
import java.util.Scanner;

public class Ex07_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(id, name, salary);
        System.out.println("\n--- Employee Details (Package Demonstration) ---");
        emp.displayEmployee();

        scanner.close();
    }
}