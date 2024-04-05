package Day15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class --Page Factory
public class loginPage2 {
	WebDriver driver; //global
	//constructor 
	
	loginPage2(WebDriver driver)  //chrome,edge
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	//locate Elements	
	@FindBy(css="img[alt='company-branding']")
	WebElement logo;
	
	@FindBy(name="username")
	WebElement user_name;
	
	@FindBy(name="password")
	WebElement pass_word;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickbutton;
	
	
	//actions	
	public void setUserName(String usernam)
	{
		user_name.sendKeys(usernam);

	}
	
	public void setPasswdName(String passd)
	{
		pass_word.sendKeys(passd);

	}
	
	public void clickSubmit()
	{
		clickbutton.click();

	}
	
	public boolean checkLogo()
	{
		boolean status =logo.isDisplayed();
		return status;
	}	
	
}
