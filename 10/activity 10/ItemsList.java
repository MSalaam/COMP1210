 /**
*Inheritance and polymophism exercise.
*
@author: Mohamad Salaam
@version: 11/11/19
*
*/

public class ItemsList {

   private InventoryItem[] inventory;
   private int count;

/**
*constructor method to instantiate.
*
*/

   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   
   }
   
   /**
*method to add items instantiate and increment list.
*@param itemIn to add item to list.
*
*/   
   
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
      
   }
   
      /**
*method to calculate total with surcharge.
*@param electronicsSurcharge to calculate surcharge
*@return total which is after calculations
*
*/
   
   public double calculateTotal(double electronicsSurcharge) {
   
      //electronicsSurcharge = electronicsSurchargeIn;
      
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else { 
            total += inventory[i].calculateCost();
         }
      
      
      }
      return total;
   
      //return electronicsSurcharge;
   }
   
  /**
   *toString method to print out output.
   *@return output after doing all that stuff
   *
   */
   
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i].toString() + "\n";
      }
      return output;
   }
   
}
