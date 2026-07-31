// Compile-time Polymorphism Example: Payment Gateway

class Payment {
    // 1. Pay with Cash
    void makePayment(double amount) {
        System.out.println("Paid $" + amount + " in Cash.");
    }

    // 2. Pay with Credit Card (Different parameters)
    void makePayment(String cardNumber, double amount) {
        System.out.println("Paid $" + amount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }

    // 3. Pay with UPI (Different parameter type)
    void makePayment(String upiId, String upiPin, double amount) {
        System.out.println("Paid $" + amount + " using UPI ID: " + upiId);
    }
}

public class PaymentOverloading {
    public static void main(String[] args) {
        Payment pay = new Payment();

        // Compiler knows WHICH method to call based on the arguments!
        pay.makePayment(150.0);                                  // Method 1 (Cash)
        pay.makePayment("1234-5678-9012-3456", 500.0);             // Method 2 (Card)
        pay.makePayment("user@upi", "1234", 250.0);                // Method 3 (UPI)
    }
}
