package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
interface Formula{
	public void m1();
}
class  Some{
	public static void m2() {
		System.out.println("from m2..");
	}
}
class Other{
Other(){
	System.out.println("From other constructor");
}
static void m2(String str){
	System.out.println("From m2");
	
}

}

public class TestMethodRefs {

	public static void main(String[] args) {
		
		
		Formula f=Some::m2;//:: method reference operator in java 8 act as constructor, instance method, static method
		f.m1();
		
	 f=Other::new;// reference of constructor to interface //take other constructor reference to interence
	 // take other constructor reference to interface
	Consumer<String> c= Other::m2;
	
	
	List<String> list=Arrays.asList("one","two","three");
	list.stream().forEach(System.out::println);// example instance  method reference
	List<Integer> intList=Arrays.asList(12,32,1233);
	Optional<Integer>  num=intList.stream().reduce(Math::max);// math static method reference
	System.out.println(num.get());
	
	 
	 

	}

}
