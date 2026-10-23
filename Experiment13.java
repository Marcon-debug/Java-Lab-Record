import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNo, other.rollNo);
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Ex13_SortingDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(329, "Tafadzwa"));
        students.add(new Student(310, "Ananya"));
        students.add(new Student(315, "Rahul"));

        System.out.println("--- Before Sorting ---");
        for (Student s : students) System.out.println(s);

        // Sort using Comparable (Roll Number)
        Collections.sort(students);
        System.out.println("\n--- Sorted by Roll Number (Comparable) ---");
        for (Student s : students) System.out.println(s);

        // Sort using Comparator (Name)
        students.sort(new NameComparator());
        System.out.println("\n--- Sorted by Name (Comparator) ---");
        for (Student s : students) System.out.println(s);
    }
}