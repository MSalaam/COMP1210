 /**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class FiveG extends Cellular { 
   /** private double. **/
   public static final double COST_FACTOR = 5.0;
   /**
*constructor method to set params.
*@param nameIn to set name
*@param bandwidthIn to set bandwidth
*@param fixedCostIn to set cost
*@param timeIn to set time
*@param dataLimitIn to set data limit
*/   
   public FiveG(String nameIn, double bandwidthIn, double fixedCostIn,
                   double timeIn, double dataLimitIn) {
                   
      super(nameIn, bandwidthIn, fixedCostIn,
         timeIn, dataLimitIn);
   
   }
   
   /**
   *method to return monthly cost.
   @return getMonthlyFixedCost() 
   + (dataUsage() - getDataLimit()) * FiveG.COST_FACTOR * 3;
      *
      */

   public double monthlyCost() {
   
      if (dataUsage() <= getDataLimit()) {
         return fixedCost;
      } else {
         return getMonthlyFixedCost() 
                  + (dataUsage() - getDataLimit()) * FiveG.COST_FACTOR * 3;
      }
   }

}