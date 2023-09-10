/**
* create a class to hold an array of numerical values.
*
*/


public class Scores {

   private int[] numbers;
   /**
   *instructor method.
   *@param numbersIn representing the inputs
   *
   */
   

   public Scores(int[] numbersIn) {
   
      numbers = numbersIn;
   
   }
   
   /**
   * method to find even numbers.
   *@return evens after calculating amount of even numbers
   *
   */
   
   

   public int[] findEvens() {
   
      int numberEvens = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
   
      int[] evens = new int[numberEvens];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
   
      return evens;
   }

 /**
   * method to find odd numbers.
   *@return odds after calculating amount of odd numbers
   *
   */

   public int[] findOdds() {
   
      int numberOdds = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
   
      int[] odds = new int[numberOdds];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
   
      return odds;
   }
   
    /**
   * method to find average of numbers.
   *@return sum / numbers.length after calculating average
   *
   */

   public double calculateAverage() {
   
      int sum = 0;
   
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
   
      return sum / (int) numbers.length;
   
   }

/** 
* method to return string output.
* @return result represting string
*
*/


   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      
   
      return result;
   
   }
   
/** 
* method to return string output hut in reverse.
* @return result represting string
*
*/
   public String toStringInReverse() {
   
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      
   
      return result;
   
   }














}