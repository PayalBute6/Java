// Deep-Dive into Abstraction in Java

// ==========================================
// PART 1: Abstraction using Abstract Class
// ==========================================

// Parent Abstract Class (Blueprint with partial implementation)
abstract class TVRemote {
    // 1. Abstract method: NO code here! (Child MUST write the code)
    abstract void changeChannel();

    // 2. Normal method: HAS code (Shared by all remotes)
    void turnOn() {
        System.out.println("TV is turned ON");
    }
}

// Child Class 1
class SamsungRemote extends TVRemote {
    @Override
    void changeChannel() {
        System.out.println("Samsung: Changing channel via smart menu");
    }
}


// ==========================================
// PART 2: Abstraction using Interface (100% Abstraction)
// ==========================================

// Interface (A pure contract - NO normal methods, only method names!)
interface Printer {
    void printDocument(); // Abstract by default
}

// Class implementing the interface
class HPPrinter implements Printer {
    @Override
    public void printDocument() {
        System.out.println("HP Printer: Printing document in color...");
    }
}


// ==========================================
// MAIN CLASS TO RUN BOTH EXAMPLES
// ==========================================
public class FocusOnAbstraction {
    public static void main(String[] args) {
        System.out.println("--- 1. Abstract Class Demo ---");
        TVRemote remote = new SamsungRemote();
        remote.turnOn();         // Runs normal method from parent
        remote.changeChannel();  // Runs overridden method from child

        System.out.println("\n--- 2. Interface Demo ---");
        Printer printer = new HPPrinter();
        printer.printDocument(); // Runs implemented method
    }
}
