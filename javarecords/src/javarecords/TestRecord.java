package javarecords;

public class TestRecord {

	public static void main(String[] args) {
		
		
		person john = new person("John", 30);
		person sarah = new person("Sarah", 25);
		
		System.out.println(john.name());
		System.out.println(sarah.age());
		

	}

}
