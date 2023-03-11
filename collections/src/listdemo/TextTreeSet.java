package listdemo;

import java.util.TreeSet;
import java.util.Iterator;
public class TextTreeSet {// TreeSet print in sorted order
// treeset doesnot allow null value null element
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> bookSet=new TreeSet<>();
		bookSet.add("Java is nutshell");
		bookSet.add("Java complete reference");
		bookSet.add("Thinking in Java");
		bookSet.add("Java in 21 days");
		bookSet.add("Java for dummys");
		bookSet.add(null);
		bookSet.add(null);
		
		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("Java is nutshell"));
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
