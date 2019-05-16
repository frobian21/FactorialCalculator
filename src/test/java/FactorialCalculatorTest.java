import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import main.FactorialCalculator;

public class FactorialCalculatorTest {
	private FactorialCalculator factor = new FactorialCalculator();

	@Test
	public void testFactorialSuccess() {
		assertEquals("The factorial returned was not correct", "5!", factor.findFactorial(120));
		assertEquals("The factorial returned was not correct", "3!", factor.findFactorial(6));
		assertEquals("The factorial returned was not correct", "12!", factor.findFactorial(479001600));
	}
	@Test
	public void testFactorialSuccess2() {
		assertEquals("The factorial returned was not correct", "0! or 1!", factor.findFactorial(1));
	}
	@Test
	public void testFactorialFail() {
		assertEquals("The factorial returned was not failed", "NONE", factor.findFactorial(150));
	}
	@Test
	public void testFactorialNegative() {
		assertEquals("The factorial was negative and did not fail", "Factorial not defined for negatives", factor.findFactorial(-2));
	}
	@Test
	public void testFactorialFail2() {
		assertEquals("The factorial returned was not failed", "NONE", factor.findFactorial(Integer.MAX_VALUE));
	}
	@Test
	public void testFactorialNegative2() {
		assertEquals("The factorial was negative and did not fail", "Factorial not defined for negatives", factor.findFactorial(Integer.MIN_VALUE));
	}
	@AfterClass
	public static void init(){
		FactorialCalculator factor = new FactorialCalculator();
		System.out.println("The factorial of 3628800 is "+factor.findFactorial(3628800));
		System.out.println("The factorial of 479001600 is "+factor.findFactorial(479001600));
		System.out.println("The factorial of 6 is "+factor.findFactorial(6));
		System.out.println("The factorial of 18 is "+factor.findFactorial(18));
	}
}
