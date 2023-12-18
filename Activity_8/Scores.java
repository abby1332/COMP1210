/**
* Practice using Arrays by creating a class Scores
* that takes an inputted Array and finds the even
* values, the odd values, and the average.
* Activity 8
* @author Abby Miller COMP1210-D01
* @version 10-26-21
*/
public class Scores {
   //Instance variables
   private int[] numbers;
   
   /**
   * Scores constructor.
   * @param numbersIn takes an array of integers and
   * sets it equal to the private arary numbers.
   */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
   /**
   * findEvens finds the even number in the private array numbers.
   * First, it finds how many even numbers there are. Then, it uses
   * a for loop to set each value of a temporary array to an even number
   * in numbers.
   * @return evens returns an array with every even number.
   */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      int [] evens = new int[numberEvens];
     
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }
   
   /**
   * findOdds finds the odd numbers in the private array numbers.
   * First, it finds how many odd numbers there are. Then, it uses
   * a for loop to set each value of a temporary array to an odd number
   * in numbers.
   * @return odds returns an array with every odd number.
   */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
      int [] odds = new int[numberOdds];
     
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }
   
   /**
   * Calculate average adds each number of the array numbers together
   * and then divides it by the length of numbers.
   * @return result returns the double value of the average.
   */
   public double calculateAverage() {
      double result = 0.0;
      if (numbers.length != 0) {
         int sum = 0;
         for (int num : numbers) {
            sum += num;
         }
         result = (double) sum / numbers.length;
      } 
      return result;
   }
   
   /**
   * toString prints out each element of numbers using a for loop.
   * @return result returns a string with each element seperated by a tab.
   */
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
      
   }
   
   /**
   * toString prints out each element of numbers in reverse using a for loop.
   * @return result returns a string with each element seperated by a tab.
   */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      } 
      return result;
   }
   
}