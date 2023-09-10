import java.util.ArrayList;
import java.text.DecimalFormat;


public class IceCreamConeList {


   private String listName = "";
   private ArrayList<IceCreamCone> objects = new ArrayList<IceCreamCone>();


   public IceCreamConeList(String listNameIn, ArrayList<IceCreamCone> objectsIn) {
     
      listName = listNameIn;
      objects = objectsIn;
     
   }


   public String getName(){
   
      return listName;
    
   }

   public int numberOfIceCreamCones() {
   
            
      return objects.size();
   
   }

   public double totalSurfaceArea() {
      double totalSurfaceArea = 0;
      for (int i = 0; i < objects.size(); i++) {
         totalSurfaceArea += objects.get(i).surfaceArea();
      }
      return totalSurfaceArea;
   
   }

   public double totalVolume() {
      double totalVolume = 0;
      for (int i = 0; i < objects.size(); i++) {
         totalVolume += objects.get(i).volume();
      }
      return totalVolume;
   
   }

   public double averageSurfaceArea() {
   
      double averageSurfaceArea = totalSurfaceArea() / objects.size();
   
      return averageSurfaceArea;
   
   }

   public double averageVolume() {
   
      double averageVolume = totalVolume() / objects.size();
   
   
      return averageVolume;
   }

   public String toString() {
   
      String output = listName + "";
      return output;
      
   }

   public  String summaryInfo() {
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
   
   
      String summary = listName + objects + df1.format(totalSurfaceArea()) 
               + df1.format(totalVolume()) + df1.format(averageSurfaceArea())
               + df1.format(averageVolume());
               
      return summary;
   }

}
