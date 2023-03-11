package testlambdas; //in  java 8 interface can add static and default methods
@FunctionalInterface
public interface TestInterface {
	public double method();
	public default void method2(){
		System.out.println("from method2");
	}
	public static void method3() {
		System.out.println("from method3");
	}
	

}
