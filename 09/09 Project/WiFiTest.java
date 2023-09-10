import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

      /** WiFi class test to test that method. **/

public class WiFiTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
   
   @Test public void getModemCostTest() {
      WiFi wifi1 = new WiFi("My WiFi", 100, 20.00, 10.00);
      Assert.assertEquals(10.00, wifi1.getModemCost(), .000001);
   }
   
   
   /** setmodemcosttest to set that method. **/
   
   @Test public void setModemCostTest() {
   
      WiFi wifi1 = new WiFi("My WiFi", 100, 20.00, 10.00);
      Assert.assertEquals("setModemCost test",
                         10.00, wifi1.getModemCost(), .000001);
   }
   
   /** monthlycosttest to set that method. **/
   
   @Test public void monthlyCostTest() {
   
      WiFi wifi1 = new WiFi("My WiFi", 100, 20.00, 10.00);
      Assert.assertEquals("monthlyCost test",
                           20.00 + 10.00, wifi1.monthlyCost(), .000001);
   }
   
}
