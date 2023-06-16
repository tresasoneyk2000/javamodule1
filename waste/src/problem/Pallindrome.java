package problem;

import java.util.HashSet;
import java.util.Set;

public class Pallindrome {
	static boolean isPali(String i) {
		StringBuilder sb= new StringBuilder(i);
		sb.reverse();
				String ne=sb.toString();
				
		if(i.equals(ne)) {
			
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Set<String> t=new HashSet<>();
		
		
		
		String s="babad";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String sub =s.substring(i,j);
				t.add(sub);
				
			}}
		int max=0;
		String va="";
		
		for(String i:t) {
			
			if(isPali(i)) {
				int n=i.length();
				if(n>max) {
					max=n;
					va=i;
				}
				
				
				
			}
			
		}
		
		System.out.println(va);
	}

	

}
 