package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest 
{
	Division o1=new Division(10,2);
	Division o2=new Division(10,0);

	@Test
	public void test() {
		System.out.println("fist  test case");
		assertEquals(5,o1.division());	
	}
	// if we throw the exception it must should contain exception
@Test(expected=ArithmeticException.class)
public void test1()
{
	System.out.println("second test case");
	assertEquals(1,o2.division());
}
@Test(expected=NullPointerException.class)
public void ArithExcep2()
{
	throw new NullPointerException();
}
@Test(expected=ArithmeticException.class)
public void ArithExcep1()
{
	throw new NullPointerException();
}
}
