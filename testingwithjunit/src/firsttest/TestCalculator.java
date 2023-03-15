package firsttest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;
public class TestCalculator {
	Calculator calc;
	
 @Before
public void setup() throws Exception {
		calc= new Calculator();
		
	}
	

	@Test
	public void testPower() {
		int inputBase=2;
		int exp=3;
		int expectedValue =8;
		int actualValue=calc.power(inputBase, exp);
	
		assertEquals(expectedValue,actualValue);
		//fail("Not yet implemented");
	}
	@Test
//	public void testFactorial()
//{
//		int input=5;
//		int expectedOutput=120;
//		int actualOutput =calc.factorial(input);
//		assertEquals(expectedOutput,actualOutput);
//		}
public void testPowerZero()
{int inputBase=0;
int exp=0;
int expectedValue=0;
int actualValue=calc.power(0, 0);
assertEquals(expectedValue,actualValue);
	}
}
