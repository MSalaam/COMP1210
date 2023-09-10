 /**
*Inheritance and protection exercise.
*
@author: Mohamad Salaam
@version: 11/4/19
*
*/
public class ElectronicsItem extends InventoryItem {
   /**
*Instance variables to set them.
*
*/

   public static final double SHIPPING_COST = 1.5;
   protected double weight;
   

   /**
*method to set parameters for class.
*@param nameIn to set name
*@param priceIn to set price
*@param weightIn to set weight
*
*/

   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
   
      super(nameIn, priceIn);
      weight = weightIn;
   
   }

   /**
*method to set parameters for class.
*@return super.calculateCost() to return calculation
*
*/


   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight);
   
   }




}
