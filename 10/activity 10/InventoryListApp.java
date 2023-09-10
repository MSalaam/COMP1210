/**
*Inheritance and polymophism exercise.
*
@author: Mohamad Salaam
@version: 11/11/19
*
*/
public class InventoryListApp {

/**
*main method to set items and print inventory.
*@param args because idk
*
*/


   public static void main(String[] args) {
   
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
   
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.print(myItems);
      System.out.println("\nTotal: " + myItems.calculateTotal(2.0));
      
   }
}
