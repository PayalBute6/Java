import java.util.Scanner;

// We'll name the class EmployeeWithToString to avoid conflict with the original Employee class
class EmployeeWithToString {
    int empid;
    String empname;
    String empdesignation;
    double empsal;

    // Constructor to initialize Employee objects
    public EmployeeWithToString(int empid, String empname, String empdesignation, double empsal) {
        this.empid = empid;
        this.empname = empname;
        this.empdesignation = empdesignation;
        this.empsal = empsal;
    }

    // Overriding toString() method to return employee info as a String
    @Override
    public String toString() {
        return "Employee ID   : " + empid + "\n" +
               "Name          : " + empname + "\n" +
               "Designation   : " + empdesignation + "\n" +
               "Salary        : $" + empsal + "\n" +
               "------------------------------";
    }
}

public class EmployeeToStringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Details");
        
        System.out.print("Enter Employee ID: ");
        int empid = Integer.parseInt(sc.nextLine().trim());
        
        System.out.print("Enter Employee Name: ");
        String empname = sc.nextLine();
        
        System.out.print("Enter Employee Designation: ");
        String empdesignation = sc.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        double empsal = Double.parseDouble(sc.nextLine().trim());

        // Creating Employee object with scanner input
        EmployeeWithToString emp = new EmployeeWithToString(empid, empname, empdesignation, empsal);

        // Displaying employee information using the overridden toString() method
        System.out.println("\n--- Employee Details ---");
        
        // This automatically calls emp.toString() behind the scenes!
        System.out.println(emp); 
        
        sc.close();
    }
}
