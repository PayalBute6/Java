import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // Instantiate BufferedReader wrapping InputStreamReader connected to System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Reading String input
        System.out.print("Enter Name : ");
        String name = br.readLine();

        // Reading integer input using Integer.parseInt()
        System.out.print("Enter Age : ");
        int age = Integer.parseInt(br.readLine());

        // Output results
        System.out.println("\n--- User Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}
