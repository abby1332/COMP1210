import javax.swing.JOptionPane;
/**
* Driver for division. Uses try catch.
* Activity 11
* @author Abby Miller COMP 1010
* @version 11/16/21
*/
public class DivisionDriver {

   /**
    * This is the main method.
    * @param args no command line arguments
    */
   public static void main(String[] args) {
   
      try {
         String numInput
                  = JOptionPane.showInputDialog("Enter the numerator:");
         String denomInput
                  = JOptionPane.showInputDialog("Enter the denominator");
                  
           //Parse the values to an int
         int num = Integer.parseInt(numInput);
         int denom = Integer.parseInt(denomInput);
            
            //String object to hold division result
         String result = "Integer division: \n"
                            + Division.intDivide(num, denom)
                            + "\n\nFloating point division: \n"
                            + Division.decimalDivide(num, denom);
            //Print result in a dialog box
         JOptionPane.showMessageDialog(null, result, "Result", 
                                    JOptionPane.PLAIN_MESSAGE);
      }
      catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, "Invalid input: enter numerical" 
                                    + " integer values only.",
                                      "Error", JOptionPane.ERROR_MESSAGE);
      }
      catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e, "Error", 
                  JOptionPane.ERROR_MESSAGE);
      }
   }
}