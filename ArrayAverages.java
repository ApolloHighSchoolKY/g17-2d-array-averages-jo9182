import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int rowSum = 0;
    double rowAvg = 0.0;
    
    for(int row = 0; row < ray.length; row++){
      rowSum = 0;
      for(int col = 0; col < ray[row].length; col++)
        rowSum+= ray[row][col]; 
    rowAvg = rowSum / ray[row].length;
 }
 System.out.println("The average of the rows is: " + rowAvg);
}

  public void columnAverages(){
    //Column major order
    //  Take each column and go through all of the rows
    //  Top down and left to right
    //  No row on the outside, column on the outside
    int colSum = 0;
    double colAvg = 0.0;
    
    for(int col = 0; col < ray[0].length; col++){
      colSum = 0;
      for(int row = 0; row < ray.length; row++)
        colSum+= ray[row][col]; 
        /*
         * ray[0][0]
         * ray[1][0]
         * ray[2][0]
         */
     
 }
       colAvg = colSum / ray.length;
       System.out.println("The average of the columns is: " + colAvg);
 }

  public void arrayAverage(){
    int arraySum = 0;
    double arrayAvg = 0.0;
    
    for(int row = 0; row < ray.length; row++){
      arraySum = 0;
      for(int col = 0; col < ray[row].length; col++)
      arraySum+= ray[row][col]; 
    
  }
  arrayAvg = arraySum / (ray.length * ray[0].length);
System.out.println("The average of the array is: " + arrayAvg);

  }

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }

    return ""; 
  }
}
