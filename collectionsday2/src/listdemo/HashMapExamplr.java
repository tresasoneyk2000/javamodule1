package listdemo;

import java.util.HashMap;

public class HashMapExamplr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="The documentation for the polymorphic algorithms contained in this class generally includes a brief description of the implementation. Such descriptions should be regarded as implementation notes, rather than parts of the specification. Implementors should feel free to substitute other algorithms, so long as the specification itself is adhered to. (For example, the algorithm used by sort does not have to be a mergesort, but it does have to be stable.";
	
  String s=str.toLowerCase();
  String a[]=s.split(" ");
  HashMap<String,Double> hashmap=new HashMap<>();
 for(int i=0;i<a.length;i++) {
	 Double d= hashmap.get(a[i]);
	 if(d==null) {
		 hashmap.put(a[i], 1.0);
		 
	 }
	 else {
		 hashmap.put(a[i], d+1);
	 }
 }
 
 System.out.println(hashmap);
  
  
  
		  }
}