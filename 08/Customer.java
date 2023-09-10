/** 
*program to use imprelemt and overload methods.
*author: Mohamad Salaam
*version: 10/28/19
*
*/

public class Customer {

   private String customerName;
   private String customerLocation;
   private double balance = 0;
   
   /**
   * constructor method to set variables.
   *
   *@param nameIn to set name from input
   *
   */
   
   public Customer(String nameIn) {
   
      customerName = nameIn;
      customerLocation = "";
      balance = 0;
   }
   
  /**
   *method to set location.
   *
   *@param locationIn to set location from input
   *
   */
   
   public void setLocation(String locationIn) {
   
      customerLocation = locationIn;
         
   }
  
       /**
   *overload method to set location.
   *
   *@param city to set location from input
   *@param state to set state location from input
   */ 
   
   public void setLocation(String city, String state) {
   
      customerLocation = city + ", " + state;
         
   }
   
        /**
   *method to return location.
   *
   *@return customerLocation to set location from input
   *
   */
   public String getLocation() {
   
      return customerLocation;
   
   }
        /**
   *method to change balance.
   *
   *@param amount to set change amount 
   *
   */
   
   public void changeBalance(double amount) {
   
      balance = balance + amount;
   
   }
   
        /**
   *method to set balance.
   *
   *@param balanceIn to set location from input
   *@return balance after setting it from input
   */
   
   public double setBalance(double balanceIn) {
   
      balance = balanceIn;
      
      return balance;
   }
   
        /**
   *method to get balance.
   *
   *@return balance after using method above to set it
   *
   */
   
   public double getBalance() {
   
      return balance;
   
   }
   
        /**
   *method toString for output.
   *
   *@return output in the correct format
   *
   */
   
   public String toString() {
   
      String output = customerName 
                 + "\n" + customerLocation
                 + "\n$" + balance;
                 
   
      return output;
   
   }
   
        /**
   *compare method to find greater than, less, or equal.
   *
   *@param obj to set location from input
   *@return 0, 1, -1 if its smaller.
   *
   */
   
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
      
         return 0;
      
      } 
      else if (this.balance < obj.getBalance()) {
      
         return -1;
      
      }
      else {
      
         return 1;
      
      }
   }
   
   

}