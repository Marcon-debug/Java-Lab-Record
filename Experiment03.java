import java.util.Scanner;

public class Ex03_StudentAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Department: ");
        String department = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Percentage: ");
        double percentage = scanner.nextDouble();

        System.out.println("\n--- Student Admission Details ---");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Age          : " + age);
        System.out.println("Percentage   : " + percentage + "%");

        scanner.close();
    }
}