import java.text.DecimalFormat;
 /**
* Writing a class that takes paramters,
* puts them through math equations,
* and returns the results.
*
* Project 4
* @author Abby Miller COMP1210-D01
* @version 9-16-21
*/
public class DecagonalPrism {

/**
 * Instance variables.
 * Asks for label, edge and height.
 * @param args Command line arguments - not used.
 */

   private String label = "";
   private double edge = 0;
   private double height = 0;

/** Constructor
* Sets the parameters for the class.
* @param labelIn is a String for the label of 
* the instance of the class.
* @param edgeIn defines the edge as a double.
* @param heightIn defines the height as a double.
* No return value.
*/

   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }

// Methods
   
/** Mutator method that sets the private instance variable
* Label to a public variable and trims it.
* @param labelIn defines what the new label value will be.
* @return isSet returns wether or not the value is null.
*/
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      String nullCheck = null;
      String nullCheck2 = "";
      if (labelIn == nullCheck || labelIn == nullCheck2) {
         isSet = false;
      }
      else {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
 /**
* Accessor method that returns the 
* label in a String value.
* @return label returns the current value of label.
*/
   public String getLabel() {
      return label;
   }
   
  /** Accessor method that accepts no parameters and
  * returns a double representing the edge field.
  * @return edge returns the current value of the private variable edge.
  */
   public double getEdge() {
      return edge;
   }
  
 //setEdge:  Accepts a double parameter and returns a boolean. 
 // If the edge is non-negative, sets edge field and returns true.  
 // Otherwise, the method returns false, and the edge field is not set.
 
 /** Mutator method that accepts a double parameter and returns
 * a boolean.
 * @param edgeIn uses the public variable edgeIn to alter the private
 * variable edge.
 * @return isSet determines wether or not the edge is non-negative. If
 * edge is negative, the edge field will not be set.
 */
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isSet = true;
      }  
      else {
         isSet = false;
      }
      return isSet;
   } 
   
 /** getHeight is an accessor method that accepts no parameters.
 * @return height returns a double representing the height field.
 */
   public double getHeight() {
      return height;
   }

   /** setHeight is a mutator method that accepts a double parameter and
   * returns a boolean.
   * @param heightIn sets the height field.
   * @return isSet determines wether or not height is negative. If it is,
   * the field will not be set.
   */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn >= 0) {
         height = heightIn;
         isSet = true;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   
   //MATH TIME
   
   /** surfaceArea is a method that accepts
   * no parameters and returns a double.
   * @return mathEquation calculates the surface
   * area using the edge and height
   * and returns the result.
   */
   public double surfaceArea() {
      double mathEquation = 0.0;
      mathEquation = (10 * edge * height + 5 * Math.pow(edge, 2) 
         * Math.sqrt(5 + 2 * (Math.sqrt(5))));
      return mathEquation;
   }
   
   /** baseArea is a method that accepts
   * no parameters and returns a double.
   * @return mathEquation calculates the base 
   * area using the edge and height
   * and returns the result.
   */
   public double baseArea() {
      double mathEquation = 0.0;
      mathEquation = (5.0 / 2.0) * Math.pow(edge, 2.0) 
         * Math.sqrt(5.0 + 2.0 * Math.sqrt(5.0));
      return mathEquation;
   }
   
   /** lateralSurfaceArea is a method that accepts
   * no parameters and returns a double.
   * @return mathEquation calculates the value for 
   * the slant height  using the 
   * edge and height and returns the result.
   */
   public double lateralSurfaceArea() {
      double mathEquation = 0.0;
      mathEquation = 10 * edge * height;
      return mathEquation;
   }
      
   /** volume is a method that accepts
   * no parameters and returns a double.
   * @return mathEquation calculates the volume using the edge and height
   * and returns the result.
   */

   public double volume() {
      double mathEquation = 0.0;
      mathEquation = (5.0 / 2.0) * Math.pow(edge, 2.0) 
         * Math.sqrt(5.0 + 2.0 * Math.sqrt(5.0)) * height;
      return mathEquation;
   }

   /** toString is a ethod that returns a String 
   * containing the information about the DecagonalPrism 
   * formatted using decimal formatting. It also uses newlines
   * and tabs for the proper layout.
   * @return output creates a string with the information 
   * from the above methods.
   */
   public String toString() {
      DecimalFormat myFormatter = new DecimalFormat("#,##0.0##");
      String output = "A decagonal prism \"" + label + "\" with edge = " 
         + edge + " units and height = " + height + " units, has:";
         
      output += "\n\t" + "surface area = " 
         + myFormatter.format(surfaceArea()) + " square units";
      
      output += "\n\t" + "base area = " 
         + myFormatter.format(baseArea()) + " square units";
      
      output += "\n\t" + "lateral surface area = " 
         + myFormatter.format(lateralSurfaceArea())
         + " square units";
      output += "\n\t" + "volume = " 
         + myFormatter.format(volume()) + " cubic units";
      
      return output;
   }
}