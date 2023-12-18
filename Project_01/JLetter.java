/**
* Program to print out the word "java" in the shape of a J 
* through print statements.
*
* Project 1
* @author Abby Miller COMP1210-D01
* @version 8-22-21
*/
public class JLetter {
     /**
      * Prints out java in the shape of a J.
      * @param args Command line arguments - not used.
      */
   public static void main(String[]args) {
      System.out.println("JAVAJAVAJAVA");
      System.out.println("JAVAJAVAJAVA");
      for (int i = 1; i <= 4; i++) {
         System.out.println("      JAVA");
      }
      System.out.println("J     JAVA");
      System.out.println("JA    JAVA"); 
      System.out.println(" JAVAJAVA");
      System.out.println("  JAVAJA");
   }
}