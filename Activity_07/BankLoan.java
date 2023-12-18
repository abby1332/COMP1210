/**
* Tracks bank loans and performs various equations.
* I practiced by adding static methods and variables. 
* Activity 7  
* @author Abby Miller COMP1210-D01
* @version 10-12-21
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

   /**
   * Constructor.
   * @param customerNameIn string customer name.
   * @param interestRateIn double interest rate.
   */
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
   * Borrow money from the bank.
   * @param amount amount of money borrowed.
   * @return wasLoanMade returns wether or not loan was made.
   */
   
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }
   
   /**
   * Pay the bank back from your loan.
   * @param amountPaid amount paid back to bank.
   * @return returns 0 if amount paid properly or
   * new balance if paid too much.
   */
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   * Get Balance.
   * @return balance Gets current balance.
   */
   public double getBalance() {
      return balance;
   }
   
   /**
   * Sets new interest rate as long as it's between
   * 0 and 1.
   * @param interestRateIn new interest rate.
   * @return true if successful false if not.
   */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   * get interest rate.
   * @return interestRate returns current interestRate.
   */
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   * Charges interest rate to balance.
   */
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   * To string.
   * @return output returns string showing formatted information.
   */
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
   /**
   * is amount valid.
   * @param amount double amount.
   * @return amount returns true if amount is not negative.
   */
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }

   /** 
   * is in debt.
   * @param loan is the loan.
   * @return returns whether or not a loan is in debt.
   */
   public static boolean isInDebt(BankLoan loan) {
      if (loan.getBalance() > 0) {
         return true;
      }
      return false;
   }
   
   
   private static int loansCreated = 0;
   
   /**
   * Get loans created.
   * @return loansCreated returns current value of loansCreated
   */
   public static int getLoansCreated() {
      return loansCreated;
   }
   
   /**
   * Resets value of loansCreated to 0.
   */
   public static void resetLoansCreated() {
      loansCreated = 0;
   }
   
}