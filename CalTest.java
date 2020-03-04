package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalTest {
	private int f;
	private int s;
	private int expected;
	Cal cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before classes");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after classes");
	}

	@Before
	public void setUp() throws Exception {
	cal=new Cal();
	expected=cal.sum(5,3);
	System.out.println("@before:expected"+expected);
	}

	
	@Test
	public void test1() {
		System.out.println("test1");
		Cal add=new Cal();
		f=5;
		s=3;
		assertEquals(expected,add.sum(f, s));
		System.out.println("expected"+expected);
	}
	@Test
	public void test2() {
		System.out.println("test2");
	
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("@after:end of test case");
	}

}
