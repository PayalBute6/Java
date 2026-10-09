/* Write a program which define class Employee with data member as id, name and salary 
Store the information of 'n' employees and display the name of employee having maximum salary (Use array of object)
*/
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    // Constructor to initialize the employee details
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeMaxSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of employees (n): ");
        int n = sc.nextInt();
        
        // Create an array of objects to store 'n' Employees
        Employee[] emps = new Employee[n];
        
        // Loop to accept information for 'n' employees
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            
            System.out.print("ID: ");
            int id = sc.nextInt();
            
            // Consume the newline character left by nextInt() so nextLine() works properly
            sc.nextLine(); 
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            // Create the object and store it in the array
            emps[i] = new Employee(id, name, salary);
        }
        
        // Logic to find the employee with the maximum salary
        // Start by assuming the first employee has the highest salary
        Employee maxSalaryEmp = emps[0];
        
        for (int i = 1; i < n; i++) {
            if (emps[i].salary > maxSalaryEmp.salary) {
                maxSalaryEmp = emps[i]; // Update if we find a higher salary
            }
        }
        
        // Display the name of the employee with the maximum salary
        System.out.println("\n-------------------------------------------------");
        System.out.println("Employee with the MAXIMUM salary is: " + maxSalaryEmp.name);
        System.out.println("Maximum Salary amount: " + maxSalaryEmp.salary);
        System.out.println("-------------------------------------------------");
        
        sc.close();
    }
}
