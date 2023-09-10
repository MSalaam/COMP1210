/**
 *  InvalidLengthException for networks.
 */
public class InvalidCategoryException extends Exception 
   //extends RuntimeException 
{
   /**
    *  @param category of networks
    */
   public InvalidCategoryException(String category) {
      super("For category: " + category);
   }

}