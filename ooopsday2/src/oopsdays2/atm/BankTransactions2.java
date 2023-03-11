package oopsdays2.atm;

public class BankTransactions2 {
	public static void main(String[] args) {
		
		Account a1=new Account(101,"john","savings",500);
		Account a2=new Account(102,"jomaria","savings",700);
		Account a3=new Account(103,"taniya","salary",850);
		Account a4=new Account(104,"aparna","salary",250);
		Account a5=new Account(105,"selas","pension",650);
		System.out.println(a1);
		BankOfAmerica2 boa= new BankOfAmerica2();
		boa.addAccount(a1);
		boa.addAccount(a2);
		boa.addAccount(a3);
		boa.addAccount(a4);
		boa.addAccount(a5);
		System.out.println(a1.getBalance());
		
		System.out.println(boa.balanceEngury(103));
		double result = boa.deposit(100,103);
		System.out.println(result);
		result=boa.withdraw(50, 103);
		System.out.println(result);
		System.out.println(a3.getBalance());
		
		
		
		
	}

}
