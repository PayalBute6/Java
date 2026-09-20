import java.util.Scanner;

/*
 * Set B - d
 * Define a “Clock” class that does the following ; 
 * a. Accept Hours, Minutes and Seconds 
 * b. Check the validity of numbers 
 * c. Set the time to AM/PM mode 
 * Use the necessary constructors and methods to do the above task 
 */

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private String mode; // AM or PM

    public Clock(int hours, int minutes, int seconds) {
        if (isValid(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            setTimeMode();
        } else {
            System.out.println("Invalid time entered!");
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
            this.mode = "AM";
        }
    }

    private boolean isValid(int h, int m, int s) {
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    private void setTimeMode() {
        if (this.hours >= 12) {
            this.mode = "PM";
            if (this.hours > 12) {
                this.hours -= 12;
            }
        } else {
            this.mode = "AM";
            if (this.hours == 0) {
                this.hours = 12;
        }
        }
    }

    public void display() {
        System.out.printf("Time: %02d:%02d:%02d %s\n", this.hours, this.minutes, this.seconds, this.mode);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time in 24-hour format:");
        System.out.print("Hours: ");
        int h = sc.nextInt();
        System.out.print("Minutes: ");
        int m = sc.nextInt();
        System.out.print("Seconds: ");
        int s = sc.nextInt();

        Clock clock = new Clock(h, m, s);
        clock.display();
        
        sc.close();
    }
}
