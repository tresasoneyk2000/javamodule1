package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.exceptions.InsuffcientFundsException;
import oopsday3.atm.exceptions.NegativeAmountException;


public class BankMenu {
	
	BankOfAmerica2 boa= new BankOfAmerica2();
		public BankMenu() {
			
			

			Account a1=new Account(101,"john","savings",500);
			Account a2=new Account(102,"jomaria","savings",700);
			Account a3=new Account(103,"taniya","salary",850);
			Account a4=new Account(104,"aparna","salary",250);
			Account a5=new Account(105,"selas","pension",650);
			boa.addAccount(a1);
			boa.addAccount(a2);
			boa.addAccount(a3);
			boa.addAccount(a4);
			boa.addAccount(a5);
			// TODO Auto-generated constructor stub
		}
		
		public void menu() throws NegativeAmountException{
			Scanner scanner = new Scanner(System.in);
			int choice=0;
			
			loop: do {
				System.out.println("Enter your choice 1..5");
				System.out.println("1. Display account");
				System.out.println("2. Deposit amountt");
				System.out.println("3. Withdraw Amount");
				System.out.println("4. Display Balance");
				System.out.println("5. exit");
				choice =scanner.nextInt();
		
		switch(choice) {
		
			
		case 1:{
			System.out.println("Enter actno");
			int actno=scanner.nextInt();
			
			boa.details(actno);
			
			
			break;
		}
		case 2:{
			System.out.println("Enter actno");
			int actno=scanner.nextInt();
			System.out.println("Enter amount to deposit");
			double amount=scanner.nextInt();
			double balance = boa.deposit(amount,actno);
			System.out.println(balance);
			break;
			
		}
		case 3:{
			System.out.println("Enter actno");
			int actno=scanner.nextInt();
			System.out.println("Enter amount to withraw");
			double amount=scanner.nextInt();
			double balance=0;
			try {
				balance = boa.withdraw(amount,actno);
			} catch (InsuffcientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(balance);
			break;
			
			
			
			
			
			}
		case 4:
		
		{
			System.out.println("Enter actno");
			int actno=scanner.nextInt();
			double d=boa.balanceEngury(actno);
			System.out.println(d);
			
			break;
		}
		case 5:{
			
			break loop;
		}
			
			
		}
			
			

			
			
			}while(choice!=5);
	}

}

