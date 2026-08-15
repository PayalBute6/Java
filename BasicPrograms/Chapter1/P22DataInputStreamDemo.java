/**
 * Topic: 1.9 Accepting Input - DataInputStream
 * 
 * Question 22:
 * Write a Java program to accept user inputs (Radius of a circle) using legacy
 * DataInputStream class, convert input string using Float.parseFloat(), and compute Circle Area.
 */

import java.io.DataInputStream;
import java.io.IOException;

@SuppressWarnings("deprecation") // Suppress warning for DataInputStream.readLine()
public class P22DataInputStreamDemo {

    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("==========================================");
        System.out.println("     DATA INPUT STREAM INPUT DEMO         ");
        System.out.println("==========================================");

        try {
            System.out.print("Enter Radius of Circle: ");
            String inputStr = dis.readLine();
            float radius = Float.parseFloat(inputStr);

            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;

            System.out.println("Radius    : " + radius);
            System.out.println("Area      : " + String.format("%.2f", area));
            System.out.println("Perimeter : " + String.format("%.2f", perimeter));
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        System.out.println("==========================================");
    }
}
