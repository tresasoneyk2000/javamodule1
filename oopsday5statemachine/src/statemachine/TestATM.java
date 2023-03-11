package statemachine;

import java.util.Scanner;

public class TestATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int amount=0;
		int n=0;
		int note=0;
		int result=0;
		int result1=0;
		
		boolean t=true;
		Menucall m=new Menucall();
		while(t) {
			System.out.println("STATE MACHINE");
			
			
			
				System.out.println("Enter amount:");
				Scanner sc = new Scanner(System.in);
				 amount= sc.nextInt();
				 System.out.println("Denomination");
				 System.out.println("Number of hundred rupees:");
				 note=100;
				 n=sc.nextInt();
				result= m.withdraw(note, n, amount);
			
				System.out.println(result);
				if(result<amount) {
				 System.out.println("Number of fifty rupees:");
					 n=sc.nextInt();
					 note=50;
					 result= m.withdraw(note, n, result);}
					System.out.println(result);
					//result1=result;
			
				//if(result1==amount) {
					//t=true;
					//break;}
				//else {
					System.out.println("Invalid");
				
				
				
			
			
			
		

	}}}


