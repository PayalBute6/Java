/**
 * Topic: 1.9 Accepting Input - java.util.Scanner Class
 * 
 * Question 20:
 * Write an interactive Java program using java.util.Scanner to accept student registration details
 * (Name, Roll Number, Marks in 3 subjects) and calculate the total and average percentage.
 */

import java.util.Scanner;

public class P20_ScannerInputDemo {

    public static void main(String[] args) {
        // Create Scanner object attached to System.in (standard input stream)
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("      SCANNER CLASS INPUT DEMO            ");
        System.out.println("==========================================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks for Subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Marks for Subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Marks for Subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\n--- RESULT CARD ---");
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Total   : " + total + " / 300");
        System.out.println("Average : " + String.format("%.2f", average) + "%");
        System.out.println("==========================================");

        sc.close();
    }
}
