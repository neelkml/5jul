package neel;

import junit.framework.TestCase;

public class CalcuationTest extends TestCase {

	Calcuation cal;

	public void setUp() {
		cal = new Calcuation();
		//System.out.println("avcsgsg");
	}

	public void testCheckEven() {
		assertTrue(cal.checkEven(4));
	}
	public void testCheckEvenNegative() {
		assertTrue(!cal.checkEven(1));
	}
	public void testSum() {
		//assertTrue(cal.sum(2, 3) == 5);
	assertEquals(5, cal.sum(2, 4));
	}

}
