package testexception;

import static org.junit.Assert.*;

import org.junit.Test;

public class TellerTest {
	Teller teller=new Teller();

	@Test(expected=IllegalArgumentException.class)
	public void testValidateUnAcceptedCurrency() {
		teller.validateTransaction("AUSD",100);
	}
	@Test (expected=InvalidTransactionAmountExcpetion.class)
	public void testValidateNegativeAmount() {
		teller.validateTransaction("EUR", -100);
	}

}
