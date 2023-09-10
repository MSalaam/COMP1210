import javax.swing.JOptionPane;
/**
*Driver class for division.
*author: Mohamad Salaam.
*version: 11/18/19
*
*/

public class DivisionDriver {

/**
*main method for output and try and catch and exceptions.
*@param args to hold arguments in method
*
*/

   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denomInput = JOptionPane.showInputDialog("Enter the denominator:");
   
      try {
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
      
         String result = "Integer division: \n"
                    + Division.intDivide(num, denom)
                    + "\n\nFloating point division: \n"
                    + Division.decimalDivide(num, denom);
                    
         JOptionPane.showMessageDialog(null,
                                    result, "result",
                                     JOptionPane.PLAIN_MESSAGE);
      
      }
      catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null,
                                 "Invalid input: enter numerical integer values"
                                 + " only,",
                                  "Error",
                                   JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null,
                                    e, "Error",
                                     JOptionPane.ERROR_MESSAGE);
      }
   
   }
   
}
