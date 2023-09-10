import java.util.Scanner;
import java.util.ArrayList;
  /**
*create a program using for loops and terneries.
*@author : Mohamad Salaam
*version : 10/7/19
*
*/ 
public class TemperatureInfo {

   
   /** 
   *main method to print out array list.
   *@param args to have print method
   *
   */
   
   public static void main(String[] args) {
   
      Scanner userIn = new Scanner(System.in);
      String tempInput = "";
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userIn.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while  (!tempInput.equals(""));
   
      Temperatures temps = new Temperatures(tempsList);
   
      char choice = 'E';
      do {
         System.out.print("Enter choice -"
            + " [L]ow temp, [H]igh temp, [P]rint, [E]nd: ");
         choice = userIn.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L': 
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H': 
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P': 
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default: System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
      
   
   
   
   
   
   
   
   
   
   }
}