import java.io.File;
import java.util.Scanner;

public class ReadUpperCase {
    public static void main(String[] args) throws Exception {
        // Read directly from "abc.txt"
        Scanner fileSc = new Scanner(new File("text.txt"));
        
        System.out.println("--- Contents in UPPERCASE ---");
        
        // Loop through the file line by line
        while (fileSc.hasNextLine()) {
            // Read line, convert to upper case, and print
            System.out.println(fileSc.nextLine().toUpperCase());
        }
    }
}
