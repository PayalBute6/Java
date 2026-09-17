import java.util.Scanner;

abstract class MyOrder {
    protected int id;
    protected String description;

    public MyOrder() {}

    public abstract void accept(Scanner scanner);
    public abstract void display();
}

class PurchaseOrder extends MyOrder {
    private String customerName;

    @Override
    public void accept(Scanner scanner) {
        System.out.print("Enter Purchase Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Purchase Order -> ID: " + id + ", Description: " + description + ", Customer: " + customerName);
    }
}

class SalesOrder extends MyOrder {
    private String vendorName;

    @Override
    public void accept(Scanner scanner) {
        System.out.print("Enter Sales Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Description: ");
        description = scanner.nextLine();
        System.out.print("Enter Vendor Name: ");
        vendorName = scanner.nextLine();
    }

    @Override
    public void display() {
        System.out.println("Sales Order -> ID: " + id + ", Description: " + description + ", Vendor: " + vendorName);
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PurchaseOrder[] poArray = new PurchaseOrder[3];
        SalesOrder[] soArray = new SalesOrder[3];

        System.out.println("--- Enter Details for 3 Purchase Orders ---");
        for (int i = 0; i < 3; i++) {
            poArray[i] = new PurchaseOrder();
            poArray[i].accept(scanner);
        }

        System.out.println("\n--- Enter Details for 3 Sales Orders ---");
        for (int i = 0; i < 3; i++) {
            soArray[i] = new SalesOrder();
            soArray[i].accept(scanner);
        }

        System.out.println("\n--- Displaying Purchase Orders ---");
        for (int i = 0; i < 3; i++) {
            poArray[i].display();
        }

        System.out.println("\n--- Displaying Sales Orders ---");
        for (int i = 0; i < 3; i++) {
            soArray[i].display();
        }

        scanner.close();
    }
}
