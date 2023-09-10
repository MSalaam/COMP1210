import java.util.Comparator;
public class BandwidthComparator implements Comparator<WirelessNetwork>{

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
