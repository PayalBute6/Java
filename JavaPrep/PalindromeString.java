import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word/string: ");
        String str = sc.next();
            
            // Method 1: Two-Pointer approach (Efficient)
            boolean isPalindrome = true;
            int left = 0;
            int right = str.length() - 1;
            
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            
            if (isPalindrome) {
                System.out.println(str + " is a Palindrome.");
            } else {
                System.out.println(str + " is NOT a Palindrome.");
            }
        }
    }

