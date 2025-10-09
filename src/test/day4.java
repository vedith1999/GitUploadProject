package test;

import org.testng.annotations.Test;

public class day4 {
	@Test
	public void WebLoginHome() {
		//selenium
		System.out.println("WebLoginHome");
	}
	
	@Test
	public void MobileLoginHome() {
		//Appium
		System.out.println("MobileLoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void LoginAPIHome() {
		//Rest API Automation
		System.out.println("LoginAPIHome");
	}
	
	
}
