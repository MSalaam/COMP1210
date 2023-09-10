import java.util.Comparator;
 /**
*
*Program to calculate costs of different data plans.
*@author: Mohamad Salaam
*@version: 11/9/19
*
*/

public class BandwidthComparator implements Comparator<WirelessNetwork> {

/**
*compare to method.
*@param obj1 to input object
*@param obj2 to input objects
*@return 1, -1, 0 after calculation
*
*/

   public int compare(WirelessNetwork obj1, WirelessNetwork obj2) {
   
      if (obj1.getBandwidth() > obj2.getBandwidth()) {
         return -1;
      }
      else if (obj1.getBandwidth() < obj2.getBandwidth()) {
         return 1; 
      }
      else { 
         return 0;
      }
   
   
   }
   
}
