import java.text.DecimalFormat;

/**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/


public abstract class WirelessNetwork {

   protected String name;
   protected double bandwidth;
   protected double monthlyFixedCost;

   protected static int objCount = 0;

/**
*constructor method to set variables in.
*@param nameIn to set input variables
*@param bandwidthIn to set input variables
*@param monthlyFixedCostIn to set input variables
*
*/

   public WirelessNetwork(String nameIn,
                        double bandwidthIn, double monthlyFixedCostIn) {
   
      name = nameIn;
      bandwidth = bandwidthIn;
      monthlyFixedCost = monthlyFixedCostIn;
      objCount++;
   
   }
   
         /**
   *method to get input name.
   *@param nameIn to set input to get in report
   *
   */
         
   public void setName(String nameIn) {
   
      this.name = nameIn;
   }
   
        /**
   *method to set bandwidth.
   *@param bandwidthIn to set input to get in report
   *
   */
   
   public void setBandwidth(double bandwidthIn) {
   
      this.bandwidth = bandwidthIn;
   }
   
       /**
   *method to set fixed cost.
   *@param monthlyFixedCostIn to set input to get in report
   *
   */
   
   public void setMonthlyFixedCost(double monthlyFixedCostIn) {
   
      this.monthlyFixedCost = monthlyFixedCostIn;
   }
   
   /**
   *method to get input name.
   *@return name to get in report
   *
   */
   
   public String getName() {
   
      return name;
   }
   
   
   /**
   *method to get input bandwidth.
   *@return bandwidth to get in report
   *
   */
         
   public double getBandwidth() {
   
      return bandwidth;
   }
   
   
   
   /**
   *method to get input fixedCost.
   *@return fixedCost to get in report
   *
   */      
   public double getMonthlyFixedCost() {
   
      return monthlyFixedCost;
   }
   
   /**
   *method to get input name.
   *@return objcount to get in report
   *
   */
         
   public static int getCount() {
   
      return objCount;
   }
   
   /**
   *method to reset obj count.
   *
   */
   
   public static void resetCount() {
   
      objCount = 0;
   }
   
   /**
   *toString method to get input name.
   *@return output to get in report
   *
   */      
   public String toString() {
   
      DecimalFormat df1 = new DecimalFormat("$#,##0.00");
   
   
      String output = getName() + " (" + this.getClass() + ") Cost: "
                    + df1.format(monthlyCost()) + "\nBandwidth: " 
                    + getBandwidth() + " Mbps";
      return output;
   }
   
   /**
   *method to compare objects alphabetically.
   *@param comparison to set variable
   *@return name.toLowerCase().compareTo(comparison.getName().toLowerCase())
   *
   */
   
   
   public int compareTo(WirelessNetwork comparison) {
   
   
      return 
         this.toString().toLowerCase()
         .compareTo(comparison.toString().toLowerCase());
   }
   
         /**
   *abstract method to set montly cost.
   *@return nothing i think
   */
   
   public abstract double monthlyCost(); 
   
}