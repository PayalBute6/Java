package Part3_Constructors;

class BankAccount {
    String accountNumber;
    String customerName;
    double balance;

    // Parameterized Constructor initializing account fields
    BankAccount(String accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Method to display account details
    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Current Balance: $" + balance);
        System.out.println("-----------------------------------");
    }
}

public class Program11_BankAccountConstructor {
    public static void main(String[] args) {
        // Instantiate accounts with initial parameters
        BankAccount acc1 = new BankAccount("ACC-1001", "Vikram Sethi", 15000.75);
        BankAccount acc2 = new BankAccount("ACC-1002", "Meera Nair", 24500.00);

        System.out.println("=== Bank Account Information ===");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
