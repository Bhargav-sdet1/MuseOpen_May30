package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CreateAccountPage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_CreateAccountTest extends BaseClass
{
	@Test
	public void CreateAccount() throws InterruptedException 
	{
		
			LoginPage lp1= new LoginPage(driver);
			lp1.clickCreateAccount();

			CreateAccountPage cap = new CreateAccountPage(driver);

			cap.setName("Bhargav");
			cap.setJobTitle("Software Test Engineer");
			cap.clickCountry();
			cap.SendCountryText("Ind");
			cap.setCountry();
			Thread.sleep(3000);
			cap.clickOnLocation();
			cap.SendLocText("Hyd");
			cap.setLocation();
			cap.setEmail(randomString()+"@yopmail.com");
			cap.setPassword("Asdfg1@34");
			cap.clickCheckbox();
			cap.clickVerifyAccount();

			Assert.assertEquals(cap.textVerification(), true);
		
		
	}
}
