/**
 * 
 * create a class that uses another class.
 *
 * @author Mohamad Salaam
 *
 * @version 9/16/19
 *
 */
public class UserInfo {
 // instance vatiables
 
   private String first;
   private String last;
   private String location;
   private int age;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;
 
 //  constructor
 /**
   * method to store default user info.
   * @param firstIn for user's name
   * @param lastIn for user's name
   */
   public UserInfo(String firstIn, String lastIn) {
   
   
      first = firstIn;
      last = lastIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
      
      
    
   }  
 
 // methods
 
    /**
   *method for wanted output.
   * @return a string
   */
   public String toString() {
   
    
      String output = "Name: " + first + " "
         + last + "\n";
      output +=  "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status  ==  OFFLINE) {
         output  += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
    
   }
   
   /**
   *
   *method for setting the location.
   *
   * @param locationIn for user's location
   */
   
   public void setLocation(String locationIn) { 
      location = locationIn;
   }

      /**
   *
   *method for setting the age.
   * @param ageIn for user's age
   * @return boolean setAge
   *
   */
   public boolean setAge(int ageIn)  { 
      boolean isSet = false;
      if (age > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet; 
   }

      /**
   *
   *method to return age.
   * @return an int for age
   */
   public int getAge() {
      return age;
   }
         /**
   *
   *method to return location.
   * @return a string for location
   */
   public String getLocation() {
      return location;
   }
         /**
   *
   *method to log user off.
   *
   */
   public void logOff() {
      status  = OFFLINE;
   }
   
               /**
   *
   *method to log user on.
   *
   */
   public void logOn()  {
      status = ONLINE;
   }











}
