/**
* Child class to Inventory Item. Creates a virutal inventory 
* for electronic items that need to be shipped.
* References Inventory Item's constructor and protected variables.
* Activty 9.
* @author Abby Miller COMP1210-D01
* @version 10-27-21
*/
public class ElectronicsItem extends InventoryItem {
   protected double weight;
   /**
   * Sets the value for Shipping Cost.
   */
   public static final double SHIPPING_COST = 1.5;
   
   /**
   * Constructor.
   * @param nameIn for name.
   * @param priceIn for price.
   * @param weightIn for weight.
   */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) { 
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
   /**
   * Overrides the calculateCost method to take shipping into account.
   * @return returns cost plus shipping cost.
   */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
   
}