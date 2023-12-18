/**
* Child class to OnlineTextItem and InventoryItem. 
* Creates a virutal inventory for online books and adds an author.
* References Inventory Item's constructor and protected variables.
* Activty 9.
* @author Abby Miller COMP1210-D01
* @version 10-27-21
*/
public class OnlineBook extends OnlineTextItem {
   protected String author;
  /**
  * Constructor. Initalizes author variable and sets other protected variables.
  * @param nameIn sets name.
  * @param priceIn sets price.
  */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }
   /**
   * Sets value for author.
   * @param authorIn is string value for author.
   */
   public void setAuthor(String authorIn) {
      author = authorIn;   
   }
   /**
   * Overrides toString method so author's name is listed after
   * name of the book.
   * @return returns string.
   */
   public String toString() {
      return name + " - " + author + ": $" + price;
   }
}