import java.io.File;
import java.util.Scanner;

public class FileReverseCase {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String path = sc.nextLine();
        
        // 1. Read file
        Scanner fileSc = new Scanner(new File(path));
        StringBuilder text = new StringBuilder();
        while (fileSc.hasNextLine()) {
            text.append(fileSc.nextLine()).append("\n");
        }
        
        // 2. Reverse text
        text.reverse();
        
        // 3. Change Case and Print directly
        System.out.println("\n--- Output ---");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // If it's uppercase, make it lower. Otherwise, make it upper.
            // (Symbols and spaces will just stay the same!)
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}
