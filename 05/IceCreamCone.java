import java.text.DecimalFormat;

public class IceCreamCone {
   private String label="";
   private double radius=0;
   private double height=0;

   //Constructor

   public IceCreamCone(String label, double radius, double height) {
      setLabel(label);
      setHeight(height);
      setRadius(radius);
   }

   public String getLabel() {
      return label;
   }

   public boolean setLabel(String label) {
      if(label!=null)
      {
         this.label =label.trim();
         return true;
      }
      else
      {
         return false;
      }
   }

   public double getRadius() {
      return radius;
   }

   public boolean setRadius(double radius) {
      if(radius>0) {
         this.radius = radius;
         return true;
      }
      else
      {
         return false;
      }
   }

   public double getHeight() {
      return height;
   }

   public boolean setHeight(double height) {
      if(height>0) {
         this.height = height;
         return true;
      }
      else
      {
         return false;
      }
   }
   public double surfaceArea()
   {
      double cA = Math.PI*radius*Math.sqrt(height*height+radius*radius);
      double hA = 2*Math.PI*radius*radius;
      double A = cA+hA;
      return A;
   }
   public double volume()
   {
      double cV = height*Math.PI*radius*radius/3;
      double hV = 2*Math.PI*radius*radius*radius/3;
      double V = cV+hV;
      return V;
   }

   DecimalFormat decimalFormat = new DecimalFormat("#,##0.0######");
   
   public String toString() {
      return "IceCreamCone "+label+" with radius = "+radius+" and height = "+height+" units has: "
             +"\nsurface area = "+ decimalFormat.format(surfaceArea())+" square units\n" +
             "volume = "+decimalFormat.format(volume())+" cubic units";
   }
}