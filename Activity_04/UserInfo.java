/**
* First time writing a class
* and giving it constructors,
* instances, and methods.
*
* Activity 4
* @author Abby Miller COMP1210-D01
* @version 9-14-21
*/
public class UserInfo {
 /**
 * Instance variables.
 * @param args Command line arguments - not used.
 */
   private String firstName, lastName, location;
   private int age, status;
   private static final int OFFLINE = 0, ONLINE = 1;
   
/**
** Instance variables.
* @param firstNameIn assign the first name. 
* @param lastNameIn assigns the last name.
*/
    
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
/**
** Methods.
* @return output prints out all data.  
*/
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
/**
** Location.  
* @param locationIn sets location.
*/
   public void setLocation(String locationIn) {
      location = locationIn; // No return value
   }
/**
** Age. 
* @param ageIn age inputed by user.
* @return isSet determines wether or not ageIn
* is set.  
*/
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   /**
** Age return. 
* @return age assigns age with user input 
*/
   public int getAge() {
      return age;
   }
/**
** Get location.
* @return location assigns user 
* location to location  
*/
   public String getLocation() {
      return location;
   }
/**
** Log off. 
* Set status as offline.
*/
   public void logOff() {
      status = OFFLINE;
   }
 /**
 ** Log on.
 * Set status as online.
 */
   public void logOn() {
      status = ONLINE;
   }
}
