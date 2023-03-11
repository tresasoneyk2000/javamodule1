package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		
		List<String> strings=
				Arrays.asList("Andhra Pradesh",
										"Tamilnadu",
										"Telangana",
										"Kerala",
										"Karnadaka");
		
		Consumer<String>consumer=(str)->{// doesnot produce output like void consumer only receive input but not return output only print
			System.out.println(str);
		};
		consumer.accept("I am doing great");
		for(String str: strings) {
			consumer.accept(str);
		}
		 printString(strings,consumer);
	}
	
	public static void printString(List<String> strings,Consumer<String> consumer) {
		//consumer.accept("I am doing great");
		for(String str: strings) {
			consumer.accept(str);
		}
		
		
	}

}
