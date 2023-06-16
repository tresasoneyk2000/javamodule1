package problem;

import java.util.Arrays;

public class LongestSubstringstartingsame {

	public static void main(String[] args) {
		String[] str= {"flower","flow","flight"};
		Arrays.sort(str);
		String s=str[0];
		for(int i=0;i<s.length();i++) {
			for(int j=1;j<str.length;j++) {
				if(s.charAt(i)!=str[j].charAt(i)) {
					System.out.println( s.substring(0, i));
				}
				
				
			}
		}
		
	}

}
