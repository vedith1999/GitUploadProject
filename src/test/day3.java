package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClassExecution() {
		System.out.println("This is executed before any method in day3 class");
	}
	
	@AfterClass
	public void afterClassExecution() {
		System.out.println("This is executed after all classes in day 3 class");
	}
	
	@BeforeMethod
	public void beforeTestExecution() {
		System.out.println("I'll execute before every method in day3 class");
	}
	
	@AfterMethod
	public void afterTestExecution() {
		System.out.println("I'll execute after every method in day3 class");
	}
	
	@Test(groups= {"Smoke"})
	public void WebLoginCar() {
		//selenium
		System.out.println("WebLoginCar");
	}
	
	@Test(enabled=false)
	public void MobileLoginCar() {
		//Appium
		System.out.println("MobileLoginCar");
	}
	
	@Parameters({"URL", "APIKey/Username"})
	@Test(timeOut=4000)
	public void MobileSignInCar(String urlName, String Key) {
		//Appium
		System.out.println("MobileCarSignInCar");
		System.out.println(urlName);
		System.out.println(Key);
	}
	
	@Test(dataProvider="getData")
	public void MobileSignOutCar(String username, String password) {
		//Appium
		System.out.println("MobileSignOutCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"MobileSignInCar","MobileSignOutCar"})
	public void LoginAPICar() {
		//Rest API Automation
		System.out.println("LoginAPICar");
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]= "firstUserName";
		data[0][1]= "firstPwd";
		
		data[1][0]= "secondUserName";
		data[1][1]= "secondUserNamePwd";
		
		data[2][0]= "thirdUserName";
		data[2][1]= "thirdPwd";
		
		return data;
	}
}
