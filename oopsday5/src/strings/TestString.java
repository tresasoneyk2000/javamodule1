package strings;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str= new String();
		byte bytes[] = {65,66,67,68,69};
		int count=0;
		int digit=0;
		int alpha=0;
		int other=0;
		int space=0;
		
		String s= new String(bytes);
		System.out.println(s.length());
		System.out.println(s);
		
		s="Welcome to UST Global";
		bytes=s.getBytes();
		
		bytes = s.getBytes();
		for(byte b:bytes) {
			System.out.println(b);
		}
		
		char chars[]= {'U','S','T',' ','G'};
		String str=new String(chars);
		
		System.out.println(str);
		 str.getChars(0, 4, chars, 0);
		 for(char c: chars) {
			 System.out.println(c);
			 
		 }
		
		 //Integer N = new Integer(10)// deprecated
		 String string = new String("She sells sea.shells in sea shore.");
		 for(int i=0; i<string.length();i++) {
			 
			 char c= string.charAt(i);
			 if(c=='s'|c=='S')
				 count++;
			 //else if(c=='S')
				 //count++;
			 
			 
			 
		 }
		 System.out.println(count);
		 String string1 = new String("She sells sea . shells in sea shore.");
		 
		 String words[]=string1.split("[.] ");
		 System.out.println(words.length);
	
	for(String word:words)
	{
		System.out.println(word);
	}
	
	string1=new String("Cartoon");
	System.out.println(string1.startsWith("Car"));
	System.out.println(string1.endsWith("toon"));
	
	int apos=string1.indexOf('a');
	int tpos=string1.indexOf('t');
	
	String string2 = string1.substring(apos,tpos+1);
	System.out.println(string2);
	string2=string1.substring(tpos);
	
	System.out.println(string2);
	
	string = new String("madaMMMMMAADAMmdam");
	int mpos = -1;
	int dpo = string.lastIndexOf('d');
	System.out.println(dpo);
	string1= string.substring(dpo, string.length());
	
	System.out.println(string1);
	
	String email = new String("aneet.roy@ust.com");
	int d = email.lastIndexOf('c');
	String email1=email.substring(d, email.length());
	System.out.println(email1);
	
	
	
	String str1= new String("welcome");
	String str2= new String("welcome");
	String str3= new String("weLOME");
	
	boolean result= str1.equals(str2);
	System.out.println(result);
	 result= str1.equalsIgnoreCase(str3);
	System.out.println(result);
	
	
	int val= str1.compareTo(str3);
	System.out.println(val);

	 val= str3.compareTo(str1);//-32 difference of ASCCI values
	System.out.println(val);
	
	val=str2.compareTo(str1);
	System.out.println(val);
	
//	System.out.println(string.toLowerCase());
//	System.out.println(string);
//	
//	System.out.println(string.toUpperCase());
//	System.out.println(string);
//	
	
	
	//"16-11-477/6/A/3 HYDERABAD 500036"
	String st="16-11-477/6/A/3 HYDERABAD 500036";
	
	char c[]= {};
	//c=st.getChars(0, st.length()-1, c, 0);
	
	for(int i=0;i<st.length();i++) {
		if(Character.isDigit(st.charAt(i))) {
			digit++;
			
		}
		else if(Character.isAlphabetic(st.charAt(i))) {
			alpha++;
		}
		else if(Character.isSpaceChar(st.charAt(i))) {
			space++;
			
		}
		else if(Character.isWhitespace(st.charAt(i))){
			other++;
		}
	}
	//Character.isDigit(0)
	System.out.println(digit);
	System.out.println(alpha);
	System.out.println(space);
	System.out.println(other);
	
	//char s1=new char(st);
	
	}
	
	
	
	
	
	
	
	
	
	

}
