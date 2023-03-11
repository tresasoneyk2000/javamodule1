package optional;

import java.util.Optional;

// optional is null tseting.testiong null without using null we don't get nullpointer exception
public class TestOptional {

	public static void main(String[] args) {
	
		String str=null;
		String str2="hello";
		
		//Optional<String> optional=Optional.of(str);//use of if and only str is not null
		
		//System.out.println(optional.get());
		Optional<String> optional2= Optional.ofNullable(str);//to check string is null or not
		if(optional2.isPresent())
		System.out.println("Value is present  "+ optional2.get()); //when str2 is pass if will excute if str is pass else excuted and no value present error occur
		else
			//System.out.println("its null" + optional2.get());
		System.out.println("its null " + optional2.orElse("str is not inialized"));

	}

}
