import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
   
/**
 * 
 * Create a program to decode  a ticket number and give details.
 *
 * @author Mohamad Salaam
 *
 * @version 9/11/19
 *
 */
 
public class TicketDecoder {
  /**
    *
    * creating public class to have string statements in it.
    *
    * @param args Command line arguments
    *
    */ 
    
   public static void main(String[] args) {
      
      
      Scanner userInput = new Scanner(System.in);
      String ticket = "";
      Random random = new Random();
      System.out.print("Enter your ticket code: ");
      ticket = userInput.nextLine();
      int length = ticket.length();
   
   
   
      
      if (length <= 26) {
         System.out.println("\nInvalid Ticket Code.");
         System.out.println("Ticket code must have at least 26 characters.");
      }
      else {
         String price = ticket.substring(0, 3); 
         double priceNum = Double.parseDouble(price); 
         DecimalFormat priceFMT = new DecimalFormat("$#,##0.00"); 
      
         String discount = ticket.substring(5, 7); 
      
         int priceDC = Integer.parseInt(price); 
         int discount1 = Integer.parseInt(discount);
         double cost = (priceDC - (discount1 * 0.01 * priceDC)); 
         DecimalFormat costFMT = new DecimalFormat("$##.00");
          
          
         String hour = ticket.substring(7, 9); 
         String minute = ticket.substring(9, 11); 
      
      
         
         String month = ticket.substring(11, 13); 
         String day = ticket.substring(13, 15); 
         String year = ticket.substring(15, 19); 
      
         
         
         
         String section = ticket.substring(19, 21); 
         double sectionNum = Double.parseDouble(section); 
         
         String row = ticket.substring(21, 23); 
         double rowNum = Double.parseDouble(row); 
         
         String seat = ticket.substring(23, 25); 
         
         String game = ticket.substring(25, 45); 
         
         int random1 = 0;
         random1 = random.nextInt(9999999);
         
         System.out.println("\nGame: " + game + "   Date: "
            + month + "/" + day + "/" + year
            + "   Time: " + hour + ":" + minute);
         System.out.print("Section: " + section); 
         System.out.print("   Row: " + row); 
         System.out.println("   Seat: " + seat); 
         System.out.print("Price: " + priceFMT.format(priceNum)); 
         System.out.print("   Discount: " + discount + "%"); 
         System.out.println("   Cost: " + costFMT.format(cost)); 
         System.out.println("Prize Number: " + random1); 
      
      
      
      
      
      }
      
      
    
    
    
   }
}
