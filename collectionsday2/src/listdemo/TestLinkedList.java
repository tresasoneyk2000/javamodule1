package listdemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list= new LinkedList<>();// type given as string
		list.add("marker");
		list.add("Pencil");
		list.add("book");
		list.add("eraser");
		list.add("sharpner");
		
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.get(2));
		list.add(2,"sticky notes");
		System.out.println(list);
		
		
		
		Iterator<String> iter=list.descendingIterator();// in arraylist we cannot print items in reverse order
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		ListIterator<String> listIter=  list.listIterator();
//		ListIterator<String> listIter= new list.listIterator();
//		
//
		
while(listIter.hasNext()) {
			 String element = listIter.next();		
			 if(element=="pencil") {			
				 listIter.remove();
			 }
		 }
		
	System.out.println(list);
	

	}

}
