class Book {
    int bookId;
    String title;
    String author;
    String category;
    double price;
    boolean available;

    // Parameterized constructor
    public Book(int bookId, String title, String author, String category, double price, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Category  : " + category);
        System.out.println("Price     : ₹" + price);
        System.out.println("Available : " + (available ? "Yes" : "No"));
        System.out.println("-----------------------------------");
    }
}

public class Ex01_LibraryManagement {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Programming", "Herbert Schildt", "Education", 750.0, true);
        Book book2 = new Book(102, "Clean Code", "Robert C. Martin", "Software", 950.0, false);

        System.out.println("--- Library Management System ---");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}