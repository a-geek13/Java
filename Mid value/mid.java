import java.util.Scanner;
public class mid{
  static int n;
  static int[] ary;
  static Scanner sc =new Scanner(System.in);
  static int[] a;
  public static void main(String[] args) {
    System.out.println("Enter the numbers");
    n = sc.nextInt();
    ary = new int [n];
    System.out.print("Enter " +n+ " Numbers: ");
    for(int i=0; i<n; i++)
       ary[i] = sc.nextInt();
    if (ary.length %2 != 0){
      makeMiddle();
      System.out.println("The mid number is" + a[0]);
    }else{
      System.out.println("No mid number");
    }
  }

  public static int[] makeMiddle() {
      a = new int[1];
      a[0] = ary[ary.length/2];
        return a;

}
}
