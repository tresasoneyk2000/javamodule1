package firsttest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAdd {
 static Calculator calc;
 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc= new Calculator();
		System.out.println("Before test executed");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After executing all test cases");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before each Test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After each Test");
	}

	@Test
	public void testSum() {
		int n1=5;
		int n3=6;
		int expectedValue=11;
		int actualValue=calc.sum(n1,n3);
		assertEquals(expectedValue,actualValue);
	}

}
