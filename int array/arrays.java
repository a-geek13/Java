public class arrays {
  public static String[] myNames ={"Akash","ujjawal","chhavi","Nishant"};
  public static int[] myNumbers ={1,2,3,4};
  public static int[][] myNumbersA = {{1,2,3,4},{1,2,3,4}};
  public static void main(String[] args) {
    System.out.println(myNames[0]);
    System.out.println(myNames[1]);
    System.out.println(myNames[2]);
    System.out.println(myNames[3]);
    System.out.println(myNumbers[0]);
    System.out.println(myNumbers[1]);
    System.out.println(myNumbersA[0][2]);
    for (int i =0; i<myNumbers.length ;i++ ) {
      for (int j=0;j<myNumbers[i].length ;j++ ) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
