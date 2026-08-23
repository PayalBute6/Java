public class StringDemo
{
    public static void main(String[] args)
    {
        String s = "Java Programming";

        System.out.println("String: " + s);
        System.out.println("Length: " + s.length());
        System.out.println("Character: " + s.charAt(2));
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Substring: " + s.substring(0, 4));
        System.out.println("Equals: " + s.equals("Java Programming"));
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Contains Java: " + s.contains("Java"));
        System.out.println("Index of P: " + s.indexOf('P'));
        System.out.println("Replace: " + s.replace('a', 'o'));

        // New Methods Added:
        // 1. trim() - removes leading and trailing spaces
        String paddedStr = "   Java Programming   ";
        System.out.println("Trim: '" + paddedStr.trim() + "'");

        // 2. concat() - appends a string to the end
        System.out.println("Concat: " + s.concat(" Language"));

        // 3. isEmpty() - checks if string length is 0
        System.out.println("IsEmpty: " + s.isEmpty());
        System.out.println("IsEmpty (empty string): " + "".isEmpty());

        // 4. intern() - returns canonical representation from String Pool
        String strObj = new String("Java Programming");
        String internedStr = strObj.intern();
        System.out.println("Intern (internedStr == s): " + (internedStr == s));

        // 5. join() - joins strings with a delimiter
        System.out.println("Join: " + String.join("-", "Java", "Python", "C++"));

        // 6. append() - method of StringBuilder / StringBuffer (String is immutable)
        StringBuilder sb = new StringBuilder(s);
        sb.append(" Edition");
        System.out.println("StringBuilder Append: " + sb.toString());
    }
}
