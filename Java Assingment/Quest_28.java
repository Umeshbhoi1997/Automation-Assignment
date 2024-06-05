package Assignment;

import java.util.Scanner;

/*
 *  W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show custom 
exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw
amount:2500
Sorry, insufficient balance, you need more 500 Rs.To perform
this transaction.
 * 
 */







class TanviException extends Exception {
	double amount;
	public TanviException (double amount) {
		this.amount=amount;
		}
}

class ATM{
	double balance;
	public void deposit(double amount) {
		balance+=amount;     // balance=balance+amount;
		
		System.out.println(amount +" rs deposited in your account"+" Your balance is :"+balance);
		
	}
	public void withdraw(double amount) throws TanviException,ArithmeticException {
		if (balance <= amount) {
			balance-=amount;
			System.out.println(amount+" rs withdraw from the account"
					+ " your remaining balance is "+balance);
		}
		else {
			double needs;
			needs = amount-balance;
			throw new TanviException(needs);
		}
		
	}
}
 
public class Quest_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ATM atm=new ATM();
		double amount;
		System.out.println("Enter the amount to be deposited :");
		amount=sc.nextDouble();
		atm.deposit(amount);
		
		System.out.println("Enter amount to be withdraw :");
		amount=sc.nextDouble();
		try {
			atm.withdraw(amount);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (TanviException e) {
			e.printStackTrace();
			// TODO: handle exception
			System.out.println("if you deposit "+e.amount+" rs more you to be withdraw"+amount+"rs");
		}

	}

}