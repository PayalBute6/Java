// Topic 2.3: Array of Objects
// Demonstrates creating an array to store multiple objects of a class.

class Book {
    int bookId;
    String title;
    double price;

    // Constructor to initialize book object
    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    // Method to display book information
    void displayBook() {
        System.out.println("ID: " + bookId + " | Title: " + title + " | Price: ₹" + price);
    }
}

public class P03_ArrayOfObjects {
    public static void main(String[] args) {
        System.out.println("=== 2.3 Array of Objects Demo ===\n");

        // Step 1: Declare and instantiate an array of Book references (Size 3)
        Book[] library = new Book[3];

        // Step 2: Instantiate actual Book objects for each array index
        library[0] = new Book(101, "Java: The Complete Reference", 650.00);
        library[1] = new Book(102, "Head First Java", 720.50);
        library[2] = new Book(103, "Effective Java", 850.00);

        // Step 3: Iterate over the array of objects using a loop
        System.out.println("--- Library Book List ---");
        for (int i = 0; i < library.length; i++) {
            System.out.print("Book " + (i + 1) + " => ");
            library[i].displayBook();
        }

        // Calculating total cost of all books
        double totalCost = 0;
        for (Book b : library) {
            totalCost += b.price;
        }
        System.out.println("\nTotal Value of Books in Library: ₹" + totalCost);
    }
}
