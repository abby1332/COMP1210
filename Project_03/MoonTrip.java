import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
* Recieve a long user input
* and use substrings and formatting
* methods to split it up.
*
* Project 3
* @author Abby Miller COMP1210-D01
* @version 9-10-21
*/


public class MoonTrip {
/**
 * Breaks user input into formatted substrings.
 * @param args Command line arguments - not used.
 */

   public static void main(String[]args) {
   // Initalize Scanner and Data Formatter
      Scanner userInput = new Scanner(System.in);
      DecimalFormat myFormatter = new DecimalFormat("$#,###,##0.00");
      DecimalFormat myFormatter2 = new DecimalFormat("00000");
      
    // Initalize substring variables
      String ticketCode = "";
      String date = "";
      String time = "";
      String price = "";
      String seat = "";
      String ticketDescription = "";
      String formatting = "";
      int prize = 0;
      String strPrize = "";
      
      // Discount
      double doublePrice = 0.0;
      String discount = "";
      double doubleDiscount = 0.0;
      
         // Cost
      double cost = 0.0;
      String costFormatting = "";
      double discountVariable = 0.0;
   
   // Assign variable with inputs
      System.out.print("Enter ticket code: ");
      ticketCode = userInput.nextLine();
      
   // Exit code if improper characters
      if (ticketCode.length() < 27) {
         System.out.println("\n*** Invalid Ticket Code ***"
            + "\nTicket code must have at least 27 characters.");
      }
      else {
      // Assign substrings
         ticketCode = ticketCode.trim();
         date = ticketCode.substring(0, 8);
         time = ticketCode.substring(8, 12);
         seat = ticketCode.substring(23, 26);
         ticketDescription = ticketCode.substring(26, ticketCode.length());
       //Price
         price = ticketCode.substring(12, 19);
         doublePrice = Double.parseDouble(price);
       //Discount
         discount = ticketCode.substring(21, 23);
         doubleDiscount = Double.parseDouble(discount);
         doubleDiscount = doubleDiscount / 100;
         
         
         // Calculate discount and format with decimal format
         formatting = myFormatter.format(doublePrice);
         double discountMath = 1 - doubleDiscount;
         cost = doublePrice * discountMath;
         costFormatting = myFormatter.format(cost);
         
         // Create random number
         Random rand = new Random();
         prize = rand.nextInt(100000); 
         strPrize = myFormatter2.format(prize);
         
      
       //print ticket code
         System.out.println("\nTicket: " + ticketDescription 
            + "   Date: " + date.substring(0, 2) + "/" 
               + date.substring(2, 4) + "/" 
               + date.substring(4, date.length())
            + "   Time: " + time.substring(0, 2) + ":" 
               + time.substring(2, time.length())
            + "\nSeat: " + seat 
            + "   Price: " + formatting
            + "   Discount: " + discount 
            + "%   Cost: " + costFormatting
            + "\nPrize Number: " + strPrize);
                           
      }
   }
}