public class EmployeeConst {
    int id;
    String name;
    String designation;

    // Default constructor
    public EmployeeConst() {
        id = 0;
        name = "Unknown";
        designation = "Employee";
    }

    // Parameterized constructor
    public EmployeeConst(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        EmployeeConst emp1 = new EmployeeConst();

        // Creating an object using the parameterized constructor
        EmployeeConst emp2 = new EmployeeConst(101, "John Doe", "Manager");

        // Displaying information for the first employee
        System.out.println("Employee 1 (Default Constructor):");
        emp1.displayInfo();

        // Displaying information for the second employee
        System.out.println("\nEmployee 2 (Parameterized Constructor):");
        emp2.displayInfo();
    }
}
