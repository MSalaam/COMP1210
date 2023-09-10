import java.util.Scanner;
/**
* program to solve for the result of a specified
   * formula after reading input values for x, y, and z.
*
* @author Mohamad Salaam
*
* @version 9/06/19
*
*/
public class Formula
{

     /**
  *
  * creating public class to have string statements in it.
  *
  * @param args Command line arguments
  *
  */  

   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = "";
   
      
      double x = 0;
      double y = 0;
      double z = 0;
      double result = 0; 
   
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      
      // prompt user to input x
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      
      // prompt user to input y
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      
      // prompt user to input z
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      result = x * y * z;
      
      // print 0.0 if divisor is 0
      if (result == 0) {
      
         System.out.println("result = 0.0 ");
      }
      
      // print formula calculation
      else {
         result = x * y * z;
         System.out.println("result = " +  (3 * x + 10.5) 
                        * (2 * y + 7.5) * (z + 5.5)
                        / result);
                        
      } 
      
      
   
   
   
   }
}
