abstract class Employee {
    // Static variable
    static String company = "KPRIET Technologies";

    // Different access modifiers
    public String department;
    private double salary;
    protected String designation;
    String location; // default / package-private

    // Parameterized constructor
    public Employee(String department, double salary, String designation, String location) {
        this.department = department;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    // Getter and Setter for encapsulation (private salary)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Abstract method
    public abstract void displayRole();

    public void displayDetails() {
        System.out.println("Company     : " + company);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Location    : " + location);
        System.out.println("Salary      : ₹" + getSalary());
    }
}

class Developer extends Employee {
    public Developer(String department, double salary, String designation, String location) {
        super(department, salary, designation, location);
    }

    @Override
    public void displayRole() {
        System.out.println("Role        : Software Developer (Writes and debugs application code)");
    }
}

public class Ex02_EmployeeManagement {
    public static void main(String[] args) {
        Developer dev = new Developer("Computer Science", 65000.0, "Senior Developer", "Coimbatore");
        dev.displayDetails();
        dev.displayRole();
    }
}