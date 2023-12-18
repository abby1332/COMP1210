/**
* Driver for division. Uses try catch.
* Activity 11
* @author Abby Miller COMP 1010
* @version 11/16/21
*/
public class Division {
    
    /**
    * Divides 2 numbers as ints.
    * @param numerator is the numerator.
    * @param denominator is the denominator.
    * @return returns numerator divided by denominator as an int.
    */
   public static int intDivide(int numerator, int denominator) {
      try {
         return numerator / denominator;
      }
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
   /**
    * Divides 2 numbers as doubles.
    * @param numerator is the numerator.
    * @param denominator is the denominator.
    * @return returns numerator divided by denominator as a double.
    * @throws IllegalArgumentException is a thing.
    */
   public static float decimalDivide(int numerator, int denominator) {
      if (denominator == 0) {
         throw new IllegalArgumentException("The denominator cannot be zero.");
      }
      float num = numerator;
      float denom = denominator;
      return num / denom;
   }
}