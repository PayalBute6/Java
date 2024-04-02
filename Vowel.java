import java.util.Scanner;

class Vowel extends Thread {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        try {
            System.out.println("Enter String:");
            String s = scanner.nextLine();
            int len = s.length();
            System.out.println("Vowels are:");
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c == 'A' || c == 'a' || c == 'E' || c == 'e' ||
                    c == 'I' || c == 'i' || c == 'O' || c == 'o' ||
                    c == 'U' || c == 'u') {
                    System.out.println(c);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }

    public static void main(String args[]) {
        Vowel p = new Vowel();
        p.start();
    }
}
