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

        System.out.println("Equals: " +
                           s.equals("Java Programming"));

        System.out.println("Uppercase: " +
                           s.toUpperCase());

        System.out.println("Lowercase: " +
                           s.toLowerCase());

        System.out.println("Contains Java: " +
                           s.contains("Java"));

        System.out.println("Index of P: " +
                           s.indexOf('P'));

        System.out.println("Replace: " +
                           s.replace('a', 'o'));
    }
}
