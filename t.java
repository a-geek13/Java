import java.util.Scanner;
public class t{

  static int n;

  static String[] str;

  static Scanner sc =new Scanner(System.in);

  static String s = "+";


  static String[] a;

  public static void main(String[] args) {
    System.out.println("Enter the number of charcters");
    n = sc.nextInt();
    str = new String[n];
    System.out.println(str.length);
    System.out.print("Enter " +n+ " charcters: ");
    for(int i=0; i<n; i++)
        str[i]= sc.nextLine();
    if (str.length %2 != 0){
      makeMiddle();
      System.out.println(a[0]);
      }else{
        System.out.println(false);
      }

    }

  public static String[] makeMiddle() {
      a = new String[1];
      a[0] = str[str.length/2];
        return a;
    }
}
