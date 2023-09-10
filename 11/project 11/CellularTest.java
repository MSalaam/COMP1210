import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** test class to check class. **/
public class CellularTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
   
      /** test method to check method. **/

   @Test public void getTest() {
   
      Cellular cell1 = new Cellular("My Cell", 20.00, 50.00, 1000, 1.0);
   
      Assert.assertEquals("My Cell", cell1.getName());
      Assert.assertEquals("getBandwidth test",
                            20.00, cell1.getBandwidth(), .000001);
      Assert.assertEquals("getMonthlyFixedCost",
                            50.00, cell1.monthlyCost(), .000001);
      Assert.assertEquals("getTime test",
                            1000, cell1.getTime(), .000001);
      Assert.assertEquals("getDataLimit test",
                            1.0, cell1.getDataLimit(), .000001);
      
   }
   
      /** test to check method. **/

   @Test public void setTest() {
   
      Cellular cell1 = new Cellular("My Cell", 20.00, 50.00, 1000, 1.0);
      
      cell1.setName("My Cell");
      Assert.assertEquals("setName test", "My Cell",
                            cell1.getName());
      cell1.setBandwidth(20.00);
      Assert.assertEquals("setBandwidth test",
                            20.00, cell1.getBandwidth(), .000001);
      cell1.setMonthlyFixedCost(50.00);
      Assert.assertEquals("setMonthlyFixedCost test",
                            50.00, cell1.getMonthlyFixedCost(), .000001);
      cell1.setTime(1000);
      Assert.assertEquals("setTime test", 1000, cell1.getTime(), .000001);
      cell1.setDataLimit(1.0);
      Assert.assertEquals("SetDataLimit test",
                            1.0, cell1.getDataLimit(), .000001);
     
   }
   
      /** test to check method. **/
   
   @Test public void dataUsageTest() {
   
      Cellular cell1 = new Cellular("My Cell", 20.00, 50.00, 1000, 1.0);
      
      Assert.assertEquals("dataUsage test",
                            (20.00 / 8000) * 1000, cell1.dataUsage(), .000001);
   }
   
   
      /** test to check method. **/

   @Test public void monthlyCostTest() {
   
      Cellular cell1 = new Cellular("My Cell",
                                     20.00, 50.00, 1000, 1.0);
   
      Assert.assertEquals("monthlyCostTest",
                            50.00, cell1.monthlyCost(), .000001);
   
      Cellular cell2 = new Cellular("My Cell",
                                     20.00, 50.00, 2000, 1.0);
   
      Assert.assertEquals("monthlyCost test",
                         (50.00 + ((20.00 / 8000) * 2000) - 1.0),
                            cell2.monthlyCost(), .000001);
                       
   }
   
      /** test to check method. **/

   
   @Test public void toStringTest() {
   
      Cellular cell1 = new Cellular("My Cell",
                                     20.00, 50.00, 1000, 1.0);
      
      Assert.assertEquals("toString test",
                            true, cell1.toString().contains("Bandwidth"));
   }
      
}
