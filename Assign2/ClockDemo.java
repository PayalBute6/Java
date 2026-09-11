import java.util.Scanner;

class Clock {
    int h, m, s;
    String mode;

    public Clock(int h, int m, int s) {
        if (isValid(h, m, s)) {
            this.m = m;
            this.s = s;
            setAMPM(h);
        } else {
            System.out.println("Invalid! Defaulting to 12:00:00 AM");
            this.h = 12; this.m = 0; this.s = 0; this.mode = "AM";
        }
    }

    // Check if time is valid
    boolean isValid(int h, int m, int s) {
        return (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60);
    }

    // Set time to AM/PM format
    void setAMPM(int hours) {
        this.mode = (hours >= 12) ? "PM" : "AM";
        this.h = (hours == 0 || hours == 12) ? 12 : hours % 12;
    }

    public void display() {
        System.out.printf("Time: %02d:%02d:%02d %s\n", h, m, s, mode);
    }
}

public class ClockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hours, Minutes, Seconds (separated by space): ");
        Clock c = new Clock(sc.nextInt(), sc.nextInt(), sc.nextInt());
        c.display();
        sc.close();
    }
}
