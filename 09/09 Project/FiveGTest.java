import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

   /** test class to check class. **/

public class FiveGTest {


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
   
      /** test to check method. **/

   @Test public void monthlyCostTest() {
   
      FiveG fiveg = new FiveG("My Phone", 20.00, 30.00, 1000, 2.0);
   
      Assert.assertEquals("monthlyCost test",
                            30.00, fiveg.monthlyCost(), .000001);
   
      FiveG fiveg2 = new FiveG("My Phone", 20.00, 30.00, 2000, 2.0);
   
      Assert.assertEquals("monthlyCost test", 30.00 
                           + (fiveg2.dataUsage() - fiveg2.getDataLimit()) * 5.0 * 3,
                               fiveg2.monthlyCost(), .000001);
   }
}
