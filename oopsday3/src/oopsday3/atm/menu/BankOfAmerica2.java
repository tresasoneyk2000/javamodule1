package oopsday3.atm.menu;

import java.util.Arrays;
import oopsday3.atm.exceptions.*;

public class BankOfAmerica2 implements BankingIface2 {
	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankOfAmerica2() {
		// TODO Auto-generated constructor stub
	}

//	public BankOfAmerica2(Account[] accounts) {
//
//		this.accounts = accounts;
//	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public double withdraw(double amout, int accno) throws InsuffcientFundsException  {
		// TODO Auto-generated method stub
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getBalance()< amout) {
				throw new InsuffcientFundsException("Insuffcient fund exception");
			}
			if (accounts[i].getActno() == accno) {
				tempBal = accounts[i].getBalance();
				tempBal -= amout;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double deposit(double amount, int accno) throws NegativeAmountException {
		// TODO Auto-generated method stub
		double tempBal = 0;
		if(amount<0) {
			throw new NegativeAmountException("negativennum");
		}
		
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == accno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;

	}

	@Override
	public String toString() {
		return "BankOfAmerica2 [accounts=" + Arrays.toString(accounts) + ", accountIndex=" + accountIndex
				+ ", getAccounts()=" + Arrays.toString(getAccounts()) + "]";
	}

	@Override
	public double balanceEngury(int accno) {
		// TODO Auto-generated method stub
		double tempBal=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == accno) {
				tempBal=accounts[i].getBalance();
			break;
			}
		}
		return tempBal;
		
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length) {
			accounts[this.accountIndex++] = account;
		}
	}
	
	public void details(int accno) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == accno) {
				String s=accounts[i].getName();
				int a=accounts[i].getActno();
				String b=accounts[i].getActType();
				double e=accounts[i].getBalance();
				System.out.println(s);
				System.out.println(a);
				System.out.println(b);
				System.out.println(e );
				break;
			}}
		
	}
}
