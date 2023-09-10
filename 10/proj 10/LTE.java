/**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class LTE extends Cellular {

/** private variable. **/
   public static final double COST_FACTOR = 4.0;
   /**
*constructor method to set params.
*@param nameIn to set name
*@param bandwidthIn to set bandwidth
*@param fixedCostIn to set cost
*@param timeIn to set time
*@param dataLimitIn to set data limit
*/   
   public LTE(String nameIn, double bandwidthIn, double fixedCostIn,
            double timeIn, double dataLimitIn) {
            
      super(nameIn, bandwidthIn, fixedCostIn,
         timeIn, dataLimitIn);
      
   }
   
   /**
   *method to get monthly cost.
   *@return getMonthlyFixedCost() +
    (dataUsage() - getDataLimit()) * LTE.COST_FACTOR * 2 if more
    *
    */
    
   
   public double monthlyCost() {
   
      if (dataUsage() <= getDataLimit()) {
         return fixedCost;
      } else {
         return getMonthlyFixedCost() 
                  + (dataUsage() - getDataLimit()) * LTE.COST_FACTOR * 2;
      }
   }
   
}