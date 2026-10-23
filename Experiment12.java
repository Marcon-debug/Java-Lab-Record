import java.util.*;

public class Ex12_CollectionsDemo {
    public static void main(String[] args) {
        // 1. List Interface (ArrayList - allows duplicates)
        List<String> studentList = new ArrayList<>();
        studentList.add("Tafadzwa");
        studentList.add("Makoni");
        studentList.add("Tafadzwa"); // duplicate
        System.out.println("List (ArrayList) contents: " + studentList);

        // 2. Set Interface (HashSet - unique elements only)
        Set<String> courseSet = new HashSet<>();
        courseSet.add("Java Programming");
        courseSet.add("Data Structures");
        courseSet.add("Java Programming"); // duplicate ignored
        System.out.println("Set (HashSet) contents: " + courseSet);

        // 3. Map Interface (HashMap - key-value pairs)
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(329, "Tafadzwa");
        studentMap.put(330, "KPR Student");
        System.out.println("\nMap (HashMap) Entries:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Queue Interface (LinkedList as Queue)
        Queue<String> queue = new LinkedList<>();
        queue.offer("Queue Item 1");
        queue.offer("Queue Item 2");
        System.out.println("\nQueue before processing: " + queue);
        System.out.println("Processed (Polled) element: " + queue.poll());
        System.out.println("Queue after processing: " + queue);
    }
}import java.util.*;

public class Ex12_CollectionsDemo {
    public static void main(String[] args) {
        // 1. List Interface (ArrayList - allows duplicates)
        List<String> studentList = new ArrayList<>();
        studentList.add("Tafadzwa");
        studentList.add("Makoni");
        studentList.add("Tafadzwa"); // duplicate
        System.out.println("List (ArrayList) contents: " + studentList);

        // 2. Set Interface (HashSet - unique elements only)
        Set<String> courseSet = new HashSet<>();
        courseSet.add("Java Programming");
        courseSet.add("Data Structures");
        courseSet.add("Java Programming"); // duplicate ignored
        System.out.println("Set (HashSet) contents: " + courseSet);

        // 3. Map Interface (HashMap - key-value pairs)
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(329, "Tafadzwa");
        studentMap.put(330, "KPR Student");
        System.out.println("\nMap (HashMap) Entries:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

        // 4. Queue Interface (LinkedList as Queue)
        Queue<String> queue = new LinkedList<>();
        queue.offer("Queue Item 1");
        queue.offer("Queue Item 2");
        System.out.println("\nQueue before processing: " + queue);
        System.out.println("Processed (Polled) element: " + queue.poll());
        System.out.println("Queue after processing: " + queue);
    }
}