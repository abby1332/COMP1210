/**
* Using a class in a
* seperate java file.
*
* Activity 4
* @author Abby Miller COMP1210-D01
* @version 9-14-21
*/
public class UserInfoDriver {
   /**
    * Practicing using the userInfo class.
    * @param args Command line arguments - not used.
    */

   public static void main(String[] args) {
      
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      System.out.println("\n" + user2);
   }
}