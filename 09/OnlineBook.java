 /**
*Inheritance and protection exercise.
*
@author: Mohamad Salaam
@version: 11/4/19
*
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;

/**
*method to set parameters for class.
*@param nameIn to set name
*@param priceIn to set price
*
*/

   public OnlineBook(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      author = "Author Not Listed";
   
   }
   
      /**
*method to set parameters for class.
*@param authorIn to set author name
*
*/

   
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   
   }
      /**
*method to set toString method for class.
*@return output with all variables
*
*/

   
   public String toString() {
   
      String output = name + " - " + author + ": $" + price;
   
      return output;
   
   }
   
   
   
}
