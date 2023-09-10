 /**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class Cellular extends WirelessNetwork {

   protected double time;
   protected double dataLimit;

   public static final double COST_FACTOR = 1.0;

   /**
*constructor method to set params.
*@param nameIn to set name
*@param bandwidthIn to set bandwidth
*@param fixedCostIn to set cost
*@param timeIn to set time
*@param dataLimitIn to set data limit
*
*/

   public Cellular(String nameIn, double bandwidthIn, double fixedCostIn,
         double timeIn, double dataLimitIn) {
         
      super(nameIn, bandwidthIn, fixedCostIn);
      time = timeIn;
      dataLimit = dataLimitIn;
   }
   
   public double getTime() {
   
      return time;
   }
   
   public void setTime(double timeIn) {
   
      time = timeIn;
   }
   
   public double getDataLimit() {
   
      return dataLimit;
   }
   
   public void setDataLimit(double dataLimitIn) {
   
      dataLimit = dataLimitIn;
   }
   
   public double dataUsage() {
   
      double dataUsage = bandwidth * 8000 * time; 
      return dataUsage;
   }
   
   public double monthlyCost() {
   
      if (dataUsage() <= dataLimit) {
         return fixedCost;
      } else {
         return getMonthlyFixedCost() * (dataUsage() - getDataLimit()) * Cellular.COST_FACTOR;
      }
   }
   
   public String toString() {
   
      String output = super.toString() + "\nTime: " + getTime() + " seconds" + "\nData Limit: "
                    + getDataLimit() + " GB" + "\nData Used: " 
                    + dataUsage() + " GB";
      return output;
   }
   
}