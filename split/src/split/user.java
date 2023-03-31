package split;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class user {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter amount: ");
	    
		double amount =s.nextDouble();
		System.out.println("Number of split: ");
		int n=s.nextInt();
		ArrayList<Double> person= new ArrayList();
		double sum=0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter amount ");
			person.add(s.nextDouble());
			
			sum=sum+person.get(i);

			
		}
		Predicate<Double> p=(sum1)->{
			return (sum1>amount);
		};
		
		System.out.println(sum);
		

	}

}
