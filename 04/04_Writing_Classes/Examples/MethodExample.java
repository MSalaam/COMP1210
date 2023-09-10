/**
 * Demonstrates the use of a method call with int and 
 * String argments. 
 */
public class MethodExample
{
   /**
    * Prints various examples of string concatenation.
    * @param args - not used
    */
   public static void main(String[] args)
   {
      MessageCalc obj = new MessageCalc();
      int count = 5;
      
      char ch = obj.calc(4, count, "War Eagle!");
      System.out.println("ch = " + ch);
         
      /* Note that a char return value can be assigned to an int. */  
      int i = obj.calc(4, count, "War Eagle!");
      System.out.println("i = " + i);
      
      /* Here's another example of a char assigned to an int. */  
      int j = 'm';  
      System.out.println("j = " + j);  
      
      /* Note that an int cannot be assigned to a char
         without "loss of precision" so a cast is
         required.  */   
      char ch2 = (char) 112;
      System.out.println("ch2 = " + ch2);
   }
}

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
    @Override
    public String toString() {
        return "IceCreamCone "+label+" with radius = "+radius+" and height = "+height+" units has: "
                +"\nsurface area = "+ decimalFormat.format(surfaceArea())+" square units\n" +
                "volume = "+decimalFormat.format(volume())+" cubic units";
    }
}

import java.text.DecimalFormat;

/**
 * 
 * IceCreamCone program that uses 2 classes.
 *
 * @author Mohamad Salaam
 *
 * @version 9/18/19
 *
 */
public class IceCreamCone {
 
   private String label = "";
   private double radius = 0;
   private double height = 0;
   
   String labelIn;
   double radiusIn;
   double heightIn;
   
   double cA;
   double hA;
   double surfaceArea;
   double cV;
   double hV;
   double volume;
   
 
   public IceCreamCone(String labelIn, double radius, double height) {
   
      setLabel(label);
      setRadius(radius);
      setHeight(height);
      
   }
 
   public String getLabel() {
      return label;
   }
   
   public boolean setLabel(String label) {
        if(label!=null) {
            this.label = label.trim();
            return true;
        }
        else {
            return false;
        }
   
   
   
   public double getRadius() {
      return radius;
   }
 
   public void setRadius(double radiusIn) {
      boolean isSet = false;
      if (radius > 0) { 
         radius = radiusIn;
         isSet = true;
      }
   }
 
   public double getHeight() {
      return height;
   }
 
   public void setHeight(double heightIn) {
      boolean isSet = false;
      if (height > 0) {
         height = heightIn;
         isSet = true;
      }
   }
 
   public double surfaceArea() {
      cA = Math.PI * radius 
         * Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
      hA = 2 * Math.PI * Math.pow(radius, 2); 
      surfaceArea = cA + hA;
   
      return surfaceArea;
   }
 
   public double volume() {
      cV = (height * Math.PI * Math.pow(radius, 3)) / 3;
      hV = (2 * Math.PI * Math.pow(radius, 3)) / 3;
      volume = cV + hV;
   
      return volume;
   }
 
   public String toString() {
   
      DecimalFormat df1 = new DecimalFormat("#,##0.0######");
   
      String output = "IceCreamCone " + getLabel() 
         + " with radius = " + getRadius()
         + " and height = " + getHeight() + " units has: \n\tsurface area = " 
         + df1.format(surfaceArea) + "\n\tvolume = " + df1.format(volume()) 
         + "cubic units";
      
      return output;
       
   }
   
   
 
 
 
 
 
}