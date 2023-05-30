package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements
	@FindBy(name="username") WebElement TxtUEmail;
	@FindBy(name="password") WebElement TxtUPassword;
	@FindBy(xpath="//button[@type='submit']") WebElement BtnLogin;	
	@FindBy(xpath="//button[@type='button']") WebElement BtnCreateAccount;
	
	//Action Methods
	
	public void setUserEmail(String UserEmail)
	{
		TxtUEmail.sendKeys(UserEmail);
	}
	
	public void setUserPassword(String Password)
	{
		TxtUPassword.sendKeys(Password);
	}
 	
	public void clickLogin()
	{
		BtnLogin.click();
	}
	
	public void clickCreateAccount()
	{
		BtnCreateAccount.click();
	}
	
}
