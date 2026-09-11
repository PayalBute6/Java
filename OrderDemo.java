import java.util.Scanner;

abstract class Order
{
    int id;
    String description;
    
    static Scanner sc = new Scanner(System.in);

    void accept()
    {

        System.out.print("Enter Order ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Description: ");
        description = sc.nextLine();
    }

    void display()
    {
        System.out.println("Order ID: " + id);
        System.out.println("Description: " + description);
    }
}

class PurchaseOrder extends Order
{
    String customerName;

    void accept()
    {
        super.accept();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
    }

    void display()
    {
        super.display();

        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order
{
    String vendorName;

    void accept()
    {
        super.accept();

        System.out.print("Enter Vendor Name: ");
        vendorName = sc.nextLine();
    }

    void display()
    {
        super.display();

        System.out.println("Vendor Name: " + vendorName);
    }
}

public class OrderDemo
{
    public static void main(String args[])
    {
        PurchaseOrder p[] = new PurchaseOrder[3];
        SalesOrder s[] = new SalesOrder[3];

        System.out.println("Enter Purchase Order Details");

        for(int i = 0; i < 3; i++)
        {
            p[i] = new PurchaseOrder();

            System.out.println("\nPurchase Order " + (i + 1));
            p[i].accept();
        }

        System.out.println("\nEnter Sales Order Details");

        for(int i = 0; i < 3; i++)
        {
            s[i] = new SalesOrder();

            System.out.println("\nSales Order " + (i + 1));
            s[i].accept();
        }

        System.out.println("\n----- Purchase Orders -----");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("\nPurchase Order " + (i + 1));
            p[i].display();
        }

        System.out.println("\n----- Sales Orders -----");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("\nSales Order " + (i + 1));
            s[i].display();
        }
    }
}