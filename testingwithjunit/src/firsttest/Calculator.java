package firsttest
;

public class Calculator {
	public int power(int b, int e) {
		int s=1;
		if(b==0||e==0)
			return 0;
		else {
		for(int i=1;i<=e;i++) {
			s=s*b;
		}
		return s;}
	}
	public int factorial(int n) {
		int fact=1;
		if(n==0)
			return 1;
		else {
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return fact;}
	}
	
	public int sum(int a, int b) {
		return a+b;
	}

}
