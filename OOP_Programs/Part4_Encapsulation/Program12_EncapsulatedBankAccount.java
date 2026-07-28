package Part4_Encapsulation;

class BankAccount {
    // Encapsulated data fields (private access)
    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor initializing account safely
    public BankAccount(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Warning: Initial balance cannot be negative. Setting balance to $0.0");
            this.balance = 0.0;
        }
    }

    // Getter for Balance (Read-only access to private field)
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    // Deposit method with rule enforcement
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("Updated Balance      : $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
        System.out.println("-----------------------------------");
    }

    // Withdraw method with rule enforcement
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds! Withdrawal failed.");
            System.out.println("Requested: $" + amount + " | Available: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
            System.out.println("Updated Balance      : $" + balance);
        }
        System.out.println("-----------------------------------");
    }
}

public class Program12_EncapsulatedBankAccount {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-9901", "Karan Malhotra", 1000.00);

        System.out.println("Initial Balance check via getter: $" + acc.getBalance());
        System.out.println("-----------------------------------");

        // Perform operations safely through methods
        acc.deposit(500.00);
        acc.withdraw(300.00);

        // Testing invalid operations
        acc.deposit(-50.00);
        acc.withdraw(2000.00);
    }
}
