import java.util.Scanner;
import java.util.ArrayList;
/**
* A driver to support the 
* class temperatures.java.
* Project 5
* @author Abby Miller COMP1210-D01
* @version 9-23-21
*/
public class TemperatureInfo {
  /**
   * Main method uses scanner to assign user input
   * into an array list and assigns the array list
   * to a new temperatures object.
   * @param args - Standard commandline arguments
   */

   public static void main(String[] args) {
   // Instance variables
      Scanner userInput = new Scanner(System.in);
      ArrayList <Integer> tempsList = new ArrayList<Integer>();
      String tempInput = "";
      
      // Create array list
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
       
       // Create new temperatures object
      Temperatures temps = new Temperatures(tempsList);
       
       // Do while loop menu
      char choice = 'E';
      do { 
         System.out.print("Enter choice - "
            + "[L]ow temp, [H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
            case 'P':
               System.out.println(temps);
               break;
            case 'E':
               System.out.println("\tDone");
               break;
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   
   }

}