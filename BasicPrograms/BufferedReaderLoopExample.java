import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderLoopExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("=== ITEM PRICE CALCULATOR (Type 'stop' to finish) ===");

        double grandTotal = 0.0;
        int itemNumber = 1;

        while (true) {
            System.out.print("Enter price for Item #" + itemNumber + " (or type 'stop'): ");
            String input = br.readLine().trim();

            // Check exit condition
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                // Convert string to double
                double price = Double.parseDouble(input);
                
                if (price < 0) {
                    System.out.println("⚠️ Price cannot be negative. Try again.");
                    continue;
                }

                grandTotal += price;
                itemNumber++;
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input! Please enter a valid number or 'stop'.");
            }
        }

        System.out.println("\n----------------------------------");
        System.out.println("Total Items Entered : " + (itemNumber - 1));
        System.out.println("Grand Total Bill   : $" + grandTotal);
        System.out.println("----------------------------------");
    }
}
