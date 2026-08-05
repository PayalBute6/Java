public class Assignment{
    public static void main(String args[]){
        int a = 10;
        int b = 20;

        // Simple Assignment (=)
        int c = a + b;
        System.out.println("c = a + b : " + c); // 30

        // Add AND Assignment (+=)
        a += 5; // equivalent to: a = a + 5 (10 + 5)
        System.out.println("a += 5   : " + a); // 15

        // Subtract AND Assignment (-=)
        a -= 3; // equivalent to: a = a - 3 (15 - 3)
        System.out.println("a -= 3   : " + a); // 12

        // Multiply AND Assignment (*=)
        a *= 2; // equivalent to: a = a * 2 (12 * 2)
        System.out.println("a *= 2   : " + a); // 24

        // Divide AND Assignment (/=)
        a /= 4; // equivalent to: a = a / 4 (24 / 4)
        System.out.println("a /= 4   : " + a); // 6

        // Modulus AND Assignment (%=)
        a %= 4; // equivalent to: a = a % 4 (6 % 4)
        System.out.println("a %= 4   : " + a); // 2
    }
}