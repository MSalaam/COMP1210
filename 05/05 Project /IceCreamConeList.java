import java.util.ArrayList;
import java.text.DecimalFormat;
      /** 
* write a program to calculate cones volume.
* @author: Moe Salaam
* @version: 10/03/19
*
*/

public class IceCreamConeList {


   private String listName = "";
   private ArrayList<IceCreamCone> objects = new ArrayList<IceCreamCone>();

/**
*main constructor to set parameters.
*@param listNameIn to use in later app
*@param objectsIn to use later in app
*/

   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone> objectsIn)
   {
     
      listName = listNameIn;
      objects = objectsIn;
     
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
   
            
      return objects.size();
   
   }
   
/**
  *method to calculate total volume.
  *@return totalSurfaceArea after calculation
  *
  */

   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      for (int i = 0; i < objects.size(); i++) {
         totalSurfaceArea += objects.get(i).surfaceArea();
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
      for (int i = 0; i < objects.size(); i++) {
         totalVolume += objects.get(i).volume();
      }
      return totalVolume;
   
   }
   
 /**
   *method to calculate average.
   *@return averageSurfaceArea after calculation
   *
   */

   public double averageSurfaceArea() {
   
      double averageSurfaceArea = totalSurfaceArea() / objects.size();
   
      return averageSurfaceArea;
   
   }
   
 /**
   *method to calculate average.
   *@return averageVolume after calculation
   *
   */
   public double averageVolume() {
   
      double averageVolume = totalVolume() / objects.size();
   
   
      return averageVolume;
   }

 /**
   *method to print string output.
   *@return output after all calculations
   *
   */
   public String toString() {
   
      String output = listName + "";
      return output;
      
   }
   
   /**
   *method to print string summary.
   *@return summary after all calculations
   *
   */

   public  String summaryInfo() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
   
   
      String summary = listName + objects + df1.format(totalSurfaceArea()) 
               + df1.format(totalVolume()) + df1.format(averageSurfaceArea())
               + df1.format(averageVolume());
               
      return summary;
   }

}
