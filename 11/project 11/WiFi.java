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
*constructor method to set variables in.
*@param nameIn to set input variables
*@param bandwidthIn to set input variables
*@param monthlyFixedCostIn to set input variables
   *@param modemCostIn to set input variables
   *
*/  

   public WiFi(String nameIn, double bandwidthIn,
            double monthlyFixedCostIn, double modemCostIn) {
            
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      modemCost = modemCostIn;
   }
   
         /**
   *method to set modem cost.
   *@param modemCostIn to set variables
   *
   */      
   public void setModemCost(double modemCostIn) {
   
      modemCost = modemCostIn;
   }
   
   /**
   *method to get modem cost.
   *@return modemCost
   *
   */
   
   
   public double getModemCost() {
   
      return modemCost;
   }
   
   
   /**
   *method to get monthly cost.
   *@return modemCost
   *
   */
       
   public double monthlyCost() {
   
      double monthlyCost = getModemCost() + getMonthlyFixedCost();
   
      return monthlyCost;
   }
  
}
