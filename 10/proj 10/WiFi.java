 /**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class WiFi extends WirelessNetwork {

   private double modemCost;

/**
*constructor method to set params.
*@param nameIn to set name
*@param bandwidthIn to set bandwidth
*@param fixedCostIn to set cost
*@param modemCostIn to set modem cost
*
*/

   public WiFi(String nameIn, double bandwidthIn,
            double fixedCostIn, double modemCostIn) {
            
      super(nameIn, bandwidthIn, fixedCostIn);
      modemCost = modemCostIn;
   }
   
   /**
    method to get modem cost. 
    @return  modemCost
   */
   
   public double getModemCost() {
   
      return modemCost;
   }
   
   /**  
   *method to set modem cost.
   *@param modemCostIn to input cost
   *
   */
   
   public void setModemCost(double modemCostIn) {
   
      modemCost = modemCostIn;
   }
  
  /**
  *method to return monthly cost.
  *@return monthlyCost
  *
  */
  
   public double monthlyCost() {
   
      double monthlyCost = getModemCost() + getMonthlyFixedCost();
   
      return monthlyCost;
   }
  
}
