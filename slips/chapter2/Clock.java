/* 
Question: Define a “Clock” class that does the following; 
a. Accept Hours, Minutes and Seconds 
b. Check the validity of numbers 
c. Set the time to AM/PM mode 
Use the necessary constructors and methods to do the above task
*/
public class Clock {
    // Meaningful variable names are easier for beginners to understand
    int hours;
    int minutes;
    int seconds;

    // Constructor to set the initial time when a new Clock object is created
    public Clock(int h, int m, int s) {
        hours = h; 
        minutes = m; 
        seconds = s;
    }

    // Method to check if the time entered is valid
    public boolean isValid() {
        // Hours must be between 0 and 23. Minutes and seconds must be between 0 and 59.
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
            return true;
        } else {
            return false;
        }
    }

    // Method to convert 24-hour time to 12-hour AM/PM format and print it
    public void showAMPM() {
        // Step 1: Check if the time is valid first
        if (isValid() == false) {
            System.out.println("Invalid Time");
            return; // Stop the method here if time is invalid
        }
        
        String period;
        int displayHours = hours;

        // Step 2: Determine if it is AM or PM
        if (hours >= 12) {
            period = "PM";
        } else {
            period = "AM";
        }

        // Step 3: Convert 24-hour format to 12-hour format
        if (hours == 0) {
            displayHours = 12;         // Midnight is 12 AM, not 0 AM
        } else if (hours > 12) {
            displayHours = hours - 12; // Example: 14 - 12 = 2 PM
        }
        
        // Step 4: Print the final result
        System.out.println(displayHours + ":" + minutes + ":" + seconds + " " + period);
    }

    // Main method to test our Clock class
    public static void main(String[] args) {
        // Test Case 1: A valid time (14:30:45 is 2:30:45 PM)
        Clock validClock = new Clock(14, 30, 45); 
        System.out.print("Time 1 (14:30:45): ");
        validClock.showAMPM();
        
        // Test Case 2: An invalid time (25 hours is not possible)
        Clock invalidClock = new Clock(25, 0, 0); 
        System.out.print("Time 2 (25:00:00): ");
        invalidClock.showAMPM();
    }
}
