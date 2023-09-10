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
      
      label = labelIn;
      
      if (label == " ") {
      
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
      if (radius >= 0) {
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
                * Math.sqrt(height * height + radius * radius);
      double hA = 2 * Math.PI * radius * radius;
      double area = cA + hA;
      return area;
   }
   
      /**
*@return volume.
*
*/
   public double volume()
   {
      double cV = height * Math.PI * radius * radius / 3;
      double hV = 2 * Math.PI * radius * radius * radius / 3;
      double volume = cV + hV;
      return volume;
   }

   
      /**
*@return output.
*
*/
   public String toString() {
   
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0######");
   
      String output = "IceCreamCone " + label + " with radius = " 
                    + radius + " and height = " + height + " units has: "
                    + "\nsurface area = " + decimalFormat.format(surfaceArea()) 
                    + " square units\n" 
                    + "volume = " + decimalFormat.format(volume()) 
                    + " cubic units";
      return output;
   }
}