/**
*Inheritance and protection exercise.
*
@author: Mohamad Salaam
@version: 11/4/19
*
*/

public class InventoryItem {
   protected String name;
   protected double price;
   private static double taxRate = 0;

   /**
*method to set parameters for class.
*@param nameIn to set name
*@param priceIn to set price
*
*/

   public InventoryItem(String nameIn, double priceIn) {
   
      name = nameIn;
      price = priceIn;
   
   }

   /**
*method to return name for class.
*@return name after setting it
*
*/


   public String getName() {
   
      return name;
   
   }
   
      /**
*method to calculation item price.
*@return result after calculating costs
*
*/


   public double calculateCost() {
      double result = price * (1 + taxRate);
   
      return result;
   
   }
   
      /**
*method to set tax rate for class.
*@param taxRateIn to set tax rate
*
*/


   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   
   }

   /**
*method to print output.
*@return output for printing output.
*
*/

   public String toString() {
   
      String output;
      output = name + ": $" + calculateCost();
   
      return output;
   
   }





}
