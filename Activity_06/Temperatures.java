import java.util.ArrayList;
/**
* Writing a class that takes parameters
* and runs them thorugh comparisons.
* Activity 6   
* @author Abby Miller COMP1210-D01
* @version 9-27-21
*/
public class Temperatures {
   //Instance variables
   private ArrayList <Integer> temperatures = 
      new ArrayList <Integer>();
   
   /**
   * Constructor.
   * @param temperaturesIn takes an
   * array list containing the temperature variables
   * and assigns them to private varaible temperatures.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
   /**
   * Get lowest temperature.
   * @return low returns lowest temperature or 0 if empty.
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
   /**
   * Get highest temperature.
   * @return high returns highest temperature or 0 if empty.
   */
   
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
   /**
   * Lower minimum.
   * @param lowIn takes integer value.
   * @return lowIn returns lowest.
   * value between lowIn and getLowTemp().
   */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   /**
   * Higher maximum.
   * @param highIn takes integer value.
   * @return highIn returns the highest.
   * value between highIn and getHighTemp.
   */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   /**
   * To String.
   * @return returns String representing values.
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
   }
}