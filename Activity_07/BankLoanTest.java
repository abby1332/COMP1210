import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* Test file for BankLoan.java.
* Activity 7  
* @author Abby Miller COMP1210-D01
* @version 10-12-21
*/

public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   //@Test public void defaultTest() {
      //Assert.assertEquals("Default test added by jGRASP. Delete "
            //+ "this test once you have added your own.", 0, 1);
   //}
   
   /**
   * Tests the chargeInterest rate method.
   */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      //Delta comparison, necessary when comparing doubles
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
   
   /**
   * Tests the isInDebt method.
   */
   @Test public void inDebtTest() {
      BankLoan b = new BankLoan("Bob", 0.08);
      b.borrowFromBank(1);
      Assert.assertTrue(BankLoan.isInDebt(b));
   }
}
