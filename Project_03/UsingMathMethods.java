import java.util.Scanner;
import java.text.DecimalFormat;
/**
* Solve for the result of an expression given
* the value x as a double which is read in 
* from the keyboard. Write the expression
* using the pow(), sqrt(), and abs() methods 
* of the Math class to perform the calculation.
* Then, print out the result of the expression
* specifically the numbers to the left and
* right of the decimal.
*
* Project 3
* @author Abby Miller COMP1210-D01
* @version 9-10-21
*/

public class UsingMathMethods {
     /**
      * Uses math methods for equations. 
      * @param args Command line arguments - not used.
      */

   public static void main(String[]args) {
   // Initalize variables
      double x = 0.0;
      double result = 0.0;
      int decimalSpot = 0;
      String toRight = "";
      String toLeft = "";
      int lengthString = 0;
      String strWholeNumber = "";
      String formatting = "";
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble(); 
      // Math equation
      result = (8 * Math.pow(x, 4) + Math.sqrt(Math.abs(4 * Math.pow(x, 3)
         + 4 * Math.pow(x, 2) + 4 * x + 4))) / (4 + Math.abs(x));
      // Formatting
      formatting = Double.toString(result);
      lengthString = formatting.length();
      decimalSpot = formatting.indexOf(".");
      toRight = (formatting.substring((decimalSpot + 1), lengthString));
      toLeft = (formatting.substring(0, decimalSpot));
      
      // Printing
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: " 
         + toLeft.length());
      System.out.println("# of characters to right of decimal point: " 
         + toRight.length());
      DecimalFormat myFormatter = new DecimalFormat("#,##0.0##");
      formatting = myFormatter.format(result);
      System.out.println("Formatted Result: " + formatting);
      
      
   }
}