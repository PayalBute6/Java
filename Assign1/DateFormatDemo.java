import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatDemo {
    public static void main(String[] args) {
        // Obtain current system date and time
        Date currentDate = new Date();

        // Format 1: dd/MM/yyyy
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + sdf1.format(currentDate));

        // Format 2: MM-dd-yyyy
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + sdf2.format(currentDate));

        // Format 3: EEEE MMMM dd yyyy
        SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + sdf3.format(currentDate));

        // Format 4: EEE MMMM dd HH:mm:ss z yyyy
        SimpleDateFormat sdf4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + sdf4.format(currentDate));

        // Format 5: dd/MM/yy HH:mm:ss a Z
        SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
        System.out.println("Current date and time is : " + sdf5.format(currentDate));

        // Format 6: HH:mm:ss
        SimpleDateFormat sdf6 = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Current time is : " + sdf6.format(currentDate));

        // Format 7: w (Week of year)
        SimpleDateFormat sdf7 = new SimpleDateFormat("w");
        System.out.println("Current week of year is : " + sdf7.format(currentDate));

        // Format 8: W (Week of month)
        SimpleDateFormat sdf8 = new SimpleDateFormat("W");
        System.out.println("Current week of month : " + sdf8.format(currentDate));

        // Format 9: D (Day of year)
        SimpleDateFormat sdf9 = new SimpleDateFormat("D");
        System.out.println("Current day of the year is : " + sdf9.format(currentDate));
    }
}
