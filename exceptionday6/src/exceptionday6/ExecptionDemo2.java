package exceptionday6;

public class ExecptionDemo2 {

	public static void main(String[] args) {// args is known as command line arguments
		// TODO Auto-generated method stub
		System.out.println("program task begins");
		try {
		int b= Integer.parseInt(args[0]);//"10,"20
		int a= Integer.parseInt(args[1]);//a."10","ten"
		int c= a/b;
		String name=args[2];// "10" pass as string
		int data[]= {a,b};
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program task completed");
		

	}

}
