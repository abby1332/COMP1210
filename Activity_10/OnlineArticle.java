
/**
   * A subclass that inherits from OnlineTextItem
* and keeps track of word count in addition to everything
* that is done by OnlineTextItem and InventoryItem.
* References Inventory Item's constructor and protected variables.
* Activty 9.
* @author Abby Miller COMP1210-D01
* @version 10-27-21
*/
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
   * Constructor. Sets wordcount to 0.
   * @param nameIn sets name.
   * @param priceIn sets price.
   */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
   * Sets the wordCount variable.
   * @param wordCountIn int for variable.
   */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}