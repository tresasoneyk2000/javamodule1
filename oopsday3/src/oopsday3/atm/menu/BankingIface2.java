package oopsday3.atm.menu;

import oopsday3.atm.exceptions.InsuffcientFundsException;
import oopsday3.atm.exceptions.NegativeAmountException;

public interface BankingIface2 {
	public double withdraw(double amout, int accno) throws InsuffcientFundsException;
	public double deposit(double amount, int accno) throws NegativeAmountException;
	public double balanceEngury(int accno);

}
