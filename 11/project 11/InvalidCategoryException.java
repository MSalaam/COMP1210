/**
 *  InvalidLengthException for Pologon.
 */
public class InvalidCategoryException extends Exception 
   //extends RuntimeException 
{
   /**
    *  @param invalidSide of Polygon
    */
   public InvalidCategoryException(String category) {
      super("For category: " + category);
   }

}