import java.util.Date;
import java.text.SimpleDateFormat;

public class EasyDateDemo {
    public static void main(String[] args) {
        // Step 1: Get current date and time
        Date currentDate = new Date();

        // Step 2: Format 1 - Date (dd/MM/yyyy)
        SimpleDateFormat dateFmt = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current Date : " + dateFmt.format(currentDate));

        // Step 3: Format 2 - Time (hh:mm:ss a)
        SimpleDateFormat timeFmt = new SimpleDateFormat("hh:mm:ss a");
        System.out.println("Current Time : " + timeFmt.format(currentDate));

        // Step 4: Format 3 - Day and Date (EEEE, MMMM dd, yyyy)
        SimpleDateFormat fullFmt = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        System.out.println("Full Date    : " + fullFmt.format(currentDate));
    }
}
