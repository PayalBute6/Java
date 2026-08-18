// Program to demonstrate Java Access Specifiers (Modifiers)
// Access Specifiers in Java:
// 1. private   : Accessible ONLY within the same class.
// 2. default   : Accessible within the same package (package-private).
// 3. protected : Accessible within the same package and subclasses in other packages.
// 4. public    : Accessible from anywhere.

class BaseClass {
    // 1. Private member
    private int privateVar = 10;
    
    // 2. Default (Package-Private) member - no modifier
    int defaultVar = 20;
    
    // 3. Protected member
    protected int protectedVar = 30;
    
    // 4. Public member
    public int publicVar = 40;

    // Method inside the same class can access all members including private
    public void displayBase() {
        System.out.println("--- Inside BaseClass (Same Class Access) ---");
        System.out.println("privateVar   = " + privateVar + "  (Accessible within same class)");
        System.out.println("defaultVar   = " + defaultVar + "  (Accessible within same package)");
        System.out.println("protectedVar = " + protectedVar + "  (Accessible in package & subclasses)");
        System.out.println("publicVar    = " + publicVar + "  (Accessible everywhere)");
    }
}

// Subclass in the same package
class DerivedClass extends BaseClass {
    public void displayDerived() {
        System.out.println("\n--- Inside DerivedClass (Subclass in Same Package) ---");
        // System.out.println("privateVar = " + privateVar); // ERROR: privateVar is not accessible here
        System.out.println("privateVar   = [Not Accessible directly from Subclass]");
        System.out.println("defaultVar   = " + defaultVar + "  (Accessible in subclass in same package)");
        System.out.println("protectedVar = " + protectedVar + "  (Accessible via inheritance)");
        System.out.println("publicVar    = " + publicVar + "  (Accessible)");
    }
}

public class AccessSpecifiersDemo {
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("        JAVA ACCESS SPECIFIERS (MODIFIERS) DEMO          ");
        System.out.println("==========================================================");

        // 1. Demonstration inside the defining class
        BaseClass baseObj = new BaseClass();
        baseObj.displayBase();

        // 2. Demonstration inside a derived class (Subclass)
        DerivedClass derivedObj = new DerivedClass();
        derivedObj.displayDerived();

        // 3. Demonstration inside another class in the same package
        System.out.println("\n--- Inside AccessSpecifiersDemo (Non-Subclass, Same Package) ---");
        // System.out.println("privateVar = " + baseObj.privateVar); // ERROR: compile-time error if uncommented
        System.out.println("privateVar   = [Not Accessible directly outside BaseClass]");
        System.out.println("defaultVar   = " + baseObj.defaultVar + "  (Accessible directly in same package)");
        System.out.println("protectedVar = " + baseObj.protectedVar + "  (Accessible directly in same package)");
        System.out.println("publicVar    = " + baseObj.publicVar + "  (Accessible directly anywhere)");

        System.out.println("\n==========================================================");
        System.out.println("                  ACCESS LEVEL MATRIX                     ");
        System.out.println("==========================================================");
        System.out.println(" Modifier  | Class | Package | Subclass | World ");
        System.out.println("-----------+-------+---------+----------+-------");
        System.out.println(" private   |  YES  |   NO    |    NO    |  NO   ");
        System.out.println(" default   |  YES  |   YES   |    NO    |  NO   ");
        System.out.println(" protected |  YES  |   YES   |   YES    |  NO   ");
        System.out.println(" public    |  YES  |   YES   |   YES    | YES   ");
        System.out.println("==========================================================");
    }
}
