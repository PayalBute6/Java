package Part1_ClassAndObject;

class Book {
    String title;
    String author;
    double price;

    void showBook() {
        System.out.println("Book Title  : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Price       : $" + price);
        System.out.println("-----------------------------------");
    }
}

public class Program05_BookClass {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Clean Code";
        b1.author = "Robert C. Martin";
        b1.price = 34.99;

        Book b2 = new Book();
        b2.title = "Effective Java";
        b2.author = "Joshua Bloch";
        b2.price = 45.50;

        System.out.println("=== Library Book Catalog ===");
        b1.showBook();
        b2.showBook();
    }
}
