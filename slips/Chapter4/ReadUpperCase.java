import java.io.File;
import java.util.Scanner;
public class ReadUpperCase {
    public static void main(String[] args) throws Exception {
        Scanner fileSc = new Scanner(new File("abc.txt"));
        while (fileSc.hasNextLine()) {
            System.out.println(fileSc.nextLine().toUpperCase());
        }
    }
}