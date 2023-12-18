   /**
* References Inventory Item. Creates an empty array with a
* method to add items to it.
* Activty 10.
* @author Abby Miller COMP1210-D01
* @version 11-09-21
*/
public class ItemsList {
   //Instance variable
   private InventoryItem[] inventory;
   private int count;
   
   /**
   * Constructor.
   * No parameters, just instantiates inventory item array.
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   /**
   * Add item.
   * @param itemIn is an item to add to the array.
   */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
   /**
   * Checks each element of inventory to make sure its not an 
   * electronics item. If it is, it adds the surcharge.
   * @param electronicsSurcharge input for electronic surcharge
   * @return returns total cost.
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
   * toString to iterate through inventory
   * and return each value.
   * @return returns string with all information.
   */
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}