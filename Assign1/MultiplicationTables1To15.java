import java.util.Scanner;

public class MultiplicationTables1To15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tables (n): ");
        int n = sc.nextInt();
        //int n=15;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        //sc.close(); 
    }
}