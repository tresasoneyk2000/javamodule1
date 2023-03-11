package factprime;

public class Math implements FunctionIface {
	
	
	//private int n;

	//@Override
//	public String toString() {
//		return "Math [n=" + n + "]";
//	}

//	public Math(int n) {
//		
//		this.n = n;
//	}
	
public Math() {
	// TODO Auto-generated constructor stub
}
	@Override
	public void factorial(int n) {
		// TODO Auto-generated method stub
		int result=1;
		for(int i=n;i>0;i--)
		{
			result=result*i;
		}
		System.out.println(result);
	}

	@Override
	public void PrimeOrNot(int n) {
		int flag=0;
		// TODO Auto-generated method stub
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
				
			}
			
		}
		if(flag==1) {
			System.out.println("Not prime");
		}
		else {
			System.out.println(" prime");
		}
	}

}
