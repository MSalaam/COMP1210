import org.junit.Assert;
//import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;


public class WirelessNetworksPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   @Test public void mainTest() throws IOException, InvalidCategoryException {
   
   
      String[] args = new String[1];
      args[0] = "wireless_network_data2.csv";
      WirelessNetworksPart3.main(args);
      
      String[] args2 = new String[0];
      WirelessNetworksPart3.main(args2);
      WirelessNetworkList wList = new WirelessNetworkList();
      
      wList.readFile("wireless_network_data2.csv");
   
      Assert.assertTrue("main test",
         wList.generateReport().contains("Network Report"));
      
   }


   /** A test that always fails. 
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }
   */
   
}
