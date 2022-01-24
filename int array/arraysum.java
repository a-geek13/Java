import java.util.Scanner;

public class arraysum
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter the Value of n: ");
      int n = scan.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter " +n+ " Numbers: ");
      for(int i=0; i<n; i++)
         arr[i] = scan.nextInt();

      int sum = 0;
      for(int i=0; i<n; i++)
         sum += arr[i];

      System.out.println("\nSum = " +sum);
   }
}
