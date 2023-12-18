import java.util.Scanner;
/**
* Program to ask for age and gender   
* through input statements and then
* make calculations.
*
* Activity 2
* @author Abby Miller COMP1210-D01
* @version 8-29-21
*/


public class AgeStatistics {
      /**
      * Assigns variables to user input.
      * @param args Command line arguments - not used.
      */

   public static void main(String[] args) {
      //Declare variables
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      //Prompt the user for their name and age
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      System.out.print("Enter your gender (1 for female"
         + " and 0 for male): ");
      gender = userInput.nextInt();
      //Convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      //display heart rate:
      System.out.print("Your max heart rate is ");
      if (gender == 1) { //Caluclate female mmr
         maxHeartRate = (209 - (0.7 * ageInYears));
      }
      else {
         maxHeartRate = (214 - (0.8 * ageInYears));
      }
      System.out.println(maxHeartRate + " beats per minute.");
   }
      
}
