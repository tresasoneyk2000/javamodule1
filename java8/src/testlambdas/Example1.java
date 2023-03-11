package testlambdas;
@FunctionalInterface
interface Shape{
	double area();
	//double perimeter(); functional interface so it can contain only one function
}
interface math{
	double power(int a, int e);
}
interface factorial{
	int fact(int n);
}
public class Example1 {

	public static void main(String[] args) {
		int a=10;
		factorial f=(int n)->{
			int fa=1;
			for(int i=n;i>0;i--) {
				fa=fa*i;
			}
			return fa;
		}
		;
		
		int  fact=f.fact(3);
		System.out.println(fact);
		
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("from run method "+a);
			}
		};
		
		Thread t2=new Thread(r1);
		t2.start();
		
		Runnable r=()->{            // without a class we can implement an interface by lambdas example runnable
			for(int i=1;i<5;i++) {
				System.out.println("in run method");
			}
		};
		
		Thread t =new Thread(r);
		t.start();
		
		
		
		math m=(int b, int e)->{
			int p=1;
			for(int i=1;i<=e;i++) {
				p*=b;
			}
			return p;
		};
		
		double l=m.power(2,3);
		System.out.println(l);
		
		
		Shape s=()->{//represents to piece of code .reference of interface lambdas is a placeholder
						return 0.0;
			
						};
						
			double result =s.area()
;
			System.out.println(result);
			
	}

}
