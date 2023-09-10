import java.util.Scanner;
/**
* create a program  that displays someone's name,  age, and gender
* along  with calculations for age in minutes and centuries.
*
* @author Mohamad Salaam
*
* @version 9/04/19
*
*/

public class AgeStatistics 
{
  /**
  *
  *creating public class to have string statements in it.
  *
  *@param args Command line arguments
  *
  */  

   public static void main(String[] args)
   {
      
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      // promt user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // promt user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // prompt user for their gender
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt(); 
      
      // convert age 
      System.out.println("\t Your age in minutes is "
                        + ageInYears * 525600 + " minutes.");
                        
      System.out.println("\t Your age in centuries is "
                        + (double) ageInYears / 100  + " centuries.");
                        
     // display max heart rate
      System.out.print("\t Your max heart rate is ");
      if (gender == 1) { // calculate female MHR
         maxHeartRate = 209 - (0.7 * ageInYears);
         System.out.println(maxHeartRate + " beats per minute.");
      } 
      else { //calculate male MHR
         maxHeartRate = 214 - (0.8 * ageInYears);
         System.out.println(maxHeartRate + " beats per minute.");
      
      } 
                        
                        
      
      
      
      
      
      
   }
}