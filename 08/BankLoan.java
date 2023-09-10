/**
*Create a program that calculates Bank Loans.
*
*@Author: Mohamad Salaam
*
*@Version: 10/21/19
*
*/

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
 /**
 *Concstructor method.
 *
 *@param customerNameIn to have suctomer name
 *@param interestRateIn to have interest rate
 *
 */
 

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }
   
   /**
   *boolean method to see if a loan was made.
   *
   *@return wasLoanMade
   *@param amount to see amount of money taken
   *
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
  *method to check how much was paid back.
  *
  *@return 0
  *@param amountPaid to see how much money was paid back
  *
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
   *method to get current balance.
   *
   *@return balance
   *
   */
   
   public double getBalance() {
      return balance;
   }
   
  /**
   *boolean method to see interest rate.
   *
   *@return true, false
   *@param interestRateIn to see how much the interest rate is
   *
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
   *method to see interest rate.
   *
   *@return interestRate
   *
   */
   
   public double getInterestRate() {
      return interestRate;
   }
   
 /**
   *method to charge interest rate to loan.
   *
   */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
    /**
   *method to make a toString output.
   *
   *@return output
   *
   */
   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }
   
  /**
   *boolean method to see if a loan was made.
   *
   *@return wasLoanMade
   *@param amount to see how much was taken
   *
   */

   public static boolean isAmountValid(double amount) {
   
      //amount = 0;
   
      if (amount >= 0) {
         return true;
      } 
      
      return false;
   }
   
  /**
   *boolean method to see how much is loaned.
   *
   *@return true, false
   *@param loan to see how much money is taken
   *
   */
   
   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
      
         return true;
      }
      
      return false;
   
   }
   
  /**
   *method to see how many loans have been created.
   *
   *@return loansCreated
   *
   */
   
   public static int getLoansCreated() {
   
      return loansCreated;
   
   }
   
  /**
   *method to reset all loans created.
   *
   */
   
   public static void resetLoansCreated() {
   
      loansCreated = 0;
   
   }
   
   
   

}
