/**
 * Topic: 1.9 Accepting Input - BufferedReader & InputStreamReader
 * 
 * Question 21:
 * Write a Java program to read employee details (ID, Name, Monthly Salary)
 * using BufferedReader and InputStreamReader with proper exception handling.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P21BufferedReaderInputDemo {

    public static void main(String[] args) {
        // BufferedReader provides efficient buffering for character inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("==========================================");
        System.out.println("    BUFFERED READER INPUT DEMO           ");
        System.out.println("==========================================");

        try {
            System.out.print("Enter Employee ID   : ");
            int empId = Integer.parseInt(br.readLine());

            System.out.print("Enter Employee Name : ");
            String empName = br.readLine();

            System.out.print("Enter Monthly Salary: ");
            double monthlySalary = Double.parseDouble(br.readLine());

            double annualSalary = monthlySalary * 12;

            System.out.println("\n--- EMPLOYEE PAYROLL DETAILS ---");
            System.out.println("ID             : " + empId);
            System.out.println("Name           : " + empName);
            System.out.println("Monthly Salary : $" + monthlySalary);
            System.out.println("Annual Salary  : $" + annualSalary);
        } catch (IOException e) {
            System.out.println("IO Error occurred while reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid numeric input format! " + e.getMessage());
        }
        System.out.println("==========================================");
    }
}
