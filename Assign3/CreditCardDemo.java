interface CreditCardInterface {
    void viewCreditAmount();
    void useCard(double amount);
    void payCredit(double amount);
    void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface {
    String name;
    String cardNumber;
    double creditAmount;
    double creditLimit;

    public SilverCardCustomer(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.creditAmount = 0;
        this.creditLimit = 50000;
    }

    @Override
    public void viewCreditAmount() {
        System.out.println("Current Credit Amount for " + name + ": " + creditAmount);
    }

    @Override
    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Transaction successful! Used: " + amount);
        } else {
            System.out.println("Transaction failed! Credit limit exceeded.");
        }
    }

    @Override
    public void payCredit(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Payment successful! Paid: " + amount);
        } else {
            System.out.println("Payment failed! Amount exceeds current credit.");
        }
    }

    @Override
    public void increaseLimit() {
        System.out.println("Limit increase not applicable for Silver Card.");
    }
}

class GoldCardCustomer extends SilverCardCustomer {
    int limitIncreaseCount;

    public GoldCardCustomer(String name, String cardNumber) {
        super(name, cardNumber);
        this.creditLimit = 100000;
        this.limitIncreaseCount = 0;
    }

    @Override
    public void increaseLimit() {
        if (limitIncreaseCount < 3) {
            this.creditLimit += 5000;
            limitIncreaseCount++;
            System.out.println("Limit increased successfully! New Limit: " + creditLimit);
        } else {
            System.out.println("Limit increase failed! Maximum increase limit (3 times) reached.");
        }
    }
}

public class CreditCardDemo {
    public static void main(String[] args) {
        System.out.println("--- Silver Card Customer ---");
        SilverCardCustomer silver = new SilverCardCustomer("Alice", "1234567890123456");
        silver.viewCreditAmount();
        silver.useCard(40000);
        silver.useCard(15000); // Should fail
        silver.payCredit(10000);
        silver.viewCreditAmount();
        silver.increaseLimit();

        System.out.println("\n--- Gold Card Customer ---");
        GoldCardCustomer gold = new GoldCardCustomer("Bob", "9876543210987654");
        gold.viewCreditAmount();
        gold.useCard(90000);
        gold.useCard(20000); // Should fail
        gold.payCredit(30000);
        gold.increaseLimit();
        gold.increaseLimit();
        gold.increaseLimit();
        gold.increaseLimit(); // Should fail
        
        System.out.println("\nFinal States:");
        silver.viewCreditAmount();
        gold.viewCreditAmount();
    }
}
