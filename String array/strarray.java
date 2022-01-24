import java.util.Scanner;
public class strarray{
  static int n;
  static int  i;
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    // System.out.println("Enter array length");
    n = sc.nextInt();
    String str[] = new String[n+1];
    for (i=0; i<n+1; i++) {
      System.out.println("Enter " + i + " item");
      str[i] = sc.nextLine();
    }
    for (i=0; i<str.length; i++) {
      System.out.println(i + "item is");
      System.out.println(str[i]);
    }
  }
}
