package oopsday3.atm.menu;

import oopsday3.atm.exceptions.NegativeAmountException;

public class Run {

	public static void main(String[] args) throws NegativeAmountException {
		//int i=10/0;
		//throw new ArithmeticException("divide by 0");
		
		// TODO Auto-generated method stub
		BankMenu b= new BankMenu();
		b.menu();

	}

}
