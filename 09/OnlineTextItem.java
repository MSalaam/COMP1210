 /**
*Inheritance and protection exercise.
*
@author: Mohamad Salaam
@version: 11/4/19
*
*/
public abstract class OnlineTextItem extends InventoryItem {

   /**
*method to set parameters for class.
*@param nameIn to set name
*@param priceIn to set price
*
*/

   public OnlineTextItem(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
   
   }
   
      /**
*method to set parameters for class.
*@return price after calculation
*
*/


   public double calculateCost() {
   
      return price;
      
   }



}