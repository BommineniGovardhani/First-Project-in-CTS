package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest1 {

	@Test
	public void test123() {
		//fail("Not yet implemented");
	String s1="junit";
	String s2="junit";
	String s3="unit";
	String s4=new String("unit");
	String s5=null;
	int var=1;
	int var1=2;
	int[] a1={1,2,3,4};
	int[] a2={1,2,3,4};
	assertEquals(s3,s4);
	assertEquals(s1,s2);
	//equals means just campare the content..not reference
	//assertNotEquals(s3,s4);//fail
	//assertNotEquals(s1,s2);//fail
	assertSame(s1,s2);
	//same means just compare the reference and content
	//assertSame(s3,s4);//fail
	//assertNotSame(s1,s2);//fail
	assertNotSame(s3,s4);
	assertArrayEquals(a1,a2);
	equals(var>var1);
	equals(var<var1);
	//assertNotNull(s5);//fail
	assertNull(s5);
	//assertTrue(var>var1);//fail
	assertTrue(var<var1);
	}

}