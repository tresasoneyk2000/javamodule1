package javarecords;


public record person(String name,int age ) {
	public int hashCode()
	
	{
		return 0;
	}
	@Override
	public String toString() {
		return null;
	}
}
