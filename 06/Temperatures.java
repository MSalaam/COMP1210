import java.util.ArrayList;
/**
*create a program using for loops and terneries.
*@author : Mohamad Salaam
*version : 10/7/19
*
*/


public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

/**
* constructor to assign temperatures value.
*@param  temperaturesIn for Ints
*
*/

   public Temperatures(ArrayList<Integer> temperaturesIn) {
   
      temperatures = temperaturesIn;
   }
   
   /**
   *method to get the lowest temp.
   *@return 0, low for each value
   *
   */
   
   public int getLowTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         int low = temperatures.get(0);
         for (int i = 1; i < temperatures.size(); i++) {
            if (temperatures.get(i) < low) {
               low = temperatures.get(i);
            
            }
         }
      
         return low;
      
      }
   
   }
   
         /**
   *method to get the highest temp.
   *@return 0, high for each value
   *
   */
   
   public int getHighTemp() {
   
      if (temperatures.isEmpty()) {
         return 0;
      }
      else {
         int high = temperatures.get(0);
         for (Integer temp : temperatures) {
            if (temp > high) {
               high = temp;
            }        
         }
         return high;
      }
   }
   
         /**
   *method to get the lowerMinimum temp.
   *@param lowIn for lowIn integer
   *@return lowIn after getting it
   *
   */
   public int lowerMinimum(int lowIn) {
   
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
               /**
   *method to get the higherMinimum temp.
   *@param highIn for highIn integer
   *@return highIn after getting it
   *
   */
   
   public int higherMaximum(int highIn) {
   
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /** 
   *to string method to print output.
   *@return output after all calculations
   *
   */
   
   
   public String toString() {
   
      String output = "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
      
      return output;
   
   }
   
   
   
   
   
   
   
}