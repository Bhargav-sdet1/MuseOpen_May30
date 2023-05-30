package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

	public MyAccount(WebDriver driver) {
		super(driver);		
	}
	
	@FindBy(xpath="//i[@class='anticon Aryaprofileheaderlogo']") WebElement MuseLogo;
	@FindBy(xpath="//div[@class='ant-popover-open']//img[@class='headerprofilepic']") WebElement ProfilePicDD;
	@FindBy(xpath="//span[@role='menuitem']") WebElement MuseLogout;
	
	public boolean MuseLogoVisibility()
	{
		try {
		return MuseLogo.isDisplayed();
		}
		catch(Exception e)
		{
			return (false);
		}
	}
	
	public void clickProfilePicDD()
	{
		ProfilePicDD.click();
	}
	
	public void clickLogout()
	{
		MuseLogout.click();
	}
}
