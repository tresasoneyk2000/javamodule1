package paramtest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


	

@RunWith(Parameterized.class)
public class TestPrimeNumber {
		private final Integer inputNumber;
		private final Boolean expectedResult;
		private PrimeNumber primeNumber;
		
		
	
@Before
	public void initialize() {
		
		primeNumber=new PrimeNumber();
	}
	public TestPrimeNumber(Integer inputNumber, Boolean ExpectedResult) {
		this.inputNumber=inputNumber;
		this.expectedResult= ExpectedResult;
		
	}
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][]{
			{2,true,},
			{6,false},
			{19,true},
			{22,false},
			{10,false},
			{23,true},
			{24,false}}
		);
		}
	@Test
	public void testValidator() {
		System.out.println("Parameterized number is"+ inputNumber);
		assertEquals(expectedResult,primeNumber.validate(inputNumber));
		
	}
	}
	

// https://www.geeksforgeeks.org/junit-5-how-to-write-parameterized-tests/
//https://www.guru99.com/junit-parameterized-test.html#:~:text=Parameterized%20test%20is%20to%20execute%20the%20same%20test,method%20that%20retrieves%20data%20from%20some%20data%20source.

