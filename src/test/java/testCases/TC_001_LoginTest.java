package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass
{

	@Test
	public void test_Login()
	{
		try 
		{
			logger.info("*** Starting TC_001_LoginTest ***");
			LoginPage lp= new LoginPage(driver);

			lp.setUserEmail(rb.getString("email"));

			logger.info("Entered Email");
			lp.setUserPassword(rb.getString("password"));
			logger.info("Entered Password");

			lp.clickLogin();
			logger.info("Login Clicked");

			MyAccount ma = new MyAccount(driver);
			boolean prPicVis=ma.MuseLogoVisibility();

			Assert.assertEquals(prPicVis, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}

}
