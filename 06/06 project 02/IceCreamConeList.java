import java.util.ArrayList;
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

public class IceCreamConeList {


   private String listName = "";
   private ArrayList<IceCreamCone> iList; 

/**
*main constructor to set parameters.
*@param listNameIn to use in later app
*@param iListIn to use later in app
*/

   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone> iListIn)
   {
     
      listName = listNameIn;
      iList = iListIn;
     
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
   
            
      return iList.size();
   
   }
   
/**
  *method to calculate total volume.
  *@return totalSurfaceArea after calculation
  *
  */

   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      int i = 0;
      while (i < iList.size()) {
         totalSurfaceArea += iList.get(i).surfaceArea();
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
      while (i < iList.size()) {
         totalVolume += iList.get(i).volume();
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
   
      double averageSurfaceArea = totalSurfaceArea() / iList.size();
   
      return averageSurfaceArea;
   
   }
   
 /**
   *method to calculate average.
   *@return averageVolume after calculation
   *
   */
   public double averageVolume() {
   
      double averageVolume = totalVolume() / iList.size();
   
   
      return averageVolume;
   }

 /**
   *method to print string output.
   *@return output after all calculations
   *
   */
   public String toString() {
   
      String output = listName + "";
      int i = 0;
      while (i < iList.size()) {
         output += "\n" + iList.get(i) + "\n";
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
      summary += "----- summary for " + getName() + " -----";
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
   
   public ArrayList<IceCreamCone> getList() {
   
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

   public IceCreamConeList readFile(String fileNameIn) 
                      throws FileNotFoundException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<IceCreamCone> myList = new ArrayList<IceCreamCone>();
      String label = "";
      double radius = 0, height = 0;
      
      listName = scanFile.nextLine(); 
      int i = 0;
      while (scanFile.hasNext()) {
         label = (scanFile.nextLine());
         radius = Double.parseDouble(scanFile.next());
         height = Double.parseDouble(scanFile.next());
         IceCreamCone icc = new IceCreamCone(label, radius, height);
         myList.add(icc);      
         i++;     
      }
      IceCreamConeList objects = new IceCreamConeList(listName, myList);
      
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
   
      iList.add(icc);
   
   
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
      int index = -1;
      for (IceCreamCone icc : iList) {
         if (icc.getLabel() == labelIn) {
            index = iList.indexOf(icc);
            break;
         }
      }
      
      if (index >= 0) {
         result = iList.get(index);
         iList.remove(index);
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
