import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

      /** 
* write a program to calculate cones volume.
* @author: Moe Salaam
* @version: 10/03/19
*
*/

public class IceCreamConeList2 {


   private String listName = "";
   private IceCreamCone[] iList; 
   private int numberOfCones = 0;

/**
*main constructor to set parameters.
*@param listNameIn to use in later app
*@param iListIn to use later in app
*@param numberOfConesIn to use later in app
*/

   public IceCreamConeList2(String listNameIn,
                            IceCreamCone[] iListIn, int numberOfConesIn)
   {
     
      listName = listNameIn;
      iList = iListIn;
      numberOfCones = numberOfConesIn;
   }
  

 /**
   *accessor to use in driver.
   *@return listName that will be inputed 
   *
   */

   public String getName() {
   
      return listName;
    
   }

/** method to find number of cones in arrayList.
*@return objects.size() for number of objects
*
*/

   public int numberOfIceCreamCones() {
   
            
      return numberOfCones;
   
   }
   
/**
  *method to calculate total volume.
  *@return totalSurfaceArea after calculation
  *
  */

   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      int i = 0;
      while (i < numberOfCones) {
         totalSurfaceArea += iList[i].surfaceArea();
         i++;
      }
      return totalSurfaceArea;
   
   }
  
  /**
  *method to calculate total volume.
  *@return totalVolume after calculation
  *
  */
  

   public double totalVolume() {
      double totalVolume = 0;
      int i = 0;
      while (i < numberOfCones) {
         totalVolume += iList[i].volume();
         i++;
      }
      return totalVolume;
   
   }
   
 /**
   *method to calculate average.
   *@return averageSurfaceArea after calculation
   *
   */

   public double averageSurfaceArea() {
   
      if (numberOfCones != 0) {
      
         double averageSurfaceArea =
                totalSurfaceArea() / numberOfIceCreamCones();
      
         return averageSurfaceArea;
      } else {
         return 0.0;
      }
   }
   
 /**
   *method to calculate average.
   *@return averageVolume after calculation
   *
   */
   public double averageVolume() {
   
      if (numberOfCones != 0) {
      
         double averageVolume = totalVolume() / numberOfIceCreamCones();
      
      
         return averageVolume;
      } 
      else {
         return 0.0;
      }
   }

 /**
   *method to print string output.
   *@return output after all calculations
   *
   */
   public String toString() {
   
      String output = listName + "\n";
      int i = 0;
      while (i < numberOfCones) {
         output += "\n" + iList[i] + "\n";
         i++;
      }
      return output;
      
   }
   
   /**
   *method to print string summary.
   *@return summary after all calculations
   *
   */

   public String summaryInfo() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
   
      String summary = "";
      summary += "----- Summary for " + getName() + " -----";
      summary += "\nNumber of IceCreamCone Objects: " + numberOfIceCreamCones();
      summary += "\nTotal Surface Area: " + df1.format(totalSurfaceArea());
      summary += "\nTotal Volume: " + df1.format(totalVolume());
      summary += "\nAverage Surface Area: " + df1.format(averageSurfaceArea());
      summary += "\nAverage Volume: " + df1.format(averageVolume());
         
               
      return summary;
   }
   
   /**
   *method  to retrieve list of icecreamcones.
   *
   *@return iList.toString 
   *
   */
   
   public IceCreamCone[] getList() {
   
      return iList;
      
   }

/**
*method to read file in.
*
*@param fileNameIn for file name input
*
*@return objects
*@throws FileNotFoundException in case file not found
*
*/

   public IceCreamConeList2 readFile(String fileNameIn) 
                      throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      IceCreamCone[] myList1 = new IceCreamCone[100];
      
      String listName1 = scanFile.nextLine(); 
      int i = 0;
      while (scanFile.hasNext()) {
         String label = (scanFile.nextLine());
         double radius = Double.parseDouble(scanFile.nextLine());
         double height = Double.parseDouble(scanFile.nextLine());
         IceCreamCone icc = new IceCreamCone(label, radius, height);
         myList1[i] = icc;
         //myList.add(icc);      
         i++;     
      }
      IceCreamConeList2 objects =
         new IceCreamConeList2(listName1, myList1, i);
      
      return objects;
   }

/** 
* mathod to add an IceCreamCone.
* 
*@param labelIn for input label
*@param radiusIn for input radius
*@param heightIn for input height
*
*/

   public void addIceCreamCone(String labelIn, double radiusIn, double heightIn)
   {
   
      IceCreamCone icc = new IceCreamCone(labelIn, radiusIn, heightIn);
   
      iList[numberOfCones] = icc;
      numberOfCones++;
   
   
   }

/**
*method to find an icecreamcone.
*
*@param label to have a label
*
*@return result

*/

   public IceCreamCone findIceCreamCone(String label) {
      IceCreamCone result = null;
   
      for (IceCreamCone i : iList) {
         if (i.getLabel().equalsIgnoreCase(label)) {
            result = i;
            break;
         }
      }
      return result;
   
   
   }

/**
* method to delete an icecreamcone.
*
*@param labelIn to delete input label
*
*@return result
*
*/

   public IceCreamCone deleteIceCreamCone(String labelIn) {
   
      IceCreamCone result = null;
      for (int i = 0; i < numberOfCones; i++) {
         if (iList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = iList[i];
            for (int j = i; j < numberOfCones - 1; j++) {
               iList [j] = iList[j + 1];
            }
            iList[numberOfCones - 1] = null;
            numberOfCones = numberOfCones - 1;
         }
      }
      return result;
   
   }
   
   /**
   * method to edit an icecreamcone.
   *
   *@param label to edit label
   *@param radius to edit radius
   *@param height to edit height
   *
   *@return true, false for if statement
   *
   */
   
   public boolean editIceCreamCone(String label, double radius, double height) {
   
      IceCreamCone edit = findIceCreamCone(label);
   
      if (edit != null) {
         edit.setRadius(radius);
         edit.setHeight(height);
      
         return true;
      }
      else {
         return false;
      }
   
   }

 
}
