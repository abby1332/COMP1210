/**
* A driver with a main method to test different Inventory classes.
* Activty 9.
* @author Abby Miller COMP1210-D01
* @version 10-27-21
*/
public class InventoryApp {
   /**
   * Main method implements different inventory classes and prints them.
   * @param args - Standard commandline arguments.
   */
   public static void main(String [] args) {
      InventoryItem.setTaxRate(0.05);
      
      InventoryItem item1 = new InventoryItem("Oil change kit", 39);
      System.out.println(item1.toString());
      
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80, 1.8);
      System.out.println(item2.toString());
      
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      System.out.println(item3.toString());
      
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
      System.out.println(item4);
   }
}