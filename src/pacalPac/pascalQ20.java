package pacalPac;

public class pascalQ20
{
  

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    int[][] pTriangle = pascalTriangle(20);
    
    System.out.println("Here is the triangle:");
        printTriangleTabby(pTriangle) ;
  }
  
  public static void printTriangle(int[][] t){
    
    for(int r= 0; r < t.length; r++)
    {
       for(int s= (int)((10*(t.length-r))  ); s >=0; s-=5)
       {
         System.out.print(" ");
       }
       
        for(int c = 0; c < t[r].length; c++)
        {
          System.out.print(t[r][c] + "   ");
        }
        System.out.println();
    }
  }
  
  
  
  
  public static void printTriangleTabby(int[][] t){
    
    int totalTabs = t.length * 2;
    
    for(int r= 0; r < t.length; r++)
    {
      //if(r % 2 ==0) System.out.print("\t");
       for(int tabs= (totalTabs/2) - (r ); tabs >=0; tabs--)
       {
         System.out.print(" \t");
       }
       
      // if(r % 2 ==1) System.out.print("\t");
        for(int c = 0; c < t[r].length; c++)
        {
          System.out.print(t[r][c] + "\t\t");
        }
        System.out.println();
    }
  }
  
  public static int[][] pascalTriangle(int n){
    
      int[][] pt = new int[n][0];
          
            for(int row = 0; row < n ; row++)
            {
              pt[row]= new int[row+1];
              pt[row][0] = 1;
              pt[row][pt[row].length-1] = 1;
            }
    
    
      return pt;
  }
  
  
  
  
  
  

}
