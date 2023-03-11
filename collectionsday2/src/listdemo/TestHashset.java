package listdemo;

import java.util.HashSet;
import java.util.Iterator;
public class TestHashset {// hashset doesnt allow duplicate but list does

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> bookSet=new HashSet<>();
		bookSet.add("java is nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("java in 21 days");
		bookSet.add("java for dummys");
		bookSet.add(null);
		bookSet.add(null);
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("java is nutshell"));
		bookSet.add("Thinking in Java");
		System.out.println(bookSet.size());
		
		for(String book:bookSet) {
			System.out.println(book);// does not print in order
		}
		
		Iterator<String> iter = bookSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
