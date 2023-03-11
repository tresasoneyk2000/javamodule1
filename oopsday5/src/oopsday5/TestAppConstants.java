package oopsday5;

import oopsday.another.AppConstants;//(interface in another package so need to import to here)

public class TestAppConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary =200000;
		double tax= salary*AppConstants.TAX_RATE;
		double surcharge=salary*AppConstants.SURCHARGE;

	}

}
