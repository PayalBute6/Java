// Base class Bank representing a generic bank
class Bank
{
    // Method to get the rate of interest, returns 0 by default
    int getRateOfInterest()
    {
        return 0;
    }
}

// HDFC class inherits from Bank
class HDFC extends Bank
{
    // Overriding the getRateOfInterest method to return HDFC's specific rate
    int getRateOfInterest()
    {
        return 8;
    }
}

// SBI class inherits from Bank
class SBI extends Bank
{
    // Overriding the getRateOfInterest method to return SBI's specific rate
    int getRateOfInterest()
    {
        return 9;
    }
}

// Main class to demonstrate method overriding (runtime polymorphism)
public class BankDemo
{
    public static void main(String args[])
    {
        // Reference variable of the base class Bank
        Bank b;

        // b refers to an object of HDFC
        b = new HDFC();
        // Calls the overridden method in HDFC class
        System.out.println("HDFC Rate of Interest: " + b.getRateOfInterest() + "%");

        // b refers to an object of SBI
        b = new SBI();
        // Calls the overridden method in SBI class
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest() + "%");
    }
}
