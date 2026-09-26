package SY;

/*
 * Set B - a
 * Write a Java program to create a Package “SY” which has a class SYMarks (members ComputerTotal, 
 * MathsTotal, and ElectronicsTotal). 
 */

public class SYMarks {
    public int ComputerTotal;
    public int MathsTotal;
    public int ElectronicsTotal;

    public SYMarks(int computerTotal, int mathsTotal, int electronicsTotal) {
        this.ComputerTotal = computerTotal;
        this.MathsTotal = mathsTotal;
        this.ElectronicsTotal = electronicsTotal;
    }
}
