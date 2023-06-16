package problem;

import java.util.HashSet;
import java.util.Set;

public class unique {

	public static void main(String[] args) {
		char c;
		
		int n=0;
		int i=0;
		String s ="aabb";
		//Set<Character> set=new HashSet<Character>();
		char[] ch=s.toCharArray();
		for( i=0;i<ch.length-1;i++) {
			int flag=0;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					flag=1;
					break;
					
				}
			}
			
			if(flag==0) {
				n=i;
				break;
			}
			else {
				n=-1;
			}
			
		}
		
		System.out.println(n);
		
	}

}
