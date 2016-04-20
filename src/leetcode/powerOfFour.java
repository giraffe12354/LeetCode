package leetcode;

public class powerOfFour {
  
  public static void main(String[] args) {
    System.out.println(isPowerOfFour(5));
  }

    public static boolean isPowerOfFour(int num) {
      //Loop
  
      double x = (double) num;
      
     while (x>=4) {
        x = x/4;
        System.out.println(x);
      }
      if (x == 1) {
        return true;
      } else {
        return false;
      }
      
    
      

     
  }
}
