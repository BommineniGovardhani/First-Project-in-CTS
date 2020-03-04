package demo;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Result res=JUnitCore.runClasses(CalTest.class);
for(Failure fa:res.getFailures()){
	System.out.println("Fail:"+fa);
	
}
System.out.println("sucess:"+res.wasSuccessful());

TestSuite suite=new TestSuite(AssertTest1.class,DivTest.class);
TestResult r=new TestResult();
suite.run(r);
System.out.println("no. of test cases"+r.runCount());

	}

}
