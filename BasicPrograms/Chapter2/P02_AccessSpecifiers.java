// Topic 2.2: Access Specifiers in Java
// Demonstrates public, protected, default (package-private), and private visibility.

class Employee {
    // 1. Public: accessible from anywhere
    public String companyName = "Tech Corp";

    // 2. Protected: accessible within same package and subclasses
    protected String department = "Software Engineering";

    // 3. Default (Package-private): accessible within same package
    String designation = "Developer";

    // 4. Private: accessible ONLY within this class
    private double salary = 75000.00;

    // Public Getter method to access private field salary
    public double getSalary() {
        return salary;
    }

    // Public Setter method to modify private field salary safely
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary!");
        }
    }

    // Public method to display all details from within the class
    public void displayAllInfo() {
        System.out.println("Company     : " + companyName);
        System.out.println("Department  : " + department);
        System.out.println("Designation : " + designation);
        System.out.println("Salary      : ₹" + salary);
    }
}

public class P02_AccessSpecifiers {
    public static void main(String[] args) {
        System.out.println("=== 2.2 Access Specifiers Demo ===\n");

        Employee emp = new Employee();

        // Accessing public, protected, and default members directly in same package
        System.out.println("Public Member       : " + emp.companyName);
        System.out.println("Protected Member    : " + emp.department);
        System.out.println("Default Member      : " + emp.designation);

        // emp.salary is private and CANNOT be accessed directly like emp.salary!
        // We use public Getter and Setter methods instead:
        System.out.println("Private Member (via Getter): ₹" + emp.getSalary());

        // Updating private member via Setter
        emp.setSalary(82000.00);
        System.out.println("Updated Salary (via Getter): ₹" + emp.getSalary());

        System.out.println("\nFull Employee Details:");
        emp.displayAllInfo();
    }
}
