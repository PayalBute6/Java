import java.util.*;
public class SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n = n/10;
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}