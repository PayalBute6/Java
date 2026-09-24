// Marker interface (an interface with no methods or constants)
interface Marker {
}

class Product implements Marker {
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;
    
    static int objectCount = 0;

    // Default constructor
    public Product() {
        this.product_id = 0;
        this.product_name = "Unknown";
        this.product_cost = 0.0;
        this.product_quantity = 0;
        objectCount++;
    }

    // Parameterized constructor
    public Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        objectCount++;
    }

    // Display contents of each object
    public void display() {
        // Checking marker interface
        if (this instanceof Marker) {
            System.out.println("Product ID: " + product_id + ", Name: " + product_name + 
                               ", Cost: " + product_cost + ", Quantity: " + product_quantity);
        } else {
            System.out.println("Not a valid product (Marker interface not implemented).");
        }
    }

    // Display the object count
    public static void displayObjectCount() {
        System.out.println("Total Object Count: " + objectCount);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Creating objects of class product
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 45000.0, 10);
        Product p3 = new Product(102, "Mobile", 15000.0, 20);

        System.out.println("--- Product Details ---");
        // Displaying the contents of each object
        p1.display();
        p2.display();
        p3.display();

        System.out.println();
        // Also display the object count
        Product.displayObjectCount();
    }
}
