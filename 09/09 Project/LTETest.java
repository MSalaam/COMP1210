import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

   /** test class to check class. **/

public class LTETest {


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
   
      LTE lte1 = new LTE("My Phone", 20.00, 30.00, 1000, 2.0);
   
      Assert.assertEquals("monthlyCost test",
                            30.00, lte1.monthlyCost(), .000001);
   
      LTE lte2 = new LTE("My Phone", 20.00, 30.00, 2000, 2.0);
   
      Assert.assertEquals("monthlyCost test", 30.00 
                           + (lte2.dataUsage() - lte2.getDataLimit()) * 4.0 * 2,
                             lte2.monthlyCost(), .000001);
   }
                      
}
