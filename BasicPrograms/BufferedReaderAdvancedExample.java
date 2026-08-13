import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderAdvancedExample {
    public static void main(String[] args) throws IOException {
        // Instantiate BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== EMPLOYEE SALARY SLIP GENERATOR ===");

        // 1. Reading String (Employee Name & Department)
        System.out.print("Enter Employee Name : ");
        String empName = br.readLine();

        System.out.print("Enter Department    : ");
        String department = br.readLine();

        // 2. Reading Integer (Employee ID)
        System.out.print("Enter Employee ID   : ");
        int empId = Integer.parseInt(br.readLine());

        // 3. Reading Double (Basic Salary)
        System.out.print("Enter Basic Salary  : ");
        double basicSalary = Double.parseDouble(br.readLine());

        // 4. Reading Char (Performance Grade: A, B, C)
        System.out.print("Enter Performance Grade (A/B/C) : ");
        char grade = br.readLine().trim().toUpperCase().charAt(0);

        // Calculate HRA (20%), DA (10%), and Bonus based on Grade
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double bonus = 0.0;

        if (grade == 'A') {
            bonus = 5000.0;
        } else if (grade == 'B') {
            bonus = 3000.0;
        } else if (grade == 'C') {
            bonus = 1000.0;
        }

        double grossSalary = basicSalary + hra + da + bonus;

        // Displaying Summary
        System.out.println("\n----------------------------------");
        System.out.println("        SALARY SLIP SUMMARY        ");
        System.out.println("----------------------------------");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Department    : " + department);
        System.out.println("Grade         : " + grade);
        System.out.println("Basic Salary  : $" + basicSalary);
        System.out.println("HRA (20%)     : $" + hra);
        System.out.println("DA (10%)      : $" + da);
        System.out.println("Bonus         : $" + bonus);
        System.out.println("----------------------------------");
        System.out.println("Gross Salary  : $" + grossSalary);
        System.out.println("----------------------------------");
    }
}
