import java.io.IOException;
   /**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class WirelessNetworksPart3 {
/**
*main method to print out data.
*@param args to set arguments
*
*/

   public  static void main(String[] args) {
      if (args.length == 0 || args[0] == null || args[0].equals("")) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      } else {
         String fileName = args[0];
         try {
            WirelessNetworkList a = new WirelessNetworkList();
            a.readFile(fileName);
            System.out.println(a.generateReport());
            System.out.println(a.generateReportByName());
            System.out.println(a.generateReportByBandwidth());
            System.out.println(a.generateReportByMonthlyCost());
            System.out.println(a.generateInvalidRecordsReport());
         } catch (IOException e) {
            System.out.println("Attempted to read file: " + fileName 
               + " (No such file or directory)\n" 
               + "Program ending.");
         }
      }
   }   }
