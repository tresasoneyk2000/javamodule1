package listdemo;

import java.util.ArrayList;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> colors=new ArrayList<String>();
		//colors.add(new Object());// cannot add types other than string
		//colors.add(new Double("10.10"));
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		colors.add(null);
		
		
		String str= colors.get(3);
		System.out.println(str);
		System.out.println(colors.size());
		
		for(String color:colors) {
			System.out.println(color);
		}
		}

}
