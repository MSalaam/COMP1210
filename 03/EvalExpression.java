import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * Create a program to find value of x after math equation.
 *
 * @author Mohamad Salaam
 *
 * @version 9/09/19
 *
 */
 
public class EvalExpression {
  /**
    *
    * creating public class to have string statements in it.
    *
    * @param args Command line arguments
    *
    */ 
    
   public static void main(String[] args) {
    
      double xValue;
      double result;
      double total;
      double digitsLeft;
      
      
    
    // prompt user to iput x value
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      
      // calculate formula and find x 
      xValue = userInput.nextDouble();
      result = (((12.4 * Math.pow(xValue, 6) - 1.2 * Math.pow(xValue,  3)) 
         + +Math.abs((Math.sqrt(2.6 * Math.pow(xValue, 5)
         + -(6.8 * xValue) + 7)))) / (Math.pow(xValue, 4) + 9)); 
         
      System.out.println("Result: " + result);
      
      digitsLeft = Double.toString(result).indexOf(".");
      total = Double.toString(result).length();
      double digitsRight = (total - digitsLeft - 1); 
      
      System.out.println("# of characters to left of decimal point: " 
         + (int) digitsLeft);
      System.out.println("# of characters to right of decimal point: " 
         + (int) digitsRight);
      
      if (result >= 1) {
      
         DecimalFormat xValueFMT = new DecimalFormat("###,###,###,###.####");
         System.out.println("Formatted Result: " + xValueFMT.format(result));
      }
      
      else {
         DecimalFormat xValueFMT2 = new DecimalFormat("0.0##");
         System.out.println("Formatted Result: " + xValueFMT2.format(result));
      }
    
    
   }
}
