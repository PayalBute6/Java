/*
 * Question: Write a program to define a class Account having members custname, accno. 
 * Define default and parameterized constructor. Create a subclass called SavingAccount 
 * with members savingbal, minbal. Create a derived class AccountDetail that extends 
 * the class SavingAccount with members, depositamt and withdrawalamt. Write a appropriate 
 * method to display customer details.
 */

// 1. Base Class: Account
class Account {

    String custname;
    int accno;

    // Default constructor
    public Account() {
        this.custname = "Unknown";
        this.accno = 0;
    }

    // Parameterized constructor
    public Account(String custname, int accno) {
        this.custname = custname;
        this.accno = accno;
    }
}

// 2. Subclass: SavingAccount (Inherits from Account)
class SavingAccount extends Account {

    double savingbal;
    double minbal;

    // Default constructor
    public SavingAccount() {
        super(); // Calls Account's default constructor
        this.savingbal = 0.0;
        this.minbal = 0.0;
    }

    // Parameterized constructor
    public SavingAccount(String custname, int accno, double savingbal, double minbal) {
        super(custname, accno); // Calls Account's parameterized constructor
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
}

// 3. Derived Class: AccountDetail (Inherits from SavingAccount)
public class AccountDetail extends SavingAccount {

    double depositamt;
    double withdrawalamt;

    // Default constructor
    public AccountDetail() {
        super(); // Calls SavingAccount's default constructor
        this.depositamt = 0.0;
        this.withdrawalamt = 0.0;
    }

    // Parameterized constructor
    public AccountDetail(String custname, int accno, double savingbal, double minbal, double depositamt, double withdrawalamt) {
        super(custname, accno, savingbal, minbal); // Calls SavingAccount's parameterized constructor
        this.depositamt = depositamt;
        this.withdrawalamt = withdrawalamt;

        // Calculate the final balance automatically
        this.savingbal = this.savingbal + depositamt - withdrawalamt;
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("----- Customer Account Details -----");
        System.out.println("Customer Name    : " + custname);
        System.out.println("Account Number   : " + accno);
        System.out.println("Minimum Balance  : Rs. " + minbal);
        System.out.println("Deposit Amount   : Rs. " + depositamt);
        System.out.println("Withdrawal Amount: Rs. " + withdrawalamt);
        System.out.println("Current Balance  : Rs. " + savingbal);
        System.out.println("------------------------------------");
    }

    // Main method to test our multi-level inheritance
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        // Initial Balance: 5000, Min Balance: 1000, Deposit: 2000, Withdraw: 1500
        AccountDetail cust = new AccountDetail("Radha", 101, 5000.0, 1000.0, 2000.0, 1500.0);

        // Display the details
        cust.displayDetails();
    }
}
