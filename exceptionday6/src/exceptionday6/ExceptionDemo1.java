package exceptionday6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Program task begins");
		
		try {
			System.out.println("enter inputs");
			Scanner s= new Scanner(System.in);
			int a=s.nextInt();
			int b=s.nextInt();
		int c=a/b;
		System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Cannot print / by 0");
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input format");
			
		}
		System.out.println("program completed");
		
	}

}
