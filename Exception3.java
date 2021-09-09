package Assignment4;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		Balance SavingAccount = new Balance();
		SavingAccount.withdraw();
	}
}
class InsufficientBalanceException extends Exception{

}
class IllegalBankTransactionException extends Exception{

}
class Balance {
public void withdraw() {
Scanner availB=new Scanner(System.in);
System.out.println("Enter Available balance: ");
int availableBalance = availB.nextInt();
System.out.println("Enter amount to withdraw: ");
int inputamount=availB.nextInt();

	try {
		
		if(inputamount>availableBalance||availableBalance==0) {
			throw new InsufficientBalanceException ();
		}
		if(inputamount<0) {
			throw new IllegalBankTransactionException();
		}
		else {
			System.out.println("success");
		}
		     
		}catch(IllegalBankTransactionException | InsufficientBalanceException e){
			System.out.println(e);
		}
}
}
	
