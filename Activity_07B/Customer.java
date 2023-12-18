/**
* Class Customer creates several methods and then
* practices interface by creating a comparison.
* Activity 7B
* @author Abby Miller COMP1210-D01
* @version 10-18-21
*/
public class Customer implements Comparable<Customer> {
   //Instance variable
   private String name;
   private String location;
   private double balance;
   
   /**
   * Constructor for customer.
   * @param nameIn takes a String variable for the name
   * of the object.
   */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }
   
   /**
   * Sets location variable.
   * @param locationIn takes a String for new location.
   */
   public void setLocation(String locationIn) { 
      location = locationIn;
   }
   /**
   * Overload for setLocation. Takes two string variables and formats them.
   * @param city takes the String value for city.
   * @param state takes the String value for state.
   */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }
   
   /**
   * Change balance adds an input to the instance variable balance.
   * @param amount is the amount to add to the balance.
   */
   public void changeBalance(double amount) { //add amount to balance
      balance = balance + amount;
   }
   
   /**
   * Get location returns current value of location.
   * @return location returns variable for location.
   */
   public String getLocation() {
      return location;
   }
   
   /**
   * Get balance returns current value of balance.
   * @return balance returns variable for balance.
   */
   public double getBalance() { 
      return balance;
   }
   
   /**
   * toString formats information in a String.
   * @return output returns formatted string.
   */
   public String toString() {
      String output = name + "\n" + location + "\n$" + balance;
      return output;
   }
   
   /**
   * compareTo creates a comparison interface for the object Customer
   * based on balance.
   * @param obj takes a customer object to compare.
   * @return 0 if both objects are equal, -1 if this balance is less 
   * than object balance, and 1 if this balance is greater than object balance.
   */
   public int compareTo(Customer obj) {
      
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0; //Consider them equal and return 0
      }
      else if (this.balance < obj.getBalance()) {
         return -1; //Balance is smaller than object balance
      }
      else {
         return 1; //Object balance is smaller than balance
      }
   }
}