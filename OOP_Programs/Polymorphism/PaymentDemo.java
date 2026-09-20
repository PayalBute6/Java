interface Payment {
    void pay();
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
    }
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment made using Debit Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        // Using interface reference to demonstrate runtime polymorphism
        //Payment p;
        CreditCard c = new CreditCard();
        c.pay();

        // Calling pay() via UPI
        // p = new UPI();
        // p.pay();

        // // Calling pay() via Credit Card
        // p = new CreditCard();
        // p.pay();

        // // Calling pay() via Debit Card
        // p = new DebitCard();
        // p.pay();
    }
}

