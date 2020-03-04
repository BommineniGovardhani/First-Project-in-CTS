package demo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterizedTest1 {
	int e;
	int a;
	

	public ParameterizedTest1(int e, int a) {
		super();
		this.e = e;
		this.a = a;
		System.out.println("const:"+e+"actual"+a);
	}
	@Parameters
public static Collection<Object[]> add12(){
	return Arrays.asList(new Object[][]
			{
		{4,2},{9,3},{16,4}
			});
}

	@Test
	//public void test() {
		public void sum()
		{
			Calc g=new Calc();
			//assertEquals(e,g.taxcal(a));
	assertEquals(e,g.taxcal(a));
		}
	
	
		
	}
	

