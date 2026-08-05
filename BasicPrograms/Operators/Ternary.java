public class Ternary {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;

        // Example 1: Finding the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("Maximum of " + a + " and " + b + " is: " + max);

        // Example 2: Checking if a number is Even or Odd
        int number = 15;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is: " + result);

        // Example 3: Pass or Fail check
        int marks = 75;
        String status = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Exam Status: " + status);
    }
}
