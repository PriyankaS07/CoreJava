package com.corejava.exception;
class InsufficientBalanceException extends Exception { 
	 private String message; 
	 public InsufficientBalanceException() {
		 this.message = "";
		 } 
	 public InsufficientBalanceException(String message) { 
		 this.message = message; 
		 } 
	 public String toString() { 
		 return "Day should be in between 1 to 31. " + this.message;
		 } 
	 }

class Account{
	int accountBalance;
	int withdrawAmt;
	int depositAmt;

	public Account(){
		accountBalance=1000;
		withdrawAmt=0;
		depositAmt=0;
	}

	public int withdrawAmount(int withdrawAmt)throws InsufficientBalanceException{
		if(withdrawAmt>accountBalance){
			throw new InsufficientBalanceException("Withdraw amount more than the account balance");
		}
		return this.accountBalance=this.accountBalance-withdrawAmt;
		
	}

		public int depositAmount(int depositAmt){
		return this.accountBalance=this.accountBalance+depositAmt;
	}
}
public class ExceptionTest {

	public static void main(String[] args) {
		Account a= new Account();
		int amtAfterWithdraw = 0;
		try {
			amtAfterWithdraw = a.withdrawAmount(1400);
		} catch (InsufficientBalanceException e) {
			
			e.printStackTrace();
		}
		System.out.println("Balance after withdrawing: "+amtAfterWithdraw);
		int amtAfterDeposit=a.depositAmount(500);
		System.out.println("Balance after depositing: "+amtAfterDeposit);
	}

}
