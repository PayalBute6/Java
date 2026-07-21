import java.util.*;

public class Factors 
{
  public static void main(String[] args) 
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number: ");
    n=sc.nextInt();

    System.out.print("Factors of " + n + " are: ");
    for (int i = 1; i <= n; ++i)
      if (n % i == 0)
      {
        System.out.print(i + " ");
      }
   }
}
