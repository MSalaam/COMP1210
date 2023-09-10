import java.text.DecimalFormat;

   /** 
* write a program to calculate cones volume.
* @author: Moe Salaam
* @version: 10/03/19
*
*/

public class IceCreamCone {
   private String label = "";
   private double radius = 0;
   private double height = 0;
   private static int count = 0;
   //Constructor
/**
*constructor to set param.
*@param labelIn to set name
*@param radiusIn to set num1
*@param heightIn for inputs
*
*/

   public IceCreamCone(String labelIn, double radiusIn, double heightIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
      count++;
   }

/**
*@return label.
*
*/

   public String getLabel() {
      return label;
   }

   /**
*@return true, false.
*@param labelIn to set label
*
*/
   public boolean setLabel(String labelIn) {
      
   
      
      if (label == "") {
         label = labelIn;
      
      
         return false;
      }
      else
      {
         label = label.trim();
         return true;
      }
   }

   /**
*@return radius.
*
*/
   public double getRadius() {
      return radius;
   }
   
   /** 
   *boolean expression to check redius.
   *@return true, false for radius numbers
   *@param radiusIn to set a number
   *
   */
   

   public boolean setRadius(double radiusIn) {
      
      //radius = radiusIn;
   
      if (radiusIn > 0) {
         radius = radiusIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   
   /**
*@return height.
*
*/
   public double getHeight() {
      return height;
   }
   
         /** 
   *boolean expression to check height.
   *@return true, false for height numbers
   *@param heightIn to set a number
   *
   */

   public boolean setHeight(double heightIn) {
      
   
      if (height > 0) {
         height = heightIn;
         return true;
      }
      else
      {
         return false;
      }
   }
   
      /**
*@return area.
*
*/
   public double surfaceArea()
   {
      double cA = Math.PI * radius 
                * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
      double hA = 2 * Math.PI * Math.pow(radius, 2);
      double area = cA + hA;
      return area;
   }
   
      /**
*@return volume.
*
*/
   public double volume()
   {
      double cV = (height * Math.PI * Math.pow(radius, 2)) / 3;
      double hV = (2 * Math.PI * radius * Math.pow(radius, 2)) / 3;
      double volume = cV + hV;
      return volume;
   }

   
      /**
*@return output.
*
*/
   public String toString() {
   
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0######");
   
      String output = "IceCreamCone \"" + label + "\" with radius = " 
                    + radius + " and height = " + height + " units has: "
                    + "\nsurface area = " + decimalFormat.format(surfaceArea()) 
                    + " square units\n" 
                    + "volume = " + decimalFormat.format(volume()) 
                    + " cubic units";
      return output;
   }
   
   /**
   *method to get count of how many static fields there are.
   *
   *@return count
   *
   */
   
   public static int getCount() {
   
      int count = 0;
   
      return count; 
   
   }
   
   /**
   *method to reset count of static fields.
   *
   *@return count after resetting it
   *
   */
   
   public static int resetCount() {
   
      int count = 0;
   
      return count;
   
   }
   
   /**
   *method to accept object parameter and and returns it.
   *
   *@param obj to accept object 
   *@return false or object
   *
   */
   
   
   public boolean equals(Object obj) {
   
      if (!(obj instanceof IceCreamCone)) {
         return false;
      }
      else {
         IceCreamCone icc = (IceCreamCone) obj;
         return (label.equalsIgnoreCase(icc.getLabel())
            && Math.abs(radius - icc.getRadius()) < .000001
            && Math.abs(height - icc.getHeight()) < .000001);
      }
      
   }
   
   /**
   *method need to have in order for equals() to work.
   *
   *@return zero because its the only variable there
   *
   */
   
   public int hashCode() {
   
      return 0;
   
   }
      
   
}