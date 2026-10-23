import java.io.*;

class SerializableStudent implements Serializable {
    private static final long serialVersionUID = 1L;
    int rollNo;
    String name;
    double cgpa;

    public SerializableStudent(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + cgpa);
    }
}

public class Ex15_SerializationDemo {
    public static void main(String[] args) {
        String filePath = "student.ser";
        SerializableStudent student = new SerializableStudent(329, "Tafadzwa Makoni", 9.2);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(student);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            SerializableStudent deserializedStudent = (SerializableStudent) ois.readObject();
            System.out.println("\nObject deserialized successfully. Details:");
            deserializedStudent.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}