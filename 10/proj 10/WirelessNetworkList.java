import java.util.Arrays;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.io.File;
/**
*WirelessNetworkList class 
*@author: Mohamad Salaam
*@version: 11/22/19
*
*/

public class WirelessNetworkList {

   private WirelessNetwork[] obj;
   private String[] invalids;

   public WirelessNetworkList() {
      obj = new WirelessNetwork[0];
      invalids = new String[0];
   
   }
   
   public WirelessNetwork[] getWirelessNetworksArray() {
   
      return obj;
   }
  
   public String[] getInvalidRecordsNetwork() {
   
      return invalids;
   }
   
   public void addWirelessNetwork(WirelessNetwork objIn) {
   
      obj = Arrays.copyOf(obj, obj.length + 1);
      obj[obj.length - 1] = objIn;
   }
   
   public void addInvalidRecord(String invalidsIn) {
   
      invalids = Arrays.copyOf(invalids, invalids.length + 1);
      invalids[invalids.length - 1] = invalidsIn;
   }
   
   public void readFile(String fileName)
                        throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(fileName));
      WirelessNetwork[] obj;
      String[] invalids;
      char type;
      String typeW;
      while (scanFile.hasNext()) {
         String input1 = scanFile.nextLine();
         try {
            Scanner input = new Scanner(input1);
            input.useDelimiter(",");
            typeW = input.next();
            type = typeW.toUpperCase().charAt(0);
            String nameIn = input.nextLine();
            double bandwidthIn = Double.parseDouble(input.next());
            double monthlyFixedCostIn = Double.parseDouble(input.next());
            double timeIn, dataLimitIn;
            WirelessNetwork w;
         
            switch(type) {
               case 'W':
                  /*
                  String nameIn = input.nextLine();
                  double bandwidthIn = Double.parseDouble(input.next());
                  double monthlyFixedCostIn = Double.parseDouble(input.next());*/
                  double modemCostIn = 
                        Double.parseDouble(input.next());
                  w = new WiFi(nameIn, bandwidthIn,
                                 monthlyFixedCostIn, modemCostIn);
                  addWirelessNetwork(w);
                  break;
               
               case 'C':
                  timeIn = 
                     Double.parseDouble(input.next());
                  dataLimitIn = 
                     Double.parseDouble(input.next());
                  w = new Cellular(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn, dataLimitIn);
                  addWirelessNetwork(w);
                  break;
               
               
               case 'L': 
                  timeIn = 
                     Double.parseDouble(input.next());
                  dataLimitIn = 
                     Double.parseDouble(input.next());
                  w = new LTE(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn, dataLimitIn);
                  addWirelessNetwork(w);
                  break;
               
               case 'F': 
                  timeIn = 
                     Double.parseDouble(input.next());
                  dataLimitIn = 
                     Double.parseDouble(input.next());
                  w = new FiveG(nameIn, bandwidthIn, monthlyFixedCostIn, timeIn, dataLimitIn);
                  addWirelessNetwork(w);
                  break;
               
               default:
                  //invalids(w) = input;
                  //break;
                  throw new InvalidCategoryException(typeW);
               
            }
         }
         catch (InvalidCategoryException e) {
            String result = "*** " + e + " in:\n" + getInvalidRecordsNetwork();     
         }
         catch (NumberFormatException e) {
            String result = "*** " + e + " in:\n" + getInvalidRecordsNetwork();
         }  
         catch (NoSuchElementException e) {
            String result = "*** " + e +  "in:\n" + getInvalidRecordsNetwork();
         }
      }
      scanFile.close();
   }
   
   public String generateReport(){
   
      String result  = "--------------------------------\n"
                     + "Monthly Wireless Network Report\n"
                     + "--------------------------------\n";
      for (int i = 0; i < obj.length; i++) {
         result +=  obj[i].toString() + "\n";
      }
    
      return result;
   }
  
   public String generateReportByName() {
   
      //WirelessNetwork[] objCopy = Arrays.copyOf(obj);
      Arrays.sort(getWirelessNetworksArray());
   
      String result  = "--------------------------------\n"
                     + "Monthly Wireless Network Report (by Name)\n"
                     + "--------------------------------\n";
      for (int i = 0; i < obj.length; i++) {
         result +=  obj[i].toString() + "\n";
      }
    
      return result;
   }
  
   public String generateReportByBandwidth() {
   
      //WirelessNetwork[] objCopy = Arrays.copyOf(obj);
      Arrays.sort(obj, new BandwidthComparator());
   
      String result  = "--------------------------------\n"
                     + "Monthly Wireless Network Report (by Bandwidth)\n"
                     + "--------------------------------\n";
      for (int i = 0; i < obj.length; i++) {
         result +=  obj[i].toString() + "\n";
      }
    
      return result;
   }
   
   public String generateReportByMonthlyCost() {
   
      //WirelessNetwork[] objCopy = Arrays.copyOf(obj);
      Arrays.sort(obj, new MonthlyCostComparator());
   
      String result  = "--------------------------------\n"
                     + "Monthly Wireless Network Report (by Monthly Cost)\n"
                     + "--------------------------------\n";
      for (int i = 0; i < obj.length; i++) {
         result +=  obj[i].toString() + "\n";
      }
    
      return result;
   }
   
   public String generateInvalidRecordsReport() {
   
      //WirelessNetwork[] invalidsCopy = Arrays.copyOf(invalids);
      Arrays.sort(getInvalidRecordsNetwork());
   
      String result  = "--------------------------------\n"
                     + "Invalid Records Report\n"
                     + "--------------------------------\n";
      for (int i = 0; i < invalids.length; i++) {
         result +=  invalids[i].toString() + "\n";
      }
    
      return result; 
   }
    
  
}