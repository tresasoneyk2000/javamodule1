package problem;

public class stringreverse {

	public static void main(String[] args) {
	
		String s="how are u";
		String[] str=s.split(" ");
		System.out.println(str[0]);
		String r=" ";
		for(int i=str.length-1;i>=0;i--) {
			r= r+str[i];
			r=r+" ";
			
			
		}
		System.out.println(r.trim());
		String y="ertyuio";
		String[] st= {"rty","yuihj","sssghj"};
		char[] ch= {'w','t','i'};
		String st3= String.join(" ",st);//new String(ch);
		
	
		System.out.println(st3);
		

	}

}
