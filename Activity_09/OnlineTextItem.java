/**
* Child class to Inventory Item. Creates a virutal inventory 
* for online texts and returns cost without tax.
* References Inventory Item's constructor and protected variables.
* Activty 9.
* @author Abby Miller COMP1210-D01
* @version 10-27-21
*/
public abstract class OnlineTextItem extends InventoryItem {
   /**
   * Constructor that calls constructor of parent class.
   * @param nameIn sets name.
   * @param priceIn sets price.
   */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
   /**
   * Override caluclateCost because these items aren't taxed.
   * @return price without tax.
   */
   public double cacluateCost() {
      return price;
   }
   
}