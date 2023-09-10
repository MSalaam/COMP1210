public class MessageCalc
{

   public char calc (int num1, int num2, String message)
   {
      int sum = num1 + num2;
      char result = message.charAt(sum);
   
      return result;
   }
}



      public static void IceCreamConeApp(String[] args) {
   
      IceCreamCone obj = new IceCreamCone();
      
   
     
      Scanner userInput = new Scanner(System.in);
   
      String labelInput;
      double radiusInput;
      double heightInput;
   
      System.out.println("Enter label, radius,"
         + " and height for  an ice cream cone.");
         
      System.out.print("Label: ");
      labelInput = userInput.nextLine();
      
      System.out.print("Radius: ");
      radiusInput = userInput.nextDouble();
      
      System.out.print("Height: ");
      heightInput = userInput.nextDouble();
      
      if (heightInput <= 0) {
         System.out.println("Error: height must be greater than 0");
      }
      
      else if (radiusInput <= 0) {
         System.out.println("Error: radius must be greater than 0");
      }
      
      else {  System.out.println("\nIceCreamCone " + labelInput + " with radius = "
            + radiusInput + " and height = " + heightInput + " units has "); 
      
         System.out.println("\tsurface area = " + surfaceArea + "square units");
         System.out.println("\tVolume = " + volume + "square units");
      
      }
      

      
      
   
   }