import java.util.Scanner;
/**
* Program to ask for double input
* and do calculations with it.
*
* Project 2
* @author Abby Miller COMP1210-D01
* @version 9-02-21
*/
public class TwoVariableExpression {
     /**
      * Assigns variables to user input.
      * @param args Command line arguments - not used.
      */
   public static void main(String[]args) {
      Scanner userInput = new Scanner(System.in);
      System.out.println("result = (4.5x + 12.5) (3y - 9.0) / xy");
      System.out.print("\tx = ");
      double x = userInput.nextDouble();
      System.out.print("\ty = ");
      double y = userInput.nextDouble();
      double result = ((4.5 * x + 12.5) * (3 * y - 9.0)) / (x * y);
      if (x == 0 || y == 0) {
         System.out.println("result is \"undefined\"");
      }
      else {
         System.out.println("result = " + result);
      }
   }
}