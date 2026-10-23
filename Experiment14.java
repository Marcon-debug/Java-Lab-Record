import java.io.*;

public class Ex14_FileProcessing {
    public static void main(String[] args) {
        String fileName = "student_record.txt";

        // Writing data using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("Student Lab Record - Java Programming\n");
            bw.write("Roll Number: 25cs329\n");
            bw.write("Name: Tafadzwa Makoni\n");
            bw.write("Status: Completed Successfully\n");
            System.out.println("Data written to " + fileName + " successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing: " + e.getMessage());
        }

        // Reading data using BufferedReader
        System.out.println("\n--- Reading from " + fileName + " ---");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred during reading: " + e.getMessage());
        }
    }
}