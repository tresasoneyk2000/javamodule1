package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		List<String> strings=
				Arrays.asList("Andhra Pradesh",
										"Tamilnadu",
										"Telangana",
										"Kerala",
										"Karnadaka");
		
		Supplier<String> supplier=()->{// no input
				return new String("Hola!");
};
System.out.println(supplier.get());
	}
  
	
	
}
