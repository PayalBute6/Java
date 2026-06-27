import java.util.Scanner;

public class piglatin {

    public static String convert(String word) {

        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if ("aeiou".indexOf(ch) != -1) {
                index = i;
                break;
            }
        }

        // No vowel found
        if (index == -1) {
            return word + "ay";
        }

        // Word starts with a vowel
        if (index == 0) {
            return word + "ay";
        }

        // Move consonants before first vowel to end
        return word.substring(index)
                + word.substring(0, index)
                + "ay";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.println("Output: " + convert(word));

        sc.close();
    }
}