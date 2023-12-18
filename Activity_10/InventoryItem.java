/**
* Inventory Item creates a parent class with protected variables
* and a constructor that will be referenced by child classes.
* Inventory Item creates a virtual inventory for different products 
* and their costs.
* Activty 9.
* @author Abby Miller COMP1210-D01
* @version 10-27-21
*/
public class InventoryItem {
   //Instance variables
   protected String name;
   protected double price;
   private static double taxRate = 0.0;
   
   /**
   * Constructor.
   * @param nameIn sets name.
   * @param priceIn sets price.
   */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
   * Gets name.
   * @return returns customers name.
   */
   public String getName() {
      return name;
   }
   
   /**
   * Calculates cost.
   * @return Returns the price including tax.
   */
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
   /**
   * Sets the tax rate.
   * @param taxRateIn rate for tax.
   */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
   /**
   * To string method.
   * @return Returns string representation with name and price with tax.
   */
   public String toString() {
      return name + ": $" + calculateCost();
   }
}