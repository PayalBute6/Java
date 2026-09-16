/*
 * Set A - a
 * Create an employee class (id,name,deptname,salary). Define a default and parameterized constructor. 
 * Use 'this' keyword to initialize instance variables. Keep a count of objects created. Create objects using 
 * parameterized constructors and display the object count after each object is created. (Use static member 
 * and method). Also display the contents of each object. 
 */

import java.util.Scanner;

class Employee {
   int id;
    String name;
    String deptname;
    double salary;
  static int objectCount = 0;

    Employee() {
        this.id = 0;
        this.name = "";
        this.deptname = "";
        this.salary = 0.0;
        objectCount++;
    }

    Employee(int id, String name, String deptname, double salary) {
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        objectCount++;
    }

    void displayObjectCount() {
        System.out.println("Object count: " + objectCount);
    }

    void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Dept: " + this.deptname);
        System.out.println("Salary: " + this.salary);
    }
}

public class EmployeeDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Enter Employee 1 Details ---");
        System.out.print("ID: ");
        int id1 = sc.nextInt();
        //sc.nextLine(); // consume the leftover newline
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Department: ");
        String dept1 = sc.nextLine();
        System.out.print("Salary: ");
        double salary1 = sc.nextDouble();
        
        Employee e1 = new Employee(id1, name1, dept1, salary1);
        e1.displayObjectCount();
        e1.display();

        System.out.println("\n--- Enter Employee 2 Details ---");
        System.out.print("ID: ");
        int id2 = sc.nextInt();
        //sc.nextLine(); // consume the leftover newline
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Department: ");
        String dept2 = sc.nextLine();
        System.out.print("Salary: ");
        double salary2 = sc.nextDouble();
        
        Employee e2 = new Employee(id2, name2, dept2, salary2);
        e2.displayObjectCount();
        e2.display();

        Employee e3 = new Employee(id2, name2, dept2, salary2);
        e3.displayObjectCount();
        e3.display();

        Employee e4 = new Employee(id2, name2, dept2, salary2);
        e4.displayObjectCount();
        e4.display();

        Employee e5 = new Employee(id2, name2, dept2, salary2);
        e5.displayObjectCount();
        e5.display();
        
        sc.close();
    }
}
