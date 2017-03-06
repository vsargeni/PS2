package pkgbase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public  void testMyInteger() {
		MyInteger myint = new MyInteger(7);
		MyInteger myint2 = new MyInteger(8);
		
		
		assertEquals(true,myint.isOdd());
		assertEquals(false,myint.isEven());
		assertEquals(true,myint.isPrime());
		assertEquals(false, myint.equals(myint2));
		assertEquals(true, myint.equals(7));
		assertEquals(false, MyInteger.isEven(myint));
		assertEquals(true, MyInteger.isOdd(myint));
		assertEquals(true, MyInteger.isPrime(myint2));
		assertEquals(true, MyInteger.isEven(8));
		assertEquals(true, MyInteger.isOdd(5));
		assertEquals(false, MyInteger.isPrime(4));
		
		
		
		
		
		
	}

}
