package exceptionday6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program task begins");

		try {
			System.out.println("entered try..");
			int c=10/0;
			System.out.println("from try afterexception..");
		} catch (Exception e) {
			//System.out.println("from catch...");

		}//catch(ArithmeticException e) {
		//	e.printStackTrace();
		//}
		finally {
		System.out.println("from finally...");}
		System.out.println("Program completed task");
	}

}
