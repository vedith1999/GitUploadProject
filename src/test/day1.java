package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@AfterSuite
	public void afterSuiteExecution() {
		System.out.println("I'll execute after Suite");
	}
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I'll execute last");
	}
	
	@Test(groups= {"Smoke"})
	public void demo() {
		
		System.out.println("hello");
		
	}
	@Parameters({"URL"})
	@Test
	public void demo1(String urlName) {
		
		System.out.println("byePersonalLoan");
		System.out.println(urlName);
	}
}
