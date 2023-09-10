public abstract class WirelessNetwork {

   protected String name;
   protected double bandwidth;
   protected double fixedCost;

   protected static int objCount = 0;


   public WirelessNetwork(String nameIn, double bandwidthIn, double fixedCostIn) {
   
      name = nameIn;
      bandwidth = bandwidthIn;
      fixedCost = fixedCostIn;
      objCount++;
   
   }
   
   public String getName() {
   
      return name;
   }
   
   public void setName(String nameIn) {
   
      name = nameIn;
   }
   
   public double getBandwidth() {
   
      return bandwidth;
   }
   
   public void setBandwidth(double bandwidthIn) {
   
      bandwidth = bandwidthIn;
   }
   
   public void setMonthlyFixedCost(double fixedCostIn) {
   
      fixedCost = fixedCostIn;
   }
   
   public double getMonthlyFixedCost() {
   
      return fixedCost;
   }
   
   public double getCount() {
   
      return objCount;
   }
   
   public void resetCount() {
   
      objCount = 0;
   }
   
   public String toString() {
   
      String output = name + " (" + this.getClass() +") Cost: "
         + monthlyCost() +"\nBandwidth: " + bandwidth + " Mbps";
      return output;
   }
   
   public abstract double monthlyCost(); 
   
}