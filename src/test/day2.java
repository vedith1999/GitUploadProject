package test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = { "Smoke" })
	public void ploan() {
		System.out.println("good");
	}

	@BeforeTest
	public void firstExecution() {
		System.out.println("I'll execute First");
	}

	@BeforeSuite
	public void beforeSuitExecution() {
		System.out.println("I'll execute before suite");
		//Below lines are added by US guy
				System.out.println("US Guy line");	
	}
	
	

	@Parameters({ "URL" })

	@Test
	public void demo2(String urlName) {

		System.out.println("byePersonalLoan");
		System.out.println(urlName);
		Assert.assertTrue(false);
	}

}
