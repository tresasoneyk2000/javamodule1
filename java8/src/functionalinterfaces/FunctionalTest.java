package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		List<String> strings=
				Arrays.asList("Andhra Pradesh",//Getting the list view of Array
										"Tamilnadu",
										"Telengana",
										"Kerala",
										"Karnadaka");
		Function<String,Integer> f5=(str)->{// string input integer return
			return str.length();
		
		
		};
		
		Function<String,String> f1=(str)->{
			return str.toLowerCase();
		};
		Function<String,String> f2=(str)->{
			return str.toUpperCase();
		};
		Function<String,String> f3=(str)->{
			StringBuilder s=new StringBuilder(str);
			 s.reverse();
		    return	s.toString();
		};
		
		printLength(strings,f5);
		printLowercase(strings,f1);
		printUppercase(strings,f2);
		printReverse(strings,f3);
	}// main ends
	public static void printLength(List<String> strings,Function<String,Integer> fref) {
		for(String str:strings) {
			System.out.println(fref.apply(str));
		}
	}

	public static void printLowercase(List<String> strings,Function<String,String> f) {
		for(String str1:strings)
		System.out.println(f.apply(str1));
	}
	public static void printUppercase(List<String> strings,Function<String,String> f) {
		for(String str1:strings)
			System.out.println(f.apply(str1));
		
	}
	
	public static void printReverse(List<String> strings,Function<String, String> f3) {
		
		for(String str1:strings)
			
			System.out.println(f3.apply(str1));
	}
}
