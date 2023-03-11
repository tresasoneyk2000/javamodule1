package functionalinterfaces;
import java.util.function.Predicate;//predicate sttes whether a condition is true/false
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings=
				Arrays.asList("Andhra Pradesh",
										"Tamilnadu",
										"Kerala",
										"Karnadaka");
		
		Predicate<String> p=(String str)->{
			return str.length()>10;
		};
		System.out.println(p.test("Hollo!"));
		testLength(strings,p);

	}
	
	public static void testLength(List<String> strings,Predicate<String> p) {
		for(String str:strings) {
			System.out.println(p.test(str));
		}
		
	}

}
