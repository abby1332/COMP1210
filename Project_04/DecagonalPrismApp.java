import java.util.Scanner;
   /**
* DecagonalPrismApp is a class
* for practicing using DecagonalPrism
* in a seperate file.
*
* Project 4
* @author Abby Miller COMP1210-D01
* @version 9-16-21
*/
public class DecagonalPrismApp {

     /**
      * Get user input and use it as parameters
      * for the DecagonalPrism class.
      * @param args Command line arguments - not used.
      */
   public static void main(String[] args) {
   
   
   //initalize variables.
      Scanner userInput = new Scanner(System.in);
      String rawLabel = " ";
      double rawEdge = 0.0;
      double rawHeight = 0.0;
      
      // Get user inputs.
      System.out.println("Enter label, edge," 
         + " and height for a decagonal prism.");
      System.out.print("\tlabel: ");
      rawLabel = userInput.nextLine(); 
      System.out.print("\tedge: ");
      rawEdge = userInput.nextDouble(); 
      
      // Determine wether or not it's negative.
      if (rawEdge < 0) {
         System.out.println("Error: edge must be non-negative.");
      }
      else {
         System.out.print("\theight: ");
         rawHeight = userInput.nextDouble(); 
         if (rawHeight < 0) {
            System.out.println("Error: height must be non-negative.");
         }
         else {
         //Use DecagonalPrism class.
            DecagonalPrism result = new DecagonalPrism(rawLabel, 
               rawEdge, rawHeight);
            
            
            System.out.println(result);
            
         }
      }
   }

}