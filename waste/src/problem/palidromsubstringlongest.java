package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class palidromsubstringlongest {

	public static void main(String[] args) {
		String s="babad";
		Map<String,Integer> m=new HashMap<>();

		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
			String sub =s.substring(i,j);
			StringBuilder sb= new StringBuilder(sub);
			String ne=sb.reverse().toString();
			if(ne.equals(sub)) {
				int n=ne.length();
				if(!(m.containsKey(ne))) {
					m.put(ne, n);
				}
				
				
			}
			}
			
		}
		int max=0;
		String str2="";
		
		for(Map.Entry<String, Integer> entry: m.entrySet()) {
			
			int value=entry.getValue();
			if(value>max) {
				max=value;
				str2=entry.getKey();			}
		}
		//System.out.println(max,str2);
		int[] a= {1,3,5};
		char[] c= {'l','o','v','e','l','e','e','t','c','o','d','e'};
		int s1=c.length;
		char str='l';
		Arrays.sort(c);
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		int index = Arrays.binarySearch(c, 1, s1,str);
		System.out.println(index);
		String[] st1= {"tree","anw","yui","dfg"};

		System.out.println(Arrays.toString(c));
		
		
		
	}

}
