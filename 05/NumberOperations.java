/** 
* write a program to calculate odd and even numbers.
* @author: Moe Salaam
* @version: 9/30/19
*
*/

public class NumberOperations {
   private int number;

   /**
* create public instances that the program will use.
* @param numberIn int that constructor will use
*/
   public NumberOperations(int numberIn) {
   
      number = numberIn;
   
   }
   
  /**
   *accessor to use in driver.
   *@return number that will be inputed in constructor
   *
   */
   
   public int getValue() {
   
      return number;
   }
   
  /**
   * String that calculates i under the number.
   * @return output after calculating numbers before
   * and after
   */
   
   public String oddsUnder() {
   
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         
         }
         i++;
      
      
      }
   
      return output;
   }
   
   /**
    * method  to see all even numbers under input.
    * @return output after calculations
    *
    */
   
   public String powersTwoUnder() {
   
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      
      
      }
   
      return output;
   }
   
   /**
    * method to compare numbers to see how to calculate.
    *@param compareNumber 1 if greater than 1
    *@return 1, -1, 0 after  calculating each
    */
    
   public int isGreater(int compareNumber) {
   
      if (number > compareNumber) {
         return 1;
      }
      
      else if (number < compareNumber) {
         return -1;
      }
      
      else { 
         return 0;
      }
   
   
   }
   
   /**
    * method to print final output of numbers.
    *@return number + "" after finding numbers under
    * and over
    */
    
   public String toString() {
     
     
      return number + "";
   }

}
