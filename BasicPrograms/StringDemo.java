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
        System.out.println("Contains: " + s.contains("Java"));
        System.out.println("Index of P: " + s.indexOf('P'));
        System.out.println("Replace: " + s.replace('a', 'o'));

        // Additional Methods
        System.out.println("Trim: " + "   Java   ".trim());
        System.out.println("Concat: " + s.concat(" Language"));
        System.out.println("IsEmpty: " + s.isEmpty());
        System.out.println("Intern: " + s.intern());
        System.out.println("Join: " + String.join("-", "Java", "Python"));

        // Append using StringBuilder
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Append: " + sb.append(" Edition"));
    }
}
