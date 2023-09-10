import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
      /** 
* write a program to calculate cones volume.
* @author: Moe Salaam
* @version: 10/03/19
*
*/
public class IceCreamConeListApp {

/** 
*main method to print out all the info.
*@param args to have things to print
*@throws FileNotFoundException to create exception if file not found
*
*/


   public static void  main(String[] args) throws FileNotFoundException {
   
      ArrayList<IceCreamCone> objects = new ArrayList<IceCreamCone>();
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter file name: ");
      String fileName = input.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
      String coneListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double radius = scanFile.nextDouble();
         double height = scanFile.nextDouble();
         
         IceCreamCone icc1 = new IceCreamCone(label, radius, height);
         objects.add(icc1);           
      }
      scanFile.close();
      
      IceCreamConeList myList = new IceCreamConeList(coneListName, objects);
   
      System.out.println(myList);
      
      System.out.println(myList.summaryInfo()); 
   
   
   
   
   
   
   
   
   
   
   
   
   }

}