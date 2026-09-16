/*
 * Set A - b
 * Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal) 
 * information using toString(). 
 */

import java.util.Scanner;

class Employee {
    int Empid;
    String Empname;
    String Empdesignation;
    double Empsal;

    public Employee(int empid, String empname, String empdesignation, double empsal) {
        this.Empid = empid;
        this.Empname = empname;
        this.Empdesignation = empdesignation;
        this.Empsal = empsal;
    }

    @Override
    public String toString() {
        return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empdesignation=" + Empdesignation + ", Empsal=" + Empsal + "]";
    }
}

public class EmployeeDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Enter Employee Details ---");
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume the leftover newline
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Designation: ");
        String designation = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        
        Employee emp = new Employee(id, name, designation, salary);
        System.out.println("\nEmployee Info: ");
        System.out.println(emp.toString());
        sc.close();
    }
}
