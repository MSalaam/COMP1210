import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*
*program to sort out  IceCreamCones.
*
*@author: Mohamad Salaam
*
*@version: 10\14\19
*
*/


public class IceCreamConeListMenuApp2 {

/**
*
*Main method to print out menu and to complete wanted tasks.
*
*@param args - not used
*
*@throws FileNotFoundException in case file not found
*/

   public static void main(String[] args) 
                     throws FileNotFoundException {
      String label = "";
      double radius, height = 0;
      String ilistName = "";
      String input = "";
      String file = "";
      Scanner scan = new Scanner(System.in);
      char choice = 'Q';
      IceCreamCone[] myList = new IceCreamCone[20];
      IceCreamConeList2 objects = new IceCreamConeList2(ilistName, myList, numberOfCones);
   
      System.out.println("IceCreamCone List System Menu\n"
                       + "R - Read File and Create IceCreamCone List\n"
                       + "P - Print IceCreamCone List\n"
                       + "S - Print Summary\n"
                       + "A - Add IceCreamCone\n"
                       + "D - Delete IceCreamCone\n"
                       + "F - Find IceCreamCone\n"
                       + "E - Edit IceCreamCone\n"
                       + "Q - Quit");
                       
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scan.nextLine().toUpperCase();
         if (input.length() == 0) {
            continue;
         }
         
         choice = input.charAt(0);
         
         switch (choice) {
            case 'R':
               System.out.print("\tFile Name: ");
               file = scan.nextLine();
            
               objects = objects.readFile(file);
               System.out.println("\tFile read in and "
                          + "IceCreamCone List created\n");
                          
               break;
         
            case 'P':
               System.out.println(objects);
            
               break;
         
            case 'S':
               System.out.println("\n" + objects.summaryInfo() 
                           + "\n");
                           
               break;
         
            case 'A':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
            
               objects.addIceCreamCone(label, radius, height);
               System.out.print("\t*** IceCreamCone added ***\n\n");
            
               break;
         
            case 'D':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               IceCreamCone delete = objects.deleteIceCreamCone(label);
               if (delete != null) {
                  System.out.println("\t\"" 
                                    + delete.getLabel() + "\" deleted\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
            
               break;
         
            case 'F': 
               System.out.print("\tLabel: ");
               label = scan.nextLine();
            
               if (objects.findIceCreamCone(label) != null) {
               
                  System.out.println(objects.findIceCreamCone(label) + "\n");
               
                  break; 
               }
               else {
                  System.out.println("\t\"" +  label + "\" not found\n");
               
                  break;
               }
            
            case  'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tRadius: ");
               radius = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
            
               if (objects.findIceCreamCone(label) != null) {
                  objects.editIceCreamCone(label, radius, height);
                  System.out.print("\t\"" + label + "\" not found\n");
               }
               break; 
         
            case 'Q': 
            
               break;
         
            default: System.out.print("\t*** invalid code ***\n\n");
               break; 
         } 
         
      }
      while (choice != 'Q');
         
         
         
         
   
   }













}