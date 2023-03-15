package testlambdas;

public class LambasSwitchCase {
	static double calculate(String operator,double x,double y) {
		return switch(operator) {
		case "+"-> x+y;
		case "-"->x-y;
		case "*"->x*y;
		case"/"->{
			if(y==0) {
				throw new IllegalArgumentException("Can't divide by 0");
			}
			yield x/y;
		}
		default-> throw new IllegalArgumentException("Unknown operator");
		};
	}
	public static void main(String[] args) {
		
		//LambasSwitchCase L= new LambasSwitchCase();
		double c=calculate("+",3.0,6.0);
		
		
		System.out.println(calculate("+",3.0,6.0));
		//c=calculate("-",9.0,3.0);
		System.out.println(calculate("-",9.0,3.0));
		System.out.println(calculate("/",9.0,3.0));
		System.out.println(calculate("*",9.0,3.0));
		//System.out.println(calculate("/",9.0,0.0));
		System.out.println(calculate("%",9.0,3.0));
	}

}
