package problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class repeatsubstring {

	public static void main(String[] args) {
		HashMap<String,Integer> s= new HashMap<String,Integer>();
		String str="abeabe";
		int c=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String sub =str.substring(i, j);
				if(s.containsKey(sub)) {
		int n=s.get(sub)+1;
					
				s.put(sub,n);
					
				}
				else {
					s.put(sub, 1);
				}
				
			}
		
			
			
		}
		System.out.println(s);
			System.out.println(Collections.max(s.values()));
		
		
//		 int count = 0;
//		    int n = str.length();
		 //   HashMap<String, Integer> map = new HashMap<String, Integer>();
//		    
//		    for (int i = 0; i < n; i++) {
//		        for (int j = i + 1; j <= n; j++) {
//		            String sub = str.substring(i, j);
//		            Integer val = map.get(sub);
//		            if (val != null) {
//		                // Duplicate substring found
//		                count += val;
//		            }
//		            map.put(sub, map.getOrDefault(sub, 0) + 1);
//		        }
//		    }
		    
		
		
		
		
//		 int count = 0;
//		    int n = str.length();
//		    HashSet<Character> set = new HashSet<Character>();
//		    
//		    for (int i = 0; i < n; i++) {
//		       
//		            char sub = str.charAt(i);
//		            
//		            if (set.contains(sub)) {
//		                count++;
//		            } else {
//		                set.add(sub);
//		            }
//		        }
//		    
//		    
//		    System.out.println(count);
//		    
		    
		    
		    
		    
//		    
//		    String str = "Hello, world!";
//		    List<Character> charList = new ArrayList<>();
//		    for (char c : str.toCharArray()) {
//		        charList.add(c);
//		    }
		
//		Set<String> set = new HashSet<>();
//		set.add("apple");
//		set.add("banana");
//		set.add("orange");
//
//		//String[] array = set.toArray(new String[0]);
//		
//		List<String> list=new ArrayList<>(set);
//		int n=set.size();		
//		String[] array=new String[n];
//				set.toArray(array);
//				System.out.println(set);
//				System.out.println(array[1]);
//
////		for (int i=0;i<array.length;i++) {
////		    System.out.println(element);
////		}
////		    System.out.println(charList);
//		    
//	}

}}
 