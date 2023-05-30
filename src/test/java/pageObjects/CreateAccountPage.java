package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage
{

	public CreateAccountPage(WebDriver driver) 
	{
		super(driver);	
	}
	
	//Elements
	@FindBy(xpath="//input[@placeholder='Enter Your First And Last Name']") WebElement TxtFullName;
	@FindBy(xpath="//input[@placeholder='Enter Your Job Title']") WebElement TxtJobTitle;
	@FindBy(xpath="//li[@class='ant-select-search ant-select-search--inline']") WebElement TxtCountry;
	@FindBy(xpath="//input[@class='ant-input ant-select-search__field']") WebElement sendCtryText;
	@FindBy(xpath="//div[contains(@class,'ant-select-dropdown')]//ul[@role='listbox']//li") List<WebElement> SelectCountry;
	
	
	@FindBy(xpath="//*[@id=\"body-content\"]/div/div/div/div/div[3]/div/div/div[2]/form/div[3]/div/div/span/div/div[3]/div/div[2]/div/span/div[1]/div/div/ul/li/div/input") WebElement clickLocation;
	@FindBy(xpath="//div[normalize-space()='City, State']") WebElement sendLocText;
	@FindBy(xpath="//ul[@role='listbox']//li") List<WebElement> SelectLocation;
	
	
	@FindBy(xpath="//input[@placeholder='ex. yourname@email.com'])") WebElement TxtEmailId;
	@FindBy(xpath="//input[@placeholder='Enter A Strong Password'])") WebElement TxtPassword;
	@FindBy(xpath="//input[@type='checkbox']") WebElement TAndCCheckbox;
	@FindBy(xpath="//button[@class='ant-btn continue-to-pass-creation-btn']") WebElement BtnVerifyYourAccount;
	@FindBy(xpath="//h3[@class='verify-your-account']") WebElement TxtMsgVerify;
	
	//Action Methods
	public void setName(String FullName)
	{
		TxtFullName.sendKeys(FullName);
	}
	
	public void setJobTitle(String JobTitle)
	{
		TxtJobTitle.sendKeys(JobTitle);
	}
	
	public void clickCountry()
	{
		TxtCountry.click();
	}
	
	public void SendCountryText(String ctryText)
	{
		sendCtryText.sendKeys(ctryText);
	}
	
	public void setCountry()
	{
		for(WebElement x:SelectCountry)
		{
			String Ind=x.getText();
			
			if(Ind.equals("India")) 
			  {
				  x.click(); 
			  } 
		}
		
	}
	
	public void clickOnLocation()
	{
		clickLocation.click();
	}
	
	public void SendLocText(String locText)
	{
		sendLocText.sendKeys(locText);
	}
	
	public void setLocation()
	{
		for(WebElement x:SelectLocation)
		{
			String Ind=x.getText();
			
			if(Ind.equals("Hyderabad, Telangana")) 
			  {
				  x.click(); 
			  } 
		}
		
	}
	
	public void setEmail(String Email)
	{
		TxtEmailId.sendKeys(Email);
	}
	
	public void setPassword(String Password)
	{
		TxtPassword.sendKeys(Password);
	}
	
	public void clickCheckbox()
	{
		TAndCCheckbox.click();;
	}
	
	public void clickVerifyAccount()
	{
		BtnVerifyYourAccount.click();;
	}
	
	public boolean textVerification()
	{
		
		return TxtMsgVerify.isDisplayed();
	}
	
	
	
}
