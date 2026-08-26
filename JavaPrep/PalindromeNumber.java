import java.util.Scanner;

class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(num == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}