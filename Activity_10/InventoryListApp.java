/**
* Driver for ItemsList.
* Activty 10.
* @author Abby Miller COMP1210-D01
* @version 11-09-21
*/
public class InventoryListApp {
   /**
    * Tests out ItemsList.
    * @param args Command line arguments - not used.
    */

   public static void main(String [] args) {
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      
      //Instantiate items
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      OnlineArticle art = new OnlineArticle("Useful Acronyms", 3.4);
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}