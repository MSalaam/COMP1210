/**
*class for int division and decimal division.
*@author: Mohamad Salaam
*@version: 11/18/19
*
*/


public class Division {

/**
*method for int division.
*@param numeratorIn to set numerator
*@param denominatorIn to set denominator
*@return 0, result after calcuation
*
*/


   public static int intDivide(int numeratorIn, int denominatorIn) {
      int numerator = numeratorIn;
      int denominator = denominatorIn;
      int result;
      try {
         result = numerator / denominator;
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
      return result;
   }
   
/**
*method for float division.
*@param numeratorIn to set numerator
*@param denominatorIn to set denominator
*@return result after calculation
*
*/      
   public static float decimalDivide(int numeratorIn, int denominatorIn) {
      int numerator = numeratorIn;
      int denominator = denominatorIn;
      
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator"
                                         + "cannot be zero.");
      }
      
      float result =  (float) numerator / denominator;
   
      return result;
   }
   
}

