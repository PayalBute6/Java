interface ProductDetails {
    void display();
}

class Product implements ProductDetails {
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;

    // Static variable to count objects
    static int objectCount = 0;

    // Default constructor
    Product() {
        product_id = 0;
        product_name = "Unknown";
        product_cost = 0.0;
        product_quantity = 0;
        objectCount++;
    }

    // Parameterized constructor
    Product(int product_id, String product_name,
            double product_cost, int product_quantity) {

        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;

        objectCount++;
    }

    // Implementing interface method
    public void display() {
        System.out.println("Product ID       : " + product_id);
        System.out.println("Product Name     : " + product_name);
        System.out.println("Product Cost     : " + product_cost);
        System.out.println("Product Quantity : " + product_quantity);
        System.out.println();
    }
}

public class ProductDemo {
    public static void main(String[] args) {

        // Creating objects using default constructor
        Product p1 = new Product();

        // Creating objects using parameterized constructor
        Product p2 = new Product(101, "Laptop", 55000, 2);
        Product p3 = new Product(102, "Mouse", 800, 5);

        // Display contents of each object
        System.out.println("Product 1:");
        p1.display();

        System.out.println("Product 2:");
        p2.display();

        System.out.println("Product 3:");
        p3.display();

        // Display object count
        System.out.println("Total Number of Objects = " + Product.objectCount);
    }
}