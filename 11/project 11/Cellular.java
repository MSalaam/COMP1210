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
   
  /** final double to set cost factor. **/

   public static final double COST_FACTOR = 1.0;

   /**
*constructor method to set variables in.
*@param nameIn to set input variables
*@param bandwidthIn to set input variables
*@param monthlyFixedCostIn to set input variables
*@param dataLimitIn to set input variables
*@param timeIn to set input variables
*
*/  

   public Cellular(String nameIn, double bandwidthIn, double monthlyFixedCostIn,
         double timeIn, double dataLimitIn) {
         
      super(nameIn, bandwidthIn, monthlyFixedCostIn);
      time = timeIn;
      dataLimit = dataLimitIn;
   }
   
   /**
   *method to get time.
   *@return time after setting in.
   *
   */
   
   public double getTime() {
   
      return time;
   }
   
   /**
   *method to set time.
   *@param timeIn to set time
   *
   */
   
   
   public void setTime(double timeIn) {
   
      time = timeIn;
   }
   
   /**
   *method to get data limit.
   *@return dataLimit
   *
   */
   
   public double getDataLimit() {
   
      return dataLimit;
   }
   
   /**
   *method to set data limit.
   *@param dataLimitIn to set the limit
   *
   */
   
   public void setDataLimit(double dataLimitIn) {
   
      dataLimit = dataLimitIn;
   }
   
   /**
   *method to calculate dataUsage.
   *@return dataUsage after calculating it
   *
   */
   
   public double dataUsage() {
   
      double dataUsage = bandwidth / 8000 * time; 
      return dataUsage;
   }
   
   /**
   *method to set montlyCost.
   *@return getMonthlyFixedCost() after calculation
   *
   */      
   public double monthlyCost() {
   
      if (dataUsage() <= dataLimit) {
         return getMonthlyFixedCost();
      } else {
         return getMonthlyFixedCost() * (dataUsage() - getDataLimit())
                * Cellular.COST_FACTOR;
      }
   }
   
   /**
   *toString method to return a string.
   *@return output after formatting
   *
   */
   
   
   public String toString() {
   
      String output = super.toString() + "\nTime: " + getTime()
                    + " seconds" + "\nData Limit: "
                    + getDataLimit() + " GB" + "\nData Used: " 
                    + dataUsage() + " GB";
      return output;
   }
   
}