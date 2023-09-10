 /**
*Inheritance and protection exercise.
*
@author: Mohamad Salaam
@version: 11/4/19
*
*/
public class OnlineArticle extends OnlineTextItem {

   private int wordCount;
   /**
*method to set parameters for class.
*@param nameIn to set name
*@param priceIn to set price
*
*/


   public OnlineArticle(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      wordCount = 0;
   
   }
   
      /**
*method to set word count for class.
*@param wordCountIn to set word count
*
*/


   public void setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
   
   }

}
