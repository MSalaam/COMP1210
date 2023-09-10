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
*@param label to set name
*@param radius to set num1
*@param height for inputs
*
*/

   public IceCreamCone(String label, double radius, double height) {
      setLabel(label);
      setHeight(height);
      setRadius(radius);
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
*@param label to set label
*
*/
   public boolean setLabel(String label) {
      if (label != null)
      {
         this.label = label.trim();
         return true;
      }
      else
      {
         return false;
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
   *@param radius to set a number
   *
   */
   

   public boolean setRadius(double radius) {
      if (radius > 0) {
         this.radius = radius;
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
   *@param height to set a number
   *
   */

   public boolean setHeight(double height) {
      if (height > 0) {
         this.height = height;
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