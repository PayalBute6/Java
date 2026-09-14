import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;
    
    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    String department;
    
    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }
    
    public void displayDetails() {
        System.out.println("ID: " + id + " | Name: " + name + " | Department: " + department);
    }
}

public class OfficeStaffDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Office Staff: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        OfficeStaff[] staffArray = new OfficeStaff[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for staff " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Department: ");
            String department = scanner.nextLine();
            
            staffArray[i] = new OfficeStaff(id, name, department);
        }
        
        System.out.println("\n--- Office Staff Details ---");
        for (OfficeStaff staff : staffArray) {
            staff.displayDetails();
        }
        
        scanner.close();
    }
}
