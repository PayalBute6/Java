import CustomerPack.Customer;

/*
 * Set C - b
 * Different package access test.
 */

public class DifferentPackageDemo extends Customer {
    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println("--- Accessing from Different Package (Non-subclass) ---");
        System.out.println(c.publicVar);
        // System.out.println(c.privateVar); // Not accessible
        // System.out.println(c.protectedVar); // Not accessible using object reference
        // System.out.println(c.defaultVar); // Not accessible

        System.out.println("\n--- Accessing from Different Package (Subclass) ---");
        DifferentPackageDemo d = new DifferentPackageDemo();
        System.out.println(d.publicVar);
        System.out.println(d.protectedVar); // Accessible via inheritance
    }
}
