import java.util.Scanner;
/**
* Program to convert seconds into
* days, hours, and minutes using 
* a scanner for user input.
*
* project 2
* @author Abby Miller COMP1210-D01
* @version 9-02-21
*/

public class TimeInSeconds {
     /**
      * Turns seconds into days, hours and minutes.
      * @param args Command line arguments - not used.
      */
   public static void main(String[]args) {
   //Declaring variables
      Scanner userInput = new Scanner(System.in);
      int rawTime = 0;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
      System.out.print("Enter the raw time in seconds: ");
      rawTime = userInput.nextInt();
      //Solving math problem
      seconds = rawTime;
      days = seconds / 86400;
      seconds = seconds % 86400;
      hours = seconds / 3600;
      seconds = seconds % 3600;
      minutes = seconds / 60;
      seconds = seconds % 60;
      //Printing results
      if (rawTime < 0) {
         System.out.println("*** Time must be non-negative. ***");
      }
      else {
         System.out.println("");
         System.out.println("Time by combined days, hours, minutes, "
            + "seconds:");
         System.out.println("\tdays: " + days + "\n\thours: " + hours 
            + "\n\tminutes: " + minutes + "\n\tseconds: " + seconds);
         System.out.println("");
         System.out.println(rawTime + " seconds = " + days 
            + " days, " + hours + " hours, " + minutes + " minutes, " + seconds 
            + " seconds\n");
      
      }
   
   }
}