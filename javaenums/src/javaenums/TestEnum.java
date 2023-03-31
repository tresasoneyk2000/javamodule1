package javaenums;

public class TestEnum {
public static void main(String[] args) {
	DayOfWeek today =DayOfWeek.SATURDAY;// today is instance of enum dayofweek
	System.out.println("Today is "+today.getName());// Today is saturday
	 switch(today) {
	 case MONDAY:
		 System.out.println("work hard");
	 case TUESDAY:
		 System.out.println("work little more");
	 case WEDNESDAY:
		
		 
		 System.out.println(" work work little more");
	 case THURSDAY:
		 System.out.println("work work more, WEEKEND IS AROUND");
	 case FRIDAY:
		 System.out.println("yeahh weekend has arrived, party hard");
	 case SATURDAY:
		 System.out.println("enjoy morning coffe , go shopping");
	 case SUNDAY:
		 System.out.println("do all cleaning works ,snooooozzzzz");
		 break;
	 }
}
}
