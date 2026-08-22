// Topic 2.6.1: Predefined Object Class & Its Methods
// Demonstrates toString(), equals(), hashCode(), and getClass() methods from java.lang.Object.

class Product {
    private int pId;
    private String pName;
    private double price;

    public Product(int pId, String pName, double price) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
    }

    // 1. Overriding toString() method
    @Override
    public String toString() {
        return "Product [ID=" + pId + ", Name='" + pName + "', Price=" + price + "]";
    }

    // 2. Overriding equals() method to compare content instead of reference addresses
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false; // Type check

        Product other = (Product) obj; // Downcasting
        return this.pId == other.pId && Double.compare(this.price, other.price) == 0 && this.pName.equals(other.pName);
    }

    // 3. Overriding hashCode() method
    @Override
    public int hashCode() {
        return java.util.Objects.hash(pId, pName, price);
    }
}

public class P06_ObjectClassMethods {
    public static void main(String[] args) {
        System.out.println("=== 2.6.1 Object Class Methods Demo ===\n");

        Product p1 = new Product(501, "Laptop", 55000.00);
        Product p2 = new Product(501, "Laptop", 55000.00);
        Product p3 = new Product(502, "Smartphone", 25000.00);

        // 1. toString() demonstration
        System.out.println("--- 1. toString() Output ---");
        System.out.println("p1.toString() => " + p1.toString());
        System.out.println("Direct print  => " + p2); // Automatically invokes toString()

        // 2. equals() demonstration
        System.out.println("\n--- 2. equals() Output ---");
        System.out.println("Is p1 equal to p2? : " + p1.equals(p2)); // true because fields match
        System.out.println("Is p1 equal to p3? : " + p1.equals(p3)); // false

        // 3. hashCode() demonstration
        System.out.println("\n--- 3. hashCode() Output ---");
        System.out.println("p1 Hash Code : " + p1.hashCode());
        System.out.println("p2 Hash Code : " + p2.hashCode());
        System.out.println("p3 Hash Code : " + p3.hashCode());

        // 4. getClass() demonstration
        System.out.println("\n--- 4. getClass() Output ---");
        Class<?> clazz = p1.getClass();
        System.out.println("Class Name       : " + clazz.getName());
        System.out.println("Simple Class Name: " + clazz.getSimpleName());
    }
}
