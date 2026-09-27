package CustomerPack;

/*
 * Set C - b
 * Same package access test.
 */

public class SamePackageDemo {
    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println("--- Accessing from Same Package ---");
        System.out.println(c.publicVar);
        // System.out.println(c.privateVar); // Not accessible
        System.out.println(c.protectedVar);
        System.out.println(c.defaultVar);
    }
}
