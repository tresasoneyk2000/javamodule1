package functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
		List<String> strings=
				Arrays.asList("Andhra Pradesh",
										"Tamilnadu",
										"Kerala",
										"Karnadaka");
		Function<String,Integer> f5=(str)->{// string input integer return
			return str.length();
		
		};
		for(String str:strings) {
			System.out.println(f5.apply(str));
		}
		
		
		Function<String,Integer> f=(str)->{// string input integer return
			return str.length();
		
		};
		
		System.out.println(f.apply("Buneos dias"));
		Function<Integer,Integer> f2=(n)->{//int input int return
			return n*n;
		
		};
		System.out.println(f2.apply(25));
		
		Function<String,String> f3=(str)->{
			return str.toUpperCase();
		
		};
		System.out.println(f3.apply("Buneos dias"));
		
		
		

	}

}
