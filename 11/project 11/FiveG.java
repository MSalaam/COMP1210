/**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class FiveG extends Cellular { 

/** final double to set cost factor. **/
   public static final double COST_FACTOR = 5.0;

   /**
*constructor method to set variables in.
*@param nameIn to set input variables
*@param bandwidthIn to set input variables
*@param monthlyFixedCostIn to set input variables
*@param dataLimitIn to set input variables
*@param timeIn to set input variables
*
*/     
   public FiveG(String nameIn, double bandwidthIn, double monthlyFixedCostIn,
                   double timeIn, double dataLimitIn) {
                   
      super(nameIn, bandwidthIn, monthlyFixedCostIn,
         timeIn, dataLimitIn);
   
   }
   
   /**
   *method to set montlyCost.
   *@return monthlyFixedCost after calculation
   *
   */

   public double monthlyCost() {
   
      if (dataUsage() <= dataLimit) {
         return getMonthlyFixedCost();
      } else {
         return getMonthlyFixedCost() + (dataUsage() - getDataLimit())
                * FiveG.COST_FACTOR * 3;
      }
   }

}