public class Gee17{
  public static void main(String[] args){
  

    int[][] ray = new int[7][7];
  /*  TwoDee twoDee = new TwoDee();

    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
    */
    ArrayAverages twoDee = new ArrayAverages(ray);

    System.out.println(twoDee);
    twoDee.rowAverages();
    twoDee.columnAverages();
    twoDee.arrayAverage();
  }
}
