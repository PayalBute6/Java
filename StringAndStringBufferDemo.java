import java.util.Arrays;

/**
 * StringAndStringBufferDemo.java
 * 
 * A single complete Java program demonstrating ALL 14 String class methods 
 * and ALL 9 StringBuffer class methods with clear console outputs.
 */
public class StringAndStringBufferDemo {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println(" PART 1: DEMONSTRATING ALL 14 STRING CLASS METHODS ");
        System.out.println("=================================================");

        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        // 1. length()
        int len = str.length();
        System.out.println("1. length()               : " + len);

        // 2. charAt()
        char ch = str.charAt(8); // 'J'
        System.out.println("2. charAt(8)              : " + ch);

        // 3. substring(beginIndex)
        String sub1 = str.substring(8);
        System.out.println("3. substring(8)           : \"" + sub1 + "\"");

        // 4. substring(beginIndex, endIndex)
        String sub2 = str.substring(8, 12);
        System.out.println("4. substring(8, 12)       : \"" + sub2 + "\"");

        // 5. equals()
        boolean isEq = str.equals(str2);
        System.out.println("5. equals()               : " + isEq);

        // 6. equalsIgnoreCase()
        boolean isEqIgnoreCase = str.trim().equalsIgnoreCase(str2);
        System.out.println("6. equalsIgnoreCase()     : " + isEqIgnoreCase);

        // 7. toUpperCase()
        String upper = str.trim().toUpperCase();
        System.out.println("7. toUpperCase()          : \"" + upper + "\"");

        // 8. toLowerCase()
        String lower = str.trim().toLowerCase();
        System.out.println("8. toLowerCase()          : \"" + lower + "\"");

        // 9. trim()
        String trimmed = str.trim();
        System.out.println("9. trim()                 : \"" + trimmed + "\"");

        // 10. replace()
        String replaced = str.trim().replace('o', '0');
        System.out.println("10. replace('o', '0')     : \"" + replaced + "\"");

        // 11. contains()
        boolean hasJava = str.contains("Java");
        System.out.println("11. contains(\"Java\")     : " + hasJava);

        // 12. indexOf()
        int idx = str.indexOf("Java");
        System.out.println("12. indexOf(\"Java\")      : " + idx);

        // 13. toString()
        String strObj = str.toString();
        System.out.println("13. toString()            : \"" + strObj + "\"");

        // 14. toCharArray()
        char[] charArr = "Java".toCharArray();
        System.out.println("14. toCharArray()         : " + Arrays.toString(charArr));


        System.out.println("\n=================================================");
        System.out.println(" PART 2: DEMONSTRATING ALL 9 STRINGBUFFER METHODS ");
        System.out.println("=================================================");

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Initial StringBuffer      : \"" + sb + "\"");

        // 1. append()
        sb.append(" World");
        System.out.println("1. append(\" World\")      : \"" + sb + "\"");

        // 2. insert()
        sb.insert(5, ",");
        System.out.println("2. insert(5, \",\")         : \"" + sb + "\"");

        // 3. replace()
        sb.replace(6, 12, " Java");
        System.out.println("3. replace(6, 12, \" Java\"): \"" + sb + "\"");

        // 4. delete()
        sb.delete(5, 6);
        System.out.println("4. delete(5, 6)           : \"" + sb + "\"");

        // 5. reverse()
        sb.reverse();
        System.out.println("5. reverse()              : \"" + sb + "\"");
        sb.reverse(); // Reverse back to original order for remaining operations

        // 6. length()
        int sbLen = sb.length();
        System.out.println("6. length()               : " + sbLen);

        // 7. capacity()
        int sbCap = sb.capacity();
        System.out.println("7. capacity()             : " + sbCap + " (Default 16 + initial length 5)");

        // 8. charAt()
        char sbChar = sb.charAt(0);
        System.out.println("8. charAt(0)              : '" + sbChar + "'");

        // 9. setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("9. setCharAt(0, 'h')      : \"" + sb + "\"");

        System.out.println("\n=================================================");
        System.out.println("              ALL DEMONSTRATIONS COMPLETED!      ");
        System.out.println("=================================================");
    }
}
