import java.util.Scanner;

public class EmployeeDemo {
    
    static class Employee {
        int empId;
        String empName;
        String empDesignation;
        double empSal;

        // Constructor to initialize Employee objects
        public Employee(int empId, String empName, String empDesignation, double empSal) {
            this.empId = empId;
            this.empName = empName;
            this.empDesignation = empDesignation;
            this.empSal = empSal;
        }

        // Overriding toString() method to return employee info as a String
        @Override
        public String toString() {
            return "Employee ID   : " + empId + "\n" +
                   "Name          : " + empName + "\n" +
                   "Designation   : " + empDesignation + "\n" +
                   "Salary        : $" + empSal + "\n" +
                   "------------------------------";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee Details");
        System.out.print("Enter Employee ID: ");
        int empId = Integer.parseInt(sc.nextLine().trim());
        
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        
        System.out.print("Enter Employee Designation: ");
        String empDesignation = sc.nextLine();
        
        System.out.print("Enter Employee Salary: ");
        double empSal = Double.parseDouble(sc.nextLine().trim());

        // Creating Employee object with scanner input
        Employee emp = new Employee(empId, empName, empDesignation, empSal);

        // Displaying employee information using the overridden toString() method
        System.out.println("\n--- Employee Details ---");
        System.out.println(emp); // This automatically calls emp.toString()
        
        sc.close();
    }
}
