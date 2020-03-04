package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Junit_New {
	Sample s1=new Sample();

	@Test
	public void test12() {
	s1.setSid(101);
	s1.setName("gova");
	assertEquals(101,s1.getSid());
	assertEquals("gova",s1.getName());
	}

}
