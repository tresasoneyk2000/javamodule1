package listdemo;

import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java what is java java is this";
	String a[]=str.split(" ");
	int n;
	
	HashMap<String,Integer> h= new HashMap<>();
	//Integer k=h.get(h)
	
	
//	for(int i=0;i<a.length;i++) {
//		h.put(a[i],0);
//		
//		
//	}
	
	
	
	
	for(int i=0;i<a.length;i++) {
		Integer k=h.get(a[i]);
		if(k!=null) {
		int count=h.get(a[i]);
			h.put(a[i],++count);
			
		}
		else {
			h.put(a[i],1);
		}
		
			}
		
			
	System.out.println(h);
	System.out.println(h.size());
	
	
//	
//		int i=10;
//			String s="10";
//			Integer integer= new Integer("10");
//			String sint= s.valueOf(i));
//			int m= Integer.parseInt(s);
//			
//			
//			//from Integer to string
//			
//			String s2=integer.toString();
//			integer=s2.intValue();
	
		
	}
//	
	
	}
	
	
	
	
	
	//HashMap<String,String> h= n


