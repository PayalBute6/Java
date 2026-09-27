package string_operation;

/*
 * Set C - a
 * comp class compares two strings. Also display proper messages on execution. 
 */

public class Comp {
    public void compare(String str1, String str2) {
        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }
    }
}
