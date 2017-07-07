package neel;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCollection {
	Calcuation cal;
	@Before
	public void setUp() {
		System.out.println("setting Up");
		cal = new Calcuation();
	}
@Test
	public void testFirst() {
		Assert.assertEquals(String.class, cal.getMessage().getClass());
	}
@After
	public void tearDown()
	{
		System.out.println("releasing");
		cal=null;
	}
}
