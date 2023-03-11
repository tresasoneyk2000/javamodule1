package functionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		
		HashMap<String,String> map=new HashMap<>();
  map.put("ola", "o");
  map.put("Hello", "H");
  map.put("Chao", "C");
  
 // map.forEach((k,v)->
  // System.out.println(k+"FOR"+v));
   
   
   BiConsumer<String,String> bi= // used to input 2 values and result 2 value
		   (k,v)->System.out.println(k+"FOR"+v);
		   map.forEach(bi);
  
	}

}
