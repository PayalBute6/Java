import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    // Parameterized constructor
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    private String department;

    // Constructor for OfficeStaff
    public OfficeStaff(int id, String name, String department) {
        super(id, name); // Call to superclass constructor
        this.department = department;
    }

    // Method to display details
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("-------------------------");
    }
}

public class StaffDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Office Staff to create: ");
        int n = scanner.nextInt();

        // Create an array to hold n OfficeStaff objects
        OfficeStaff[] staffArray = new OfficeStaff[n];

        // Loop to accept details for n objects
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Staff " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()
            
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Department: ");
            String dept = scanner.nextLine();

            // Instantiate and store in the array
            staffArray[i] = new OfficeStaff(id, name, dept);
        }

        System.out.println("\n--- All Office Staff Details ---");
        // Loop to display all details
        for (int i = 0; i < n; i++) {
            staffArray[i].display();
        }

        scanner.close();       
    }
}
