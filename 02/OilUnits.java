import java.util.Scanner;
/**
 * program to solve for the result of a specified
 * formula after reading input values for x, y, and z.
 *
 * @author Mohamad Salaam
 *
 * @version 9/06/19
 *
 */

public class OilUnits
{

  /**
    *
    * creating public class to have string statements in it.
    *
    * @param args Command line arguments
    *
    */  
    
   public static void main(String[] args)
   {
      
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int x = 0;
      int g = 0;
      int q = 0;
      int o = 0;
      int barrels = 0; 
      int gallons = 0;
      int quarts = 0;
      int oz = 0;
      
      // prompt user to enter amount of oil in oz
      System.out.print("Enter amount of oil in ounces: ");
      oz = userInput.nextInt();
      
   
      barrels = oz / 5376;
      g = oz - barrels * 5376;
      gallons = g / 128;
      q = g - gallons * 128;
      quarts = q / 32;
      o = q % 32;
      
      
      // if amount exceeds 1 billion
      if (oz >= 1000000000) {
      
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      
      
      else {
      // print out calculations 
         System.out.println("Oil amount in units: ");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + o);
         System.out.println(oz + " oz = (" + barrels +  " bl * 5376 oz) +"
                           +  " (" + gallons + " gal * 128 oz) +" 
                           + " (" + quarts + " qt * 32 oz) + "
                           + "(" + o + " oz)");
      
      }
   }
}

    //54321 oz = (10 bl * 5376 oz) + (4 gal * 128 oz) + (1 qt * 32 oz) + (17 oz)